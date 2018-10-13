package muyi.cater.order;

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
public class WaimaiOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(WaimaiOrderApplication.class, args);
    }
}
