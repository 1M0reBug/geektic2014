package com.ninja_squad.geektic.controller;

import com.ninja_squad.geektic.domain.HelloMessage;
import com.ninja_squad.geektic.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.web.bind.annotation.RequestMethod.*;



/**
 * Created by jordan on 29/06/15.
 */
@RestController
@Transactional
@RequestMapping("/api/hello")
public class HelloCtrl {

    @Autowired
    private HelloService service;

    @RequestMapping(method = GET)
    public HelloMessage sayHello() {
        return service.sayHello();
    }
}
