package com.example.demo.config.interpector;

import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author liangming
 * @create 2019-03-15 16:55
 * @desc
 **/
public class LoginIntercepter implements HandlerInterceptor{

    Logger logger = Logger.getLogger(LoginIntercepter.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String uid = (String)request.getSession().getAttribute("uid");
        logger.info(request.getSession().getAttribute("uid"));
        if (StringUtils.isNotEmpty(uid)) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {

    }
}
