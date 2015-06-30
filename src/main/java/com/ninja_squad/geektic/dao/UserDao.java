package com.ninja_squad.geektic.dao;

import com.ninja_squad.geektic.domain.Gender;
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

    public List<User> findById(long id) {
        String jpql = "Select u FROM User AS u where id = :id";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setParameter("id", id);

        return query.getResultList();
    }

    public List<User> findByInterestsValues(String[] array) {
        List<User> list = new ArrayList<>();
        String jpql = "Select distinct u FROM User u LEFT JOIN u.interests int WHERE int.value in :value";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setParameter("value", Arrays.asList(array));
        list.addAll(query.getResultList());

        return list;
    }

    public List<User> findByInterestsValuesAndGender(String[] array, Gender gender) {
        List<User> list = new ArrayList<>();
        String jpql = "Select distinct u FROM User u LEFT JOIN u.interests int WHERE u.gender LIKE :gender AND int.value in :value";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setParameter("value", Arrays.asList(array)).setParameter("gender", gender);
        list.addAll(query.getResultList());

        return list;
    }

    public List<User> findByGender(Gender gender) {
        List<User> list = new ArrayList<>();
        String jpql = "Select distinct u FROM User u LEFT JOIN u.interests int WHERE u.gender LIKE :gender";
        TypedQuery<User> query = em.createQuery(jpql, User.class);
        query.setParameter("gender", gender);
        list.addAll(query.getResultList());

        return list;
    }
}
