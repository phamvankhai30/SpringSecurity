package com.kapa.springsecurity.controller;

import com.kapa.springsecurity.exception.unchecked.ArithmeticEx;
import com.kapa.springsecurity.exception.unchecked.CustomException;
import com.kapa.springsecurity.model.dto.ExceptionDto;
import com.kapa.springsecurity.model.dto.UserDto;
import com.kapa.springsecurity.model.entity.User;
import com.kapa.springsecurity.model.service.interfaces.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping("/user-list")
    public ResponseEntity<List<UserDto>> getAllUsers(){
        return ResponseEntity.ok(userService.getAllUsers());
    }

    @PostMapping("/user-add")
    public ResponseEntity<Void> addUser(@RequestBody UserDto userDto){
        userService.saveUser(userDto);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/user-dto")
    public ResponseEntity<User> dtoUser(@RequestBody UserDto userDto){

        return ResponseEntity.ok(userService.toEntityUser(userDto));
    }
    @PostMapping("/test")
    public ResponseEntity<Integer> test(@RequestParam int a, @RequestParam int b){
        try {
            //throw new NotFoundException();
            return ResponseEntity.ok(a/b);
        }catch (RuntimeException exception){
            throw new CustomException(new ExceptionDto().setMessage("ok"));
        }
    }
}
