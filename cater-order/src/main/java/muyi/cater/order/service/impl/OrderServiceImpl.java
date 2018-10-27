package muyi.cater.order.service.impl;

import muyi.cater.order.dao.OrderDao;
import muyi.cater.order.domain.dto.TCreateOrder;
import muyi.cater.order.domain.model.MOrder;
import muyi.cater.order.enums.OrderStatusEnum;
import muyi.cater.order.service.OrderService;
import muyi.cater.order.utils.OrderIdGenerator;
import muyi.common.BusinessException;
import muyi.common.ReturnCode;
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

    /**
     * 创建订单
     */
    @Override
    public Long createOrder(TCreateOrder tCreateOrder) throws BusinessException {
        //1. 查询商品信息
        //2. 检查库存
        //3. 计算总价
        //4. 扣减库存
        //5. 订单入库

        MOrder mOrder = new MOrder();
        // 订单id此时生成
        mOrder.setId(OrderIdGenerator.genOrderId());
        mOrder.setAddress(tCreateOrder.getAddress());
        mOrder.setShopId(tCreateOrder.getShopId());
        mOrder.setMobile(tCreateOrder.getMobile());
        mOrder.setUserId(tCreateOrder.getUserId());
        mOrder.setUserName(tCreateOrder.getUserName());
        mOrder.setStatus(OrderStatusEnum.NEW.getCode());

        int affect = this.orderDao.insertOrder(mOrder);
        if (affect != 1) {
            throw new BusinessException(ReturnCode.DB_WRITE_ERROR);
        }
        return mOrder.getId();
    }






}
