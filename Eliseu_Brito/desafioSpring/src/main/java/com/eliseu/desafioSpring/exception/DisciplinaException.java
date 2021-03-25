package com.eliseu.desafioSpring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class DisciplinaException extends RuntimeException {

    public static final String MESSAGE_STANDARD = "Id não encontrado";

    public static final String MESSAGE_ID_INFORMADO = "Id contido no payload. O Id é gerado automaticamente e não deve ser informado no body da request!!!";

    public DisciplinaException(String typeObject, String action, Long id) {
        super(String.format(MESSAGE_STANDARD, typeObject, action, id));
    }

    public DisciplinaException(String typeObject, String action) {
        super(String.format(MESSAGE_ID_INFORMADO, typeObject, action));
    }

}
