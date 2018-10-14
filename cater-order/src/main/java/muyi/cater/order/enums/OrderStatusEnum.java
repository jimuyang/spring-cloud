package muyi.cater.order.enums;

import lombok.Getter;

/**
 * 订单状态枚举
 *
 * @author: Jimu Yang.
 * @date: 2018/10/13 下午2:29
 */
@Getter
public enum OrderStatusEnum {

    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCELED(2, "已取消");

    private int code;

    private String desc;

    OrderStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

}
