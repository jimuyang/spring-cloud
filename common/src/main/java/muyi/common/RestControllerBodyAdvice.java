package muyi.common;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import muyi.common.util.JSON;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 * @date: 2018/10/19 下午11:23
 */
@Slf4j
@RestControllerAdvice
public class RestControllerBodyAdvice implements ResponseBodyAdvice {


    @Override
    public boolean supports(MethodParameter returnType, Class converterType) {
        // 全局异常处理的结果不需要转化
        if (returnType.getMethodAnnotation(ExceptionHandler.class) == null) {
            return true;
        }
        return false;
    }

    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        log.info("Origin return data: {}", JSON.toJson(body));
        RestResponseData restResponseData = new RestResponseData();
        restResponseData.setCode(ReturnCode.SUCCESS.getCode());
        restResponseData.setMessage(ReturnCode.SUCCESS.getMessage());
        restResponseData.setData(body);
        // 解决返回类型为String时的问题
        if (String.class.equals(returnType.getMethod().getReturnType())) {
            return JSON.toJson(restResponseData);
        }
        return restResponseData;
    }
}
