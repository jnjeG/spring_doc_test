package com.test.dao;

import java.util.LinkedList;
import java.util.List;

import com.test.bo.User;

public class UserDao {
	private static List<User> list = new LinkedList<User>();
	static{
		list.add(new User());
	}

	public List<User> getUser() {
		return list;
	}

}
