package com.ninja_squad.geektic.dao;

import com.ninja_squad.geektic.domain.Interest;
import com.ninja_squad.geektic.domain.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by jordan on 29/06/15.
 */
@Repository
public class InterestDao {

    @PersistenceContext
    private EntityManager em;

    public List<Interest> listAll() {
        String jpql = "Select i FROM Interest AS i order by i.value";
        TypedQuery<Interest> query = em.createQuery(jpql, Interest.class);

        return query.getResultList();
    }

}
