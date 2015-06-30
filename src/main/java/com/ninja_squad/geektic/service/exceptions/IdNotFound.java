package com.ninja_squad.geektic.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by jordan on 29/06/15.
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND, reason = "No such User")
public class IdNotFound extends RuntimeException{
    public IdNotFound() {
        super();
    }

    public IdNotFound(String message) {
        super(message);
    }
}
