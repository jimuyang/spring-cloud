package muyi.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author: Jimu Yang
 * @date: 2018/10/20 下午12:06
 * @desc: want more.
 */
@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 业务异常全局处理
     *
     * @param request
     * @param be
     * @return
     * @throws Exception
     */
    @ExceptionHandler(BusinessException.class)
    public RestResponseData businessExceptionHandler(HttpServletRequest request, BusinessException be) throws Exception {
        log.error("BusinessException occur and caught by global handler: {}, {}", be.getCode(), be.getMessage());

        RestResponseData restResponseData = new RestResponseData();
        restResponseData.setCode(be.getCode());
        restResponseData.setMessage(be.getMessage());
        restResponseData.setData(be.getCause());
        return restResponseData;
    }

    /**
     * 异常全局处理 兜底方案
     *
     * @param request
     * @param e
     * @return
     * @throws Exception
     */
    @ExceptionHandler(Exception.class)
    public RestResponseData allExceptionHandler(HttpServletRequest request, Exception e) throws Exception {
        log.error("Exception occur and caught by global handler: {}, {}", e.getClass().getSimpleName(), e.getMessage());

        RestResponseData restResponseData = new RestResponseData();
        restResponseData.setCode(ReturnCode.SYSTEM_ERROR.getCode());
        restResponseData.setMessage(e.getMessage());
        restResponseData.setData(e.getCause());
        return restResponseData;
    }
}
