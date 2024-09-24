package baitapltw.service.implement;

import baitapltw.model.UserModel;
import baitapltw.service.IUserService;
import baitapltw.dao.*;
import baitapltw.dao.implement.UserDaoImplement;

public class UserServiceImplement implements IUserService {
	IUserDao userDao = new UserDaoImplement();

	@Override
	public UserModel login(String username, String password) {
		UserModel user = this.findbyusername(username);
		if (user != null && password.equals(user.getPassword())) {
			return user;
		} else {
			return null;
		}
	}

	@Override
	public UserModel findbyusername(String username) {
		return userDao.findbyusername(username);
	}

	@Override
	public boolean register(String username, String password, String fullname) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean checkuser(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean resetpassword(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

}
