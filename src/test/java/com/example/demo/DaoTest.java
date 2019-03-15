package com.example.demo;

import com.example.demo.dao.UserDao;
import com.example.demo.models.UserDomain;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author liangming
 * @create 2019-03-15 18:47
 * @desc
 **/

@RunWith(SpringRunner.class)
@SpringBootTest
public class DaoTest {


    @Autowired
    private UserDao userDao;//这里会报错，但是并不会影响


    @Test
    public void testUser(){
        UserDomain userDomain = userDao.selectUserByName("hahaha");
        System.out.println(userDomain);
    }
}
