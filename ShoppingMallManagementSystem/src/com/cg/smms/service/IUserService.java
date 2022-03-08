package com.cg.smms.service;

import com.cg.smms.entities.User;

public interface IUserService {
	public void addUser(User user);
	public void updateUser(User user);
	public User login(User user);
	public boolean logOut();
}
