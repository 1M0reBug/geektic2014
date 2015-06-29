package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.dao.UserDao;
import com.ninja_squad.geektic.domain.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jordan on 29/06/15.
 */
@Service
public class UserService {

    private UserDao userDao;

    public UserService() {
    }

    public List<User> findAll() {
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
