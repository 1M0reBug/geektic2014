package com.ninja_squad.geektic.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * Created by jordan on 29/06/15.
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND, reason = "No user has this interest")
public class InterestNotFound extends RuntimeException{
}
