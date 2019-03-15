package com.example.demo.controller;


import com.example.demo.models.Response;
import com.example.demo.models.SystemUpdateEntity;
import com.example.demo.models.User;
import com.example.demo.models.UserDomain;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user")
public class UserController {



    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/add",method=RequestMethod.POST)
    public Response<String> addUser(UserDomain user){
        return userService.addUser(user);
    }

    @ResponseBody
    @GetMapping("/all")
    public Object findAllUser(
            @RequestParam(name = "pageNum", required = false, defaultValue = "1")
                    int pageNum,
            @RequestParam(name = "pageSize", required = false, defaultValue = "10")
                    int pageSize) {
        return userService.findAllUser(pageNum,pageSize);
    }


    @ResponseBody
    @PostMapping("/update")
    public Response<SystemUpdateEntity> update(SystemUpdateEntity entity){
        System.out.println(entity);
        return new Response<>(100, "success", entity);
    }


    @ResponseBody
    @RequestMapping("/getUser")
    @Cacheable(value="user-key")
    public User getUser() {
        User user=new User("aa@126.com", "aa", "aa123456", "aa","123");
        System.out.println("若下面没出现“无缓存的时候调用”字样且能打印出数据表示测试成功");
        return user;
    }

}
