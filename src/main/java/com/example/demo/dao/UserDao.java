package com.example.demo.dao;

import com.example.demo.models.UserDomain;
import org.springframework.stereotype.Repository;

import java.util.List;



@Repository
public interface UserDao {

    int insert(UserDomain record);

    List<UserDomain> selectUsers();

    UserDomain selectUserByName(String name);
}
