package muyi.cater.order.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

/**
 * @author: Jimu Yang
 * @date: 2018/10/27 下午10:56
 * @descricption: want more.
 */
@RestController
@Slf4j
public class ClientController {

    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 第一种方式 使用restTemplate, 写死ip
     */
    @GetMapping("/test1")
    public String test1() {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject("http://localhost:8082/goods/message", String.class);
        log.info("response = {} ", response);
        return response;
    }

    /**
     * 使用loadBalancerClient获取目标appid的url和端口
     */
    @GetMapping("/test2")
    public String test2() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("CATER.RESTAURANT");
        String url = String.format("http://%s:%s", serviceInstance.getHost(), serviceInstance.getPort()) + "/goods/message";

        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(url, String.class);
        log.info("response = {} ", response);
        return response;
    }



    /**
     * 使用@LoadBalanced注解
     * 神奇的是现在可以使用appid在url里
     */
    @GetMapping("/test3")
    public String test3() {
        return restTemplate.getForObject("http://CATER.RESTAURANT/goods/message", String.class);
    }


}
