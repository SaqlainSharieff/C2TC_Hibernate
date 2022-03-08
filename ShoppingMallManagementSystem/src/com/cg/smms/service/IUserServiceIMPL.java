package com.cg.smms.service;

import com.cg.smms.entities.User;
import com.cg.smms.repository.IUserRepository;
import com.cg.smms.repository.IUserRepositoryIMPL;

public class IUserServiceIMPL implements IUserService {
	private IUserRepository iUserRepository;
	
	
	public IUserServiceIMPL() {
		iUserRepository = new IUserRepositoryIMPL();
	}

	@Override
	public void addUser(User user) {
		iUserRepository.beginTransaction();
		
		iUserRepository.commitTransaction();
	}

	@Override
	public void updateUser(User user) {
		iUserRepository.beginTransaction();
		
		iUserRepository.commitTransaction();
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}

}
