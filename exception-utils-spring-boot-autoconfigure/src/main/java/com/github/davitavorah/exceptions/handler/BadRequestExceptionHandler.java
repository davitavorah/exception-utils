package com.github.davitavorah.exceptions.handler;

import com.github.davitavorah.exceptions.model.APIError;
import com.github.davitavorah.exceptions.model.BadRequestException;
import com.github.davitavorah.exceptions.model.enums.ExceptionType;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class BadRequestExceptionHandler {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(BadRequestException.class)
    public APIError handleBadRequestException(BadRequestException exception) {
        return APIError.builder().message(exception.getMessage()).type(ExceptionType.ERROR).build();
    }

}
