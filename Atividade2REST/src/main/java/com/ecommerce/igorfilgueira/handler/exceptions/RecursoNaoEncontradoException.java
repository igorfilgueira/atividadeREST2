package com.ecommerce.igorfilgueira.handler.exceptions;

public class RecursoNaoEncontradoException extends  RuntimeException{

    public RecursoNaoEncontradoException(String mensagem){
        super(mensagem);
    }

    public RecursoNaoEncontradoException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}

