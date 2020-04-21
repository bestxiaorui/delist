package com.company.project.commom;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

/**
 * @author xiaorui
 * 对RestController返回结果统一包装
 */
@Slf4j
@RestControllerAdvice(basePackages = {"com.company.project"})
public class ResponseControllerAdvice implements ResponseBodyAdvice<Object> {
    @Override
    public boolean supports(MethodParameter returnType, @NonNull Class<? extends HttpMessageConverter<?>>  aClass) {
        return !returnType.getGenericParameterType().equals(ApiResponse.class);
    }


    @Override
    public Object beforeBodyWrite(Object o, MethodParameter returnType,@NonNull MediaType mediaType,@NonNull Class<? extends HttpMessageConverter<?>> aClass,@NonNull ServerHttpRequest serverHttpRequest,@NonNull ServerHttpResponse serverHttpResponse) {
        if(returnType.getGenericParameterType().equals(String.class)){
            ObjectMapper objectMapper = new ObjectMapper();
            try {
                return objectMapper.writeValueAsString(ApiResponse.ofSuccess(o));
            } catch (JsonProcessingException e) {
                throw new ServiceException("返回String类型出错");
            }
        }
        return ApiResponse.ofSuccess(o);
    }
}
