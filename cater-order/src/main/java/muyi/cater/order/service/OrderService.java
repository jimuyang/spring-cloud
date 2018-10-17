package muyi.cater.order.service;

import muyi.cater.order.domain.dto.TCreateOrder;
import muyi.common.BusinessException;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 * @date: 2018/10/13 下午3:14
 */
public interface OrderService {

    /**
     * 创建订单
     * @throws BusinessException
     */
    void createOrder(TCreateOrder tCreateOrder) throws BusinessException;
}
