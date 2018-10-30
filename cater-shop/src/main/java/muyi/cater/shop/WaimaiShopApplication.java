package muyi.cater.shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@SpringBootApplication
@EnableEurekaClient
//@ComponentScan({"muyi.cater.shop", "muyi.common"})
public class WaimaiShopApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaimaiShopApplication.class, args);
    }

}
