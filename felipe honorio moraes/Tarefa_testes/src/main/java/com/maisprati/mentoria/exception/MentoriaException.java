package com.maisprati.mentoria.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class MentoriaException extends RuntimeException{

  public static final String MESSAGE_STANDARD = "Erro em objeto do tipo %s ao executar %s com id %s.";

  public static final String MESSAGE_INDEFINIDO = "indefinido";

  public MentoriaException(String typeObject, String action, Long id) {
    super(String.format(MESSAGE_STANDARD, typeObject, action, id));
  }

  public MentoriaException(String typeObject, String action) {
    super(String.format(MESSAGE_STANDARD, typeObject, action, MESSAGE_INDEFINIDO));
  }
}
