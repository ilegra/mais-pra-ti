package com.maisprati.desafiospring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BadRequestException extends RuntimeException {

    public static final String MESSAGE_ID = "Erro ao %s objeto do tipo %s pois" +
            " não há nenhum registro com o ID: %s.";

    public BadRequestException(String action, String typeObject, Long id) {
        super(String.format(MESSAGE_ID, action, typeObject, id));
    }

}
