package com.kapa.springsecurity.model.service;

import com.kapa.springsecurity.mapper.UserMapper;
import com.kapa.springsecurity.model.dto.UserDto;
import com.kapa.springsecurity.model.entity.Role;
import com.kapa.springsecurity.model.entity.User;
import com.kapa.springsecurity.model.repository.UserRepository;
import com.kapa.springsecurity.model.service.interfaces.IUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = userRepository.findAll();
        List<UserDto> userDtoList = userMapper.toDtoList(userList);
        return userDtoList;
    }

    @Override
    public void saveUser(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        userRepository.save(user);
    }

    @Override
    public User toEntityUser(UserDto userDto) {
        User user = userMapper.toEntity(userDto);
        return user;
    }

    @Override
    public void updateUser(UserDto userDto) {

    }

    @Override
    public void deleteUser(Long userId) {

    }
}
