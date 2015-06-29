package com.ninja_squad.geektic.controller;

import com.ninja_squad.geektic.domain.User;
import com.ninja_squad.geektic.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by jordan on 29/06/15.
 */
@RestController
@Transactional
@RequestMapping("/api/users")
public class UserCtrl {

    @Autowired
    private UserService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll() {
        return service.findAll();
    }


}
