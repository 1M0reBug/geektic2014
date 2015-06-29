package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.domain.HelloMessage;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Fake service just to test that everything works fine
 * @author JB Nizet
 */
@Service
public class HelloService {

    public HelloMessage sayHello() {
        return new HelloMessage();
    }
}
