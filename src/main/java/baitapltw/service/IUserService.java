package baitapltw.service;

import baitapltw.model.UserModel;

public interface IUserService {
	UserModel login(String username, String password);
	UserModel findbyusername(String username);
	boolean register(String username, String password, String fullname);
	boolean checkuser(String username);
	boolean resetpassword(String username, String password);
	
 
}
