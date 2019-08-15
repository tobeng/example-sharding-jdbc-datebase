package com.tobeng.test.dto;

import lombok.Data;

/**
 * 用户 DTO
 *
 * @author yaorui
 * @version 1.0
 * @date 2019-08-15 15:22
 **/
@Data
public class UserDTO {

    private Long id;

    private String name;

    private Integer age;

    private String address;

    private String pwd;

}
