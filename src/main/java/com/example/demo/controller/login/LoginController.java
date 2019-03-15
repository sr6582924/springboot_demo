package com.example.demo.controller.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.UUID;

/**
 * @author liangming
 * @create 2019-03-15 18:26
 * @desc
 **/

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @ResponseBody
    @GetMapping("/uid")
    public String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid.toString());
        return session.getId();
    }

}
