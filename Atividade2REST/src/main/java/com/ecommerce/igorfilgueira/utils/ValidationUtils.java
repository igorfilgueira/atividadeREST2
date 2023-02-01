package com.ecommerce.igorfilgueira.utils;


import com.ecommerce.igorfilgueira.handler.exceptions.ParametroInvalidoException;

public interface ValidationUtils {


    static void validateNotNullOrEmpty(String teste, String warning){
        if (teste.isBlank() || teste == null || teste.isEmpty()){
            throw new ParametroInvalidoException(warning);
        }
    }



}
