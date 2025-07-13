package com.wuri.Alimentation.utils;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;

public class ResponseBuilder {
    // Méthode générique pour construire une réponse standardisée
    public static <T> ResponseEntity<ApiResponseData<T>> buildResponseEntity(HttpStatus status, String message, T data) {
        ApiResponseData<T> response = new ApiResponseData<>();
        response.setTimestamp(LocalDateTime.now().toString());
        response.setStatus(status.value());
        response.setError(status.getReasonPhrase());
        response.setMessage(message);
        response.setData(data);
        return new ResponseEntity<>(response, status);
    }
}
