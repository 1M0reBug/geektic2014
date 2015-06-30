package com.ninja_squad.geektic.service;

import com.ninja_squad.geektic.dao.UserDao;
import com.ninja_squad.geektic.domain.Gender;
import com.ninja_squad.geektic.domain.User;
import com.ninja_squad.geektic.service.exceptions.IdNotFound;
import org.junit.Before;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

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
        HttpServletRequest request;
        request = mock(HttpServletRequest.class);

        String requestInterests = "sit";
        String[] interests = requestInterests.split(",");

        when(request.getParameter("interests")).thenReturn(requestInterests);

        userService.findAll(request);

        verify(dao).findByInterestsValues(interests);
    }

    @Test
    public void whenNoInterestIsGivenToFindAllThenOnlySearchByGender() {
        HttpServletRequest request;
        request = mock(HttpServletRequest.class);

        String requestGender = "FEMME";
        Gender gender = Gender.FEMME;

        when(request.getParameter("gender")).thenReturn(requestGender);

        userService.findAll(request);

        verify(dao).findByGender(gender);
    }

    @Test
    public void whenGenderAndInterestsAreGivenFindAllByGenderAndInterests() {
        HttpServletRequest request;
        request = mock(HttpServletRequest.class);

        String requestInterests = "sit,ac";
        String[] interests = requestInterests.split(",");

        String requestGender = "FEMME";
        Gender gender = Gender.FEMME;

        when(request.getParameter("interests")).thenReturn(requestInterests);
        when(request.getParameter("gender")).thenReturn(requestGender);

        userService.findAll(request);

        verify(dao).findByInterestsValuesAndGender(interests, gender);
    }
}