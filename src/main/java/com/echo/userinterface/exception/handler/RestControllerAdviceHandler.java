package com.echo.userinterface.exception.handler;

import com.echo.domain.entities.dto.ErrorDetail;
import com.echo.userinterface.exception.InternalServerErrorException;
import com.echo.userinterface.exception.InvalidFieldException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@ControllerAdvice
public class RestControllerAdviceHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<Object> handleInternalServerError(Exception ex, WebRequest request) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        ErrorDetail apiError = ErrorDetail.builder().requestDateTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))).code(status.toString()).title(ex.getMessage()).detail(ex.getCause().toString()).build();
        return handleExceptionInternal(ex, apiError, new HttpHeaders(), status, request);
    }

    @ExceptionHandler(InvalidFieldException.class)
    @ResponseBody
    public ResponseEntity<Object> handleInvalidFieldException(InvalidFieldException ex, WebRequest request) {
        HttpStatus status = HttpStatus.BAD_REQUEST;
        ErrorDetail apiError = ErrorDetail.builder().requestDateTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))).code(status.toString()).title(ex.getMessage()).detail(ex.getCause().toString()).build();
        return handleExceptionInternal(ex, apiError, new HttpHeaders(), status, request);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleUncaught(Exception ex, WebRequest request) {
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        ErrorDetail apiError = ErrorDetail.builder().requestDateTime(LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"))).code(status.toString()).title(ex.getMessage()).detail(ex.getCause().toString()).build();
        return handleExceptionInternal(ex, apiError, new HttpHeaders(), status, request);
    }
}
