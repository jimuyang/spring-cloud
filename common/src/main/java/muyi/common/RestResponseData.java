package muyi.common;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@Data
public class RestResponseData {

    private int code;

    private String message;

    private Object data;

    public RestResponseData() {
    }

    public RestResponseData(IReturnCode returnCode) {
        this.code = returnCode.getCode();
        this.message = returnCode.getMessage();
    }

    public RestResponseData(BusinessException be) {
        this.code = be.getCode();
        this.message = be.getMessage();
    }

}
