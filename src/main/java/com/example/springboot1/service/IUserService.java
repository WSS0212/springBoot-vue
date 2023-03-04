package com.example.springboot1.service;

import com.example.springboot1.controller.dto.UserDTO;
import com.example.springboot1.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author WSS
 * @since 2022-12-18
 */
public interface IUserService extends IService<User> {

    UserDTO login(UserDTO userDTO);

    User register(UserDTO userDTO);

}
