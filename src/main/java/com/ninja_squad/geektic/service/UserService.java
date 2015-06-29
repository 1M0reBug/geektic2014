package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.dao.UserDao;
import com.ninja_squad.geektic.domain.Sex;
import com.ninja_squad.geektic.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


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
        u1.setSex(Sex.HOMME);

        User u2 = new User();
        u2.setAge(24);
        u2.setName("Michu");
        u2.setSurname("Jeanette");
        u2.setSex(Sex.FEMME);

        List<User> list = new ArrayList<User>();
        list.add(u1);
        list.add(u2);

        return list;
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<User> findAll(HttpServletRequest request) {

        String interests = request.getParameter("interests");

        if (interests == null) {
            return userDao.findAll();
        } else {
            String[] array;
            array = interests.split(",");
            List<User> list = userDao.findByInterestsValuesAndSex(array);
            if(list.isEmpty()) {
                throw new InterestNotFound();
            } else {
                return list;
            }
        }
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User findById(@PathVariable("id") long id) {
        Optional<User> opt = userDao.findAll().stream().filter(u -> u.getId() == id).findFirst();
        if (opt.isPresent()) {
            return opt.get();
        }
        throw new IdNotFound("l'utilisateur avec l'id" + id + "n'existe pas");
    }
}
