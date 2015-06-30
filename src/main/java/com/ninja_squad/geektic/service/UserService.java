package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.dao.UserDao;
import com.ninja_squad.geektic.domain.Gender;
import com.ninja_squad.geektic.domain.User;
import com.ninja_squad.geektic.service.exceptions.GenderNotFound;
import com.ninja_squad.geektic.service.exceptions.IdNotFound;
import com.ninja_squad.geektic.service.exceptions.InterestNotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;


/**
 * Created by jordan on 29/06/15.
 */
@RestController
@Transactional
@RequestMapping("/api/users")
@Service
public class UserService {

    private UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> fakeFindAll() {
        User u1 = new User();
        u1.setAge(23);
        u1.setName("Carlos");
        u1.setSurname("Antonio");
        u1.setGender(Gender.HOMME);

        User u2 = new User();
        u2.setAge(24);
        u2.setName("Michu");
        u2.setSurname("Jeanette");
        u2.setGender(Gender.FEMME);

        List<User> list = new ArrayList<User>();
        list.add(u1);
        list.add(u2);

        return list;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll(@RequestParam(value = "interest", required = false) Set<String> interests,
                              @RequestParam(value = "gender", required = false) Gender gender) {


        if (interests == null && gender == null) {
            return userDao.findAll();
        } else if (gender == null) {

            return userDao.findByInterestsValues(interests);
        } else if (interests == null) {

            return userDao.findByGender(gender);
        } else {

            return userDao.findByInterestsValuesAndGender(interests, gender);
        }
    }


    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") long id) {
        List<User> user = userDao.findById(id);
        if (!user.isEmpty()) {
            return user.get(0);
        }
        throw new IdNotFound("l'utilisateur avec l'id" + id + "n'existe pas");
    }
}
