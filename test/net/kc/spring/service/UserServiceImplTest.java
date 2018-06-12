package net.kc.spring.service;

import net.kc.spring.dao.UserDao;
import net.kc.spring.model.User;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;

/**
 * Created by keshav.chaure on 6/12/2018.
 */


public class UserServiceImplTest {

    private static final int USER_ID =1;

    @Mock
    private UserDao userDao;

    @InjectMocks
    private UserServiceImpl userService;

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void shouldReturnSameUserIdByfindById() throws Exception {
        User expectedUser=getUser();
        Mockito.when(userService.findById(USER_ID)).thenReturn(expectedUser);

        User user=userService.findById(USER_ID);

        assertEquals("user id should be same ",expectedUser.getId(),user.getId());
    }

    @Test
    public void testMavenTestGoal(){
        assertEquals(1,1);
    }

    private User getUser() {
       User user=new User();
       user.setId(USER_ID);
       return  user;
    }

}