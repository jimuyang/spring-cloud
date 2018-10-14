package muyi.common;

import lombok.Data;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@Data
public class BusinessException extends Exception {

    private int code;

    public BusinessException(int code) {
        super();
        this.code = code;
    }

    public BusinessException(int code, String message) {
        super(message);
        this.code = code;
    }

    public BusinessException(int code, String message, Throwable t) {
        super(message, t);
        this.code = code;
    }

    public BusinessException(IReturnCode returnCode) {
        super(returnCode.getMessage());
        this.code = returnCode.getCode();
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
//        return super.fillInStackTrace();
        return this;
    }
}