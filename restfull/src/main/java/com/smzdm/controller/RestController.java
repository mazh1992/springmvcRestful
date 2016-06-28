package com.smzdm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.meidusa.fastjson.JSON;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smzdm.domin.UserInfo;
import com.smzdm.service.UserService;

import java.io.InputStreamReader;
import java.util.Map;

/**
 * Created by mazhenhua on 2016/6/27.
 */
@Controller
@RequestMapping(value = "/rest")
public class RestController {


    @Autowired
    UserService userService;

    private ObjectMapper om = new ObjectMapper();

    @RequestMapping(value = "/user/mzh")
    public UserInfo show(HttpServletRequest request, HttpServletResponse response) throws Exception {

        // 接收请求参数
        Map<?, ?> parametersForMap = request.getParameterMap();

        System.out.println("接收到请求参数" + JSON.toJSONString(parametersForMap));

        return userService.getUserInfo();
    }

}