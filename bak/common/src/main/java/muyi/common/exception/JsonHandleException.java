package muyi.common.exception;

import lombok.Data;
import org.apache.logging.log4j.util.Strings;

/**
 * @author: Jimu Yang
 * @date: 2018/10/20 上午11:49
 * @desc: want more.
 */
public class JsonHandleException extends RuntimeException {

    private Object sourceObject;

    private String sourceJson;

    public JsonHandleException(Object sourceObject, String message) {
        super(message);
        this.sourceObject = sourceObject;
    }

    public JsonHandleException(Object sourceObject) {
        super();
        this.sourceObject = sourceObject;
    }

    public JsonHandleException(String sourceJson, String message) {
        super(message);
        this.sourceJson = sourceJson;
    }

    public JsonHandleException(String sourceJson) {
        super();
        this.sourceJson = sourceJson;
    }

    @Override
    public String getMessage() {
        if (Strings.isNotBlank(this.sourceJson)) {
            return "JSON parse failed. source json is: " + this.sourceJson;
        } else if (this.sourceObject != null) {
            return "JSON serialization failed. source object is: " + this.sourceObject.toString();
        }
        return "JSON handle failed.";
    }
}
