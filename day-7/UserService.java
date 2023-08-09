package com.techzenure.services;

public class UserService {
	public String findUserNameById(int userId) {
		//--- perform some database operations using DAO layer logic
		try {
			Thread.sleep(3000); //3000 milliseconds
		}catch(Exception ex) {}
		
		if(userId > 100 )
			return "Sanjay";
		return null;
	}
}
