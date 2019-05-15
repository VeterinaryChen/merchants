package com.imooc.passbook.passbook.advice;

import com.imooc.passbook.passbook.Vo.ErrorInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * @author jeffchen
 * @Date: 2019/5/14 10:12
 * <h1> 全局异常处理 </h1>
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ErrorInfo<String> errorHandler(HttpServletRequest request,Exception e){

        ErrorInfo<String> errorInfo = new ErrorInfo<>();

        errorInfo.setCode(ErrorInfo.ERROR);
        errorInfo.setMessage(errorInfo.getMessage());
        errorInfo.setData("Do Not Have Return Data!");
        errorInfo.setUrl(request.getRequestURI().toString());

        return errorInfo;
    }

}
