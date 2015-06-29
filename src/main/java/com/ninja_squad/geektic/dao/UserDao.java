package com.ninja_squad.geektic.dao;

import com.ninja_squad.geektic.domain.Sex;
import com.ninja_squad.geektic.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by jordan on 29/06/15.
 */
@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager em;

    public List<User> findAll() {

        int max = 20;
        int page = 0;

        String jpql;
        jpql = "Select u FROM User AS u order by u.name";
        TypedQuery<User> query = em.createQuery(jpql, User.class).setMaxResults(max).setFirstResult(max * page);

        return query.getResultList();
    }

    public List<User> findByInterestsValuesAndSex(String[] array) {

        /* SELECT name, surname, value
           from USER u JOIN USER_INTERESTS ui ON ui.user_id = u.id
                       JOIN INTEREST i ON i.id = ui.id WHERE i.value = `$value`;
         */
        /*if(sex.equals("all")){
            sex = "%";
        }*/

        List<User> list = new ArrayList<>();
        String jpql = "Select distinct u FROM User u LEFT JOIN u.interests int WHERE int.value in :value"; // AND u.sex LIKE :sex
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setParameter("value", Arrays.asList(array)); //.setParameter("sex", sex);
        list.addAll(query.getResultList());

        return list;

    }
}
