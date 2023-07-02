package com.book.mapper;

import java.util.List;

import com.book.model.User;

public interface UserMapper {
	//创建全表查询的抽象方法
	public List<User> selectAll();
}
