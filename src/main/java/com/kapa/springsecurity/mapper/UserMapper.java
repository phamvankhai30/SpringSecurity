package com.kapa.springsecurity.mapper;

import com.kapa.springsecurity.mapper.abstracts.AbstractMapper;
import com.kapa.springsecurity.model.dto.UserDto;
import com.kapa.springsecurity.model.entity.User;
import org.springframework.stereotype.Component;



@Component
public class UserMapper extends AbstractMapper<User,UserDto> {

    @Override
    protected Class<User> getEntityClass() {
        return User.class;
    }

    @Override
    protected Class<UserDto> getDTOClass() {
        return UserDto.class;
    }

}
