package com;

public class SingIeton {
	private static SingIeton singIeton=new SingIeton();
	private SingIeton(){}
	public static SingIeton getsingIeton(){
		return singIeton;
	}
}
