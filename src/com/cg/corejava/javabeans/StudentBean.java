package com.cg.corejava.javabeans;

import java.io.Serializable;

public class StudentBean  implements Serializable{
	
	private int sno;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	private String sname;
	private String group;
	
	

}
