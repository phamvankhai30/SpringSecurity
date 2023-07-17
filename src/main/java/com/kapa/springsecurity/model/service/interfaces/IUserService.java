package com.kapa.springsecurity.model.service.interfaces;

import com.kapa.springsecurity.model.dto.UserDto;
import com.kapa.springsecurity.model.entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<UserDto> getAllUsers();
    User toEntityUser(UserDto userDto);
    void saveUser(UserDto userDto);
    void updateUser(UserDto userDto);
    void deleteUser(Long userId);
}
