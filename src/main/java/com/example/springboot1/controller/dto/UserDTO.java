package com.example.springboot1.controller.dto;

import lombok.Data;

/**
 * @author wss
 * @create 2023-02-27-23:00
 */
@Data
public class UserDTO {
    private String username;
    private String password;
    private String nickname;
    private String avatarUrl;
    private String token;
}
