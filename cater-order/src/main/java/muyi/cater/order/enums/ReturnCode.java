package muyi.cater.order.enums;

import lombok.Getter;
import muyi.common.IReturnCode;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 * @date: 2018/10/17 下午10:57
 */
@Getter
public enum ReturnCode implements IReturnCode {

    PARAM_ERROR("000001", "参数错误"),
    

    ;

    private String code;

    private String message;

    ReturnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
