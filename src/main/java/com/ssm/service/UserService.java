package com.ssm.service;

import com.ssm.mappers.UserMapper;
import com.ssm.model.nochange.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by chenhansen on 2018/5/21.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public void saveUser(User user){
        userMapper.saveUser(user);
    }
}
