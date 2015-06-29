package com.ninja_squad.geektic.controller;

import com.ninja_squad.geektic.domain.Interest;
import com.ninja_squad.geektic.service.InterestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.*;

/**
 * Created by jordan on 29/06/15.
 */
@RestController
@RequestMapping("/api/interests")
public class InterestCtrl {

    @Autowired
    private InterestService service;

    @RequestMapping(method = GET)
    public List<Interest> findAll() {
        return service.findAll();
    }
}
