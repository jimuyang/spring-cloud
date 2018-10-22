package muyi.cater.shop.enums;

import lombok.Getter;
import muyi.common.IReturnCode;

/**
 * @author: Jimu Yang
 * @date: 2018/10/22 下午10:58
 * @descricption: want more.
 */
@Getter
public enum ReturnCode implements IReturnCode {

    UPDATE_DATABASE_FAILED("000001", "更新数据库失败"),

    GOODS_NOT_FOUND("001000", "商品不存在"),

    GOODS_LACK_STOCK("001001", "商品库存不足"),
    ;

    private String code;

    private String message;

    ReturnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
