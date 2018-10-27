package muyi.common;

import lombok.Getter;

/**
 * @author: Jimu Yang
 * @date: 2018/10/20 下午12:01
 * @desc: want more.
 */
@Getter
public enum ReturnCode implements IReturnCode {
    SUCCESS("000000", "success"),

    DB_WRITE_ERROR("000001","写数据库出错"),

    SYSTEM_ERROR("999999", "系统内部错误"),

    ;


    private String code;

    private String message;

    ReturnCode(String code, String message) {
        this.code = code;
        this.message = message;
    }


}
