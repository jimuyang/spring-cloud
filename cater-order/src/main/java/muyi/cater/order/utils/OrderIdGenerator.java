package muyi.cater.order.utils;

import java.util.Random;

/**
 * @author: Jimu Yang
 * @date: 2018/10/23 上午12:03
 * @descricption: want more.
 */
public class OrderIdGenerator {

    /**
     * 生成唯一的订单id
     * 格式：时间 + 随机数 (简单模拟)
     */
    public static synchronized Long genOrderId() {
        Random random = new Random();
        long randLong = (long) (random.nextInt(900000) + 100000);
        return System.currentTimeMillis() + randLong;
    }


}
