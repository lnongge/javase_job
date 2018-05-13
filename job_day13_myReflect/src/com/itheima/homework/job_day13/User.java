package com.itheima.homework.job_day13;

public class User {
	private String userName;
	private String password;
	public User() {
	}
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [" + (userName != null ? "userName=" + userName + ", " : "")
				+ (password != null ? "password=" + password : "") + "]";
	}
	
	
}
