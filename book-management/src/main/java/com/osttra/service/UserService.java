package com.osttra.service;

import java.util.Scanner;

import com.osttra.dao.UserDAO;
import com.osttra.to.User;

public class UserService {
	
	Scanner sc = new Scanner(System.in);
	
	UserDAO userDAO = new UserDAO();
	
	public void register() {
		
		System.out.println("Enter your Username!!");
		String username = sc.next();
		
		System.out.println("Enter your password!!");
		String password = sc.next();
		
		System.out.println("Enter your Name");
		String name = sc.next();
		
		System.out.println("Enter your Role!!");
		String role = sc.next();
		
		
		
		User user = new User(username, password, name, role);
		
		//userDAO.add(username, password, name, role);
		
		userDAO.add(user);
	}
	
	public boolean login() {
		
		boolean loginStatus = false;
		
		System.out.println("Enter your Username!!");
		String username = sc.next();
		
		System.out.println("Enter your password!!");
		String password = sc.next();
		
		User user =  userDAO.getUser(username, password);
		
		if( user != null) {
			loginStatus = true;
		}
		return loginStatus;
	}

}
