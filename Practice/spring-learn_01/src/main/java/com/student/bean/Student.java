package com.student.bean;

/**
 * @author ChnpngWng
 *
 * @date   Mar 1, 20239:11:09 AM
 */
public class Student {
	private int Sid;
	private String Sname;
	private int Sage;
	private char Ssex;
	private String Sclass;
	private String Sphone;
	/**
	 * @return the sid
	 */
	public int getSid() {
		return Sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(int sid) {
		Sid = sid;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return Sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		Sname = sname;
	}
	/**
	 * @return the sage
	 */
	public int getSage() {
		return Sage;
	}
	/**
	 * @param sage the sage to set
	 */
	public void setSage(int sage) {
		Sage = sage;
	}
	/**
	 * @return the ssex
	 */
	public char getSsex() {
		return Ssex;
	}
	/**
	 * @param ssex the ssex to set
	 */
	public void setSsex(char ssex) {
		Ssex = ssex;
	}
	/**
	 * @return the sclass
	 */
	public String getSclass() {
		return Sclass;
	}
	/**
	 * @param sclass the sclass to set
	 */
	public void setSclass(String sclass) {
		Sclass = sclass;
	}
	/**
	 * @return the sphone
	 */
	public String getSphone() {
		return Sphone;
	}
	/**
	 * @param sphone the sphone to set
	 */
	public void setSphone(String sphone) {
		Sphone = sphone;
	}
	@Override
	public String toString() {
		return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Sage=" + Sage + ", Ssex=" + Ssex + ", Sclass=" + Sclass
				+ ", Sphone=" + Sphone + "]";
	}
	/**
	 * 
	 */
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
