package com.maisprati.desafiospring.handler;

import com.maisprati.desafiospring.exception.BadRequestException;
import com.maisprati.desafiospring.exception.BadRequestExceptionDetails;
import com.maisprati.desafiospring.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class RestExceptionHandler {

    @Autowired
    private DateUtil dateUtil;

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<BadRequestExceptionDetails> handlerBadRequest(BadRequestException bre) {
        return new ResponseEntity<>(
                BadRequestExceptionDetails.builder()
                .timestamp(dateUtil.formatter(LocalDateTime.now()))
                .status(HttpStatus.BAD_REQUEST.value())
                .title("Bad Request Exception, check the documentation.")
                .details(bre.getMessage())
                .developerMessage(bre.getClass().getName())
                .build(), HttpStatus.BAD_REQUEST);
    }
}
