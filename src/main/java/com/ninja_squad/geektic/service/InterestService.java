package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.dao.InterestDao;
import com.ninja_squad.geektic.domain.Interest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by jordan on 29/06/15.
 */
@RestController
@RequestMapping("/api/interests")
@Service
public class InterestService {

    private InterestDao interestDao;

    @Autowired
    public InterestService(InterestDao dao) {
        interestDao = dao;
    }

    @RequestMapping(method = GET)
    public List<Interest> findAll() {
        return interestDao.listAll();
    }

    @RequestMapping(value="/{id}", method = GET)
    public List<Interest> findById(@PathVariable("id") long id) {
        return interestDao.listAll().stream().filter(i -> i.getId() == id).collect(Collectors.toList());
    }

    @RequestMapping(value="/value/{value}", method = GET)
    public List<Interest> findByValue(@PathVariable("value") String value) {
        return interestDao.listAll().stream().filter(i -> i.getValue().contains(value)).collect(Collectors.toList());
    }
}
