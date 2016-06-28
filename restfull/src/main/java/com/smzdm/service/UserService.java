package com.smzdm.service;

import java.math.BigDecimal;
import java.util.Date;

import com.smzdm.domin.UserInfo;
import org.springframework.stereotype.Service;

/**
 * Created by mazhenhua on 2016/6/27.
 */
@Service("userService")
public class UserService {

    public UserInfo getUserInfo() {
        UserInfo user1 = new UserInfo();
        user1.setBirthday(new Date());
        user1.setId(1);
        user1.setUserName("mazh");
        user1.setVip(true);
        user1.setSalary(new BigDecimal(5000.00d));
        return user1;
    }

}