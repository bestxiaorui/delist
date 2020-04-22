package com.company.project.commom;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author xiaorui
 * RestController 异常统一拦截
 */
@RestControllerAdvice
@Slf4j
public class ExceptionControllerAdvice {
    /**
     * 自定义异常拦截
     * @param e ServiceException 异常
     * @return 统一数据返回
     */
    @ExceptionHandler(ServiceException.class)
    public ApiResponse serviceExceptionHandler(ServiceException e){
        log.error("捕获到ServiceException异常",e);

        return ApiResponse.ofFail(e.getMessage());
    }

    /**
     * validator 异常统一拦截
     * @param e validator 异常
     * @return 统一数据返回
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ApiResponse methodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e){
        log.error("捕获到MethodArgumentNotValidException异常",e);

        return ApiResponse.ofFail(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    }
//    /**
//     * 其他异常统一拦截
//     * @param e 异常
//     * @return 统一数据返回
//     */
//    public ApiResponse ExceptionHandler(Exception e){
//        log.error("捕获到其他异常",e);
//
//        return ApiResponse.fail(e.getMessage());
//    }


}
