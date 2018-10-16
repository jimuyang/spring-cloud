package muyi.cater.order.controller;

import muyi.cater.order.domain.dto.TCreateOrder;
import muyi.common.BusinessException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public void create(@RequestBody TCreateOrder tCreateOrder) throws BusinessException {


    }
}
