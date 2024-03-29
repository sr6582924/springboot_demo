package com.example.demo.service.impl;


import com.example.demo.dao.UserDao;
import com.example.demo.models.Response;
import com.example.demo.models.UserDomain;
import com.example.demo.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImpl implements UserService{


    @Autowired
    private UserDao userDao;//这里会报错，但是并不会影响

    @Override
    public Response<String> addUser(UserDomain user) {
        int result = userDao.insert(user);
        if (result > 0) {
            return new Response<>(0, "成功", "");
        } else {
            return new Response<>(12, "失败", "");
        }
    }

    /*
    * 这个方法中用到了我们开头配置依赖的分页插件pagehelper
    * 很简单，只需要在service层传入参数，然后将参数传递给一个插件的一个静态方法即可；
    * pageNum 开始页数
    * pageSize 每页显示的数据条数
    * */
    @Override
    public PageInfo<UserDomain> findAllUser(int pageNum, int pageSize) {
        //将参数传给这个方法就可以实现物理分页了，非常简单。
        PageHelper.startPage(pageNum, pageSize);
        List<UserDomain> userDomains = userDao.selectUsers();
        PageInfo result = new PageInfo(userDomains);
        return result;
    }

}
