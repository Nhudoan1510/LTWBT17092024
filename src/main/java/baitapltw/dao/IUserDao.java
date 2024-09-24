package baitapltw.dao;

import java.util.List;

import baitapltw.model.UserModel;

public interface IUserDao {
	List<UserModel> findall ();
	UserModel findbyusername(String username);
	void insert( UserModel usm);
}
