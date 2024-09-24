package baitapltw.model;

public class UserModel {
	private String username;
	private String password;
	private String fullname;
	private int roleid;
	public UserModel() {
		super();
	}
	public UserModel(String username, String password, String fullname, int roleid) {
		super();
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.roleid = roleid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	
	
}
