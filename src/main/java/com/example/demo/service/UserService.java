package com.example.demo.service;

import com.example.demo.models.Response;
import com.example.demo.models.UserDomain;
import com.github.pagehelper.PageInfo;

public interface UserService {

    Response<String> addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
