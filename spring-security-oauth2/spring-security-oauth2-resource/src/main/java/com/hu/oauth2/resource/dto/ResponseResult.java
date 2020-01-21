package com.hu.oauth2.resource.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.io.Serializable;
import java.util.List;

/**
 * @author coderHqr
 * @date 2020/1/21 16:41
 */
@Data
public class ResponseResult implements Serializable {
    public static final String RESULT_OK = "ok";
    public static final String RESULT_NOT_OK = "not_ok";
    public static final String SUCCESS = "成功操作";

    private String result;
    private Object data;
    private String success;
    private Cursor cursor;
    private List<Error> errors;

    public static ResponseResult ok() {
        return createResult(RESULT_OK, null, SUCCESS, null, null);
    }

    public static ResponseResult ok(String success) {
        return createResult(RESULT_OK, null, success, null, null);
    }

    public static ResponseResult ok(Object data) {
        return createResult(RESULT_OK, data, SUCCESS, null, null);
    }

    public static ResponseResult ok(Object data, Cursor cursor) {
        return createResult(RESULT_OK, data, SUCCESS, cursor, null);
    }

    public static ResponseResult notOk(List<ResponseResult.Error> errors) {
        return createResult(RESULT_NOT_OK, null, "", null, errors);
    }

    /**
     * @param result
     * @param data
     * @param success
     * @param cursor
     * @param errors
     * @return
     */
    private static ResponseResult createResult(String result, Object data, String success, Cursor cursor, List<Error> errors) {
        ResponseResult baseResult = new ResponseResult();
        baseResult.setResult(result);
        baseResult.setData(data);
        baseResult.setSuccess(success);
        baseResult.setCursor(cursor);
        baseResult.setErrors(errors);

        return baseResult;
    }

    @Data
    public static class Cursor {
        private int total;
        private int offset;
        private int limit;
    }

    @Data
    @AllArgsConstructor
    public static class Error {
        private String field;
        private String message;
    }
}
