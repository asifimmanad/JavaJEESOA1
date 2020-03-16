package com.asif.bean;

public class Login {

	int uid;

	String uname;
	String pass;

		public Login() {
			// TODO Auto-generated constructor stub
		}
	
	public Login(int uid, String uname, String pass) {
		
		this.uid = uid;
		this.uname = uname;
		this.pass = pass;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "Login [uid=" + uid + ", uname=" + uname + ", pass=" + pass + "]";
	}

}
