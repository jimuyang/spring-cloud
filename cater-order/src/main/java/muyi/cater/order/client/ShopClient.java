package muyi.cater.order.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: Jimu Yang
 * @date: 2018/10/28 2:47 PM
 * @descricption: want more.
 */
@FeignClient("CATER.SHOP")
public interface ShopClient {

    @GetMapping("/goods/message")
    String myGetMessage();

}
