package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.dao.InterestDao;
import com.ninja_squad.geektic.domain.Interest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jordan on 29/06/15.
 */
@Service
public class InterestService {

    private InterestDao interestDao;

    @Autowired
    public InterestService(InterestDao dao) {
        interestDao = dao;
    }

    public List<Interest> findAll() {
        return interestDao.listAll();
    }

    /*public List<Interest> findById(long id) {
    }*/


}
