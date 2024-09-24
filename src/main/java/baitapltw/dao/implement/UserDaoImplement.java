package baitapltw.dao.implement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import baitapltw.config.DBConnect;
import baitapltw.dao.IUserDao;
import baitapltw.model.UserModel;

public class UserDaoImplement extends DBConnect implements IUserDao {
	public Connection conn = null;
	public PreparedStatement ps = null;
	public ResultSet rs = null;

	@Override
	public List<UserModel> findall() {

		String sql = "SELECT * FROM user";

		List<UserModel> list = new ArrayList<>();

		try {
			conn = super.getDatabaseConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				list.add(new UserModel(rs.getString("username"), rs.getString("password"), rs.getString("fullname"),
						rs.getInt("roleid")));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;

	}

	@Override
	public UserModel findbyusername(String username) {
		String sql = "SELECT * FROM user WHERE username = ? ";
		try {
		conn = super.getDatabaseConnection();
		ps = conn.prepareStatement(sql);
		ps.setString(1, username);
		rs = ps.executeQuery();
		while (rs.next()) {
		UserModel user = new UserModel();
		user.setUsername(rs.getString("username"));
		user.setFullname(rs.getString("fullname"));
		user.setPassword(rs.getString("password"));
		user.setRoleid(rs.getInt("roleid"));
		return user; }
		}catch (Exception e) {e.printStackTrace(); }
		return null;
	}

	@Override
	public void insert(UserModel usm) {
		// TODO Auto-generated method stub

	}

}
