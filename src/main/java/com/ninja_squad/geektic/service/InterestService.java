package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.dao.InterestDao;
import com.ninja_squad.geektic.domain.Interest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jordan on 29/06/15.
 */
@Service
public class InterestService {

    private InterestDao interestDao;

    public InterestService() {
    }

    public List<Interest> findAll() {
        List<Interest> list = new ArrayList<Interest>();

        Interest i1  = new Interest();
        i1.setId(0);
        i1.setValue("Java");

        Interest i2 = new Interest();
        i2.setId(1);
        i2.setValue("PHP");

        list.add(i1);
        list.add(i2);

        return list;
    }

    /*public List<Interest> findById(long id) {
    }*/


}
