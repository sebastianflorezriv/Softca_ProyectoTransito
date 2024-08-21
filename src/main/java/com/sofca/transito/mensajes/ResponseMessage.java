package com.sofca.transito.mensajes;

public record ResponseMessage<T> (

        int code,
        String message,
        T    data
){


}