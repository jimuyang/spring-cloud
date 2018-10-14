package muyi.cater.order.controller;

import muyi.cater.order.domain.dto.TOrderForm;
import muyi.common.BusinessException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.provider.certpath.BuildStep;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 * @date: 2018/10/14 下午11:23
 */
@RestController
@RequestMapping("/order")
public class OrderController {


    @PostMapping("/create")
    public void create(@RequestBody TOrderForm tOrderForm) throws BusinessException {


    }
}
