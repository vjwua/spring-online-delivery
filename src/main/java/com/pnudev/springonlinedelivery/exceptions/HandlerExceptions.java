package com.pnudev.springonlinedelivery.exceptions;

import jakarta.persistence.EntityNotFoundException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "com.pnudev.springonlinedelivery.controllers")
public class HandlerExceptions {
    @ExceptionHandler(value = {EntityNotFoundException.class})
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public ErrorResponse handleEntityNotFoundException(@NotNull HttpServletRequest request, EntityNotFoundException exception){
        return new ErrorResponse(request.getRequestURI(), exception.getMessage());
    }

    @ExceptionHandler(value = {Exception.class})
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public ErrorResponse handleException(@NotNull HttpServletRequest request, Exception exception){
        return new ErrorResponse(request.getRequestURI(), exception.getMessage());
    }
}
