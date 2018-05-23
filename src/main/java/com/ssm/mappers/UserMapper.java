package com.ssm.mappers;

import com.ssm.mappers.nochange.MBGUserMapper;
import com.ssm.model.nochange.User;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper extends MBGUserMapper {
    void saveUser(User user);
}