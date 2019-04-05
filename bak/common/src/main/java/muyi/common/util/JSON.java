package muyi.common.util;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import muyi.common.exception.JsonHandleException;

import java.io.IOException;

/**
 * @author: Jimu Yang.
 * @date: 2018/10/19 下午11:33
 * @desc: want more.
 */
@Slf4j
public class JSON {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException jpe) {
            log.error("object convert to json failed: {}", object);
            return object.toString();
        }
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (IOException ie) {
            log.error("json parse failed: IOException caught.");
            throw new JsonHandleException(json);
        }
    }

}
