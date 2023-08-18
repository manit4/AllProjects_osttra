package com.osttra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.osttra.dao.UserDAO;
import com.osttra.service.UserService;
import com.osttra.to.User;
import com.osttra.utils.DBUtils;

public class Runner {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		
		UserService userService = new UserService();
		
		boolean mainMenuFlag = true;
		
		while(mainMenuFlag) {
			
			System.out.println("Enter 1 for Registration, 2 for Login and"
					+ "0 for Exit");
			
			int mainMenuInput = sc.nextInt();
			
			switch( mainMenuInput ) {
			
			case 1:
				
				
				
				userService.register();
				break;
				
			case 2:
				
				boolean loginFlag = true;
				
				while (loginFlag) {
					
					boolean loginStatus = userService.login();
					
					if(loginStatus == true ) {
						System.out.println("Welcome To Osttra Book Store");
						
						System.out.println("Would you like to Terminate, then press 0");
						int terminateInput = sc.nextInt();
						
						if (terminateInput == 0) {
							loginFlag = false;	
						}
					}
					else {
						System.out.println("credentials are wrong...");
					}
				}
				break;
				
			case 0:
				mainMenuFlag = false;
				break;
			}
		}
	}
}
