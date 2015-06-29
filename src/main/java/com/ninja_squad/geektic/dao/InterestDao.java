package com.ninja_squad.geektic.dao;

import com.ninja_squad.geektic.domain.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.stream.Stream;

/**
 * Created by jordan on 29/06/15.
 */
public class InterestDao {

    @PersistenceContext
    private EntityManager em;

    public Stream<User> listAll() {
        String jpql = "Select u FROM User AS u order by u.name";
        TypedQuery<User> query = em.createQuery(jpql, User.class);

        return query.getResultList().stream();
    }
}
