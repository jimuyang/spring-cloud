package muyi.spring.eureka.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "Hello World!";
    }
}
