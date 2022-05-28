package com.example.demo.common;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseCommon<T> {
    private boolean success;
    private String message;
    private T data;

    public static <T> ResponseCommon<T> success(T data) {
        return new ResponseCommon<>(true, null, data);
    }

    public static <T> ResponseCommon<T> error(T data) {
        return new ResponseCommon<>(false, null, data);
    }

    public static <T> ResponseCommon<T> fail(String message) {
        return new ResponseCommon<>(false, message, null);
    }
}
