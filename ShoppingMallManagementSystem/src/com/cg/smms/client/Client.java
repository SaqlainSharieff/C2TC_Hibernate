package com.cg.smms.client;

import com.cg.smms.entities.User;
import com.cg.smms.service.IUserService;
import com.cg.smms.service.IUserServiceIMPL;

public class Client {

	public static void main(String[] args) {
		IUserService service = new IUserServiceIMPL();
         User user = new User();
         
         // Add user
         user.setId(1);
         user.setName("Shahrukhkhan");
         service.addUser(user);
         user.setPassword("12345");
         user.setType("SRK");
	}

}
