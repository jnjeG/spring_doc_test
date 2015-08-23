package com.test.dao;

import java.util.LinkedList;
import java.util.List;

import com.test.bo.User;

public class UserDao {

	public List<User> getUser() {
		List<User> list = new LinkedList<User>();
		list.add(new User());
		return list;
	}

}
