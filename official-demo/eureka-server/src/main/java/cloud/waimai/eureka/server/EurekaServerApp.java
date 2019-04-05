package cloud.waimai.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: Yang Fan
 * @date: 2019-04-05
 * @desc:
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerApp {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(EurekaServerApp.class, args);
    }

}
