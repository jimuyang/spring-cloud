package cloud.waimai.service.sun.controller;

import cloud.waimai.service.sun.iface.PingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Yang Fan
 * @date: 2019-04-10
 * @desc:
 */
@RestController
public class PingController {

    @Autowired
    private PingService pingService;

    @GetMapping("/ping")
    public String ping() {
        return pingService.ping();
    }
}
