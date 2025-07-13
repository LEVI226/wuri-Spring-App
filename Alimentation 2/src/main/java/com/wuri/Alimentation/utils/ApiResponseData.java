package com.wuri.Alimentation.utils;


import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ApiResponseData<T> {
    private String timestamp;
    private int status;
    private String error;
    private String message;
    private T data;
}
