package com.waylau.spring.boot.blog.initializrstart.domain;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * User. 
 * @author <a href="https://waylau.com">Way Lau</a>
 * @date 2017年2月24日
 */
@XmlRootElement // mediatype 转为xml
@Data
public class User {

	private long id; // 用户的唯一标识
 	private String name;
	private int age;

	public User() {
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}


}
