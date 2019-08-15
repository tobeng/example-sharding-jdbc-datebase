package com.tobeng.test.controller;

import com.tobeng.test.dao.UserDao;
import com.tobeng.test.dto.UserDTO;
import com.tobeng.test.entity.User;
import com.tobeng.test.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户 controller
 *
 * @author yaorui
 * @version 1.0
 * @date 2019-08-15 15:20
 **/
@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public User saveUser(@RequestBody UserDTO userDTO){
        return userService.saveUser(userDTO);
    }

}
