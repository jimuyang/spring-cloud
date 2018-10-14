package muyi.cater.order.service.impl;

import muyi.cater.order.dao.OrderDao;
import muyi.cater.order.service.OrderService;
import muyi.common.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 * @date: 2018/10/13 下午3:11
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void testOrder() throws BusinessException {


    }






}
