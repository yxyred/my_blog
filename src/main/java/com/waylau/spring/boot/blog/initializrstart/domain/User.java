package com.waylau.spring.boot.blog.initializrstart.domain;

/*
* User 实体
* @since
* @author
* */

import lombok.Data;

@Data
public class User {

    private long id; //唯一标识
    private String name;
    private String email;
}
