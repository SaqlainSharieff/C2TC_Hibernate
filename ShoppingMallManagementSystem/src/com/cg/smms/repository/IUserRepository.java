package com.cg.smms.repository;

import com.cg.smms.entities.User;

public interface IUserRepository {
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(int id);
	public abstract void commitTransaction();
	public abstract void beginTransaction();

}
