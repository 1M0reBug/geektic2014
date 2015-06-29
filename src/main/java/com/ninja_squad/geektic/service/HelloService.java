package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Fake service just to test that everything works fine
 * @author JB Nizet
 */
@RestController
@Transactional
@RequestMapping("/api/hello")
public class HelloService {

    @RequestMapping(method = GET)
    public HelloMessage sayHello() {
        return new HelloMessage();
    }

    @RequestMapping(value = "/users", method = GET)
    public List<User> listFakeUsers() {
        User u1 = new User();
        u1.setAge(23);
        u1.setName("Carlos");
        u1.setSurname("Antonio");

        User u2 = new User();
        u2.setAge(24);
        u2.setName("Michu");
        u2.setSurname("Jeanette");

        List<User> list = new ArrayList<User>();
        list.add(u1);
        list.add(u2);

        return list;
    }
}
