package com.company.project.commom;

import lombok.Data;

/**
 * 统一数据返回类型
 * 一般来说直接调用静态方法就行，也可以自定义。
 */

@Data
public class ApiResponse {
    private int code;
    private String message;
    private Object data;

    public ApiResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public ApiResponse(){
        this.code = Status.SUCCESS.getCode();
        this.message = Status.SUCCESS.getStandardMessage();
    }

    public static ApiResponse ofMessage(int code,String message){
        return new ApiResponse(code,message,null);
    }

    public static ApiResponse ofSuccess(Object data){
        return new ApiResponse(Status.SUCCESS.getCode(), Status.SUCCESS.getStandardMessage(),data);
    }

    public static ApiResponse ofSuccessOnlyMessage(String message){
        return new ApiResponse(Status.SUCCESS.getCode(), message,null);
    }

    public static ApiResponse ofFail(String message){
        return new ApiResponse(Status.FAIL.getCode(),message,null);
    }
    public static ApiResponse ofError(String message){
        return new ApiResponse(Status.INTERNAL_SERVER_ERROR.getCode(),message,null);
    }
    public static ApiResponse ofUnauthorized(String message){
        return new ApiResponse(Status.UNAUTHORIZED.getCode(),message,null);
    }
    public static ApiResponse ofStatus(Status status){
        return new ApiResponse(status.getCode(),status.getStandardMessage(),null);
    }

    public enum Status{
        //一些状态码的描述
        INTERNAL_SERVER_ERROR(500,"INTERNAL_SERVER_ERROR"),
        SUCCESS(200,"SUCCESS"),//成功
        FAIL(400,"FAIL"),//失败
        UNAUTHORIZED(401,"UNAUTHORIZED"),//未认证（签名错误）
        NOT_FOUND(404,"NOT_FOUND");//接口不存在
        private int code;
        private String standardMessage;

        Status(int code, String standardMessage) {
            this.code = code;
            this.standardMessage = standardMessage;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }

        public String getStandardMessage() {
            return standardMessage;
        }

        public void setStandardMessage(String standardMessage) {
            this.standardMessage = standardMessage;
        }
    }
}
