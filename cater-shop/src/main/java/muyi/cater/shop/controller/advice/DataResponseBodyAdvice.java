package muyi.cater.shop.controller.advice;

import lombok.extern.slf4j.Slf4j;
import muyi.cater.shop.RestResponseData;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: Jimu Yang.
 */
@RestControllerAdvice
@Slf4j
public class DataResponseBodyAdvice implements ResponseBodyAdvice {

    /**
     * 确定是否应用本advice
     *
     * @param methodParameter
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class aClass) {
        return true;
    }


    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        log.info("original return 'object': {}", o);
        RestResponseData resp = new RestResponseData();
        resp.setCode(0);
        resp.setMessage("success");
        resp.setData(o);
        return resp;
    }
}
