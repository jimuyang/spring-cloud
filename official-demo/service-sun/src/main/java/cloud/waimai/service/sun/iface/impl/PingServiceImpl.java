package cloud.waimai.service.sun.iface.impl;

import cloud.waimai.service.sun.iface.PingService;
import org.springframework.stereotype.Service;

/**
 * @author: Yang Fan
 * @date: 2019-04-10
 * @desc:
 */
@Service
public class PingServiceImpl implements PingService {

    @Override
    public String ping() {
        return "sun: pong";
    }
}
