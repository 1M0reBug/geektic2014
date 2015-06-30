package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.dao.UserDao;
import com.ninja_squad.geektic.domain.Gender;
import com.ninja_squad.geektic.domain.User;
import com.ninja_squad.geektic.service.exceptions.IdNotFound;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

/**
 * Created by jordan on 30/06/15.
 */
public class UserServiceTest {

    private UserService userService;
    private UserDao dao;

    @Before
    public void setUp() throws Exception {
        dao = mock(UserDao.class);
        userService = new UserService(dao);
    }


    @Test(expected = IdNotFound.class)
    public void whenUserIsNotFoundByIdThen404() {
        List<User> emptyList = new ArrayList();
        when(dao.findById(anyInt())).thenReturn(emptyList);

        User returned = userService.findById(2);
    }

    @Test
    public void whenNoGenderIsGivenToFindAllThenOnlySearchByInterests() {
        String requestInterests = "sit";

        Set<String> interests = new HashSet<>();
        interests.add("sit");
        interests.add("ac");
        userService.findAll(interests, null);

        verify(dao).findByInterestsValues(interests);
    }

    @Test
    public void whenNoInterestIsGivenToFindAllThenOnlySearchByGender() {

        Gender gender = Gender.FEMME;

        userService.findAll(null, gender);

        verify(dao).findByGender(gender);
    }

    @Test
    public void whenGenderAndInterestsAreGivenFindAllByGenderAndInterests() {
        Set<String> interests = new HashSet<>();
        interests.add("sit");
        interests.add("ac");

        Gender gender = Gender.FEMME;
        userService.findAll(interests, gender);

        verify(dao).findByInterestsValuesAndGender(interests, gender);
    }
}