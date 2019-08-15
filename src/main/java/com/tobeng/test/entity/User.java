package com.tobeng.test.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_user")
public class User {

    @Id
    @Column(name = "t_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "t_name")
    private String name;

    @Column(name = "t_age")
    private Integer age;

    @Column(name = "t_address")
    private String address;

    @Column(name = "t_pwd")
    private String pwd;
}
