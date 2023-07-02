package com.zhangboyun.uity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import javax.xml.crypto.Data;

import org.apache.catalina.core.AprLifecycleListener;
import org.apache.catalina.tribes.ChannelSender;
import org.apache.jasper.tagplugins.jstl.core.If;

public class Db_Connecetion {
	final static String DRIVERNAME="com.mysql.cj.jdbc.Driver";
	final static String URL="jdbc:mysql://localhost:3306/connet";
	final static String USER="root";
	final static String PASSWORD="13512435";
	
	static {		
			try {
				Class.forName(DRIVERNAME);
			} catch (ClassNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}		
	}
	
	public static Connection getConnection(){		
			try {
				return DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;		
	}				
	
	public static ResultSet query(String sql,Object...datas) {
		System.out.println(sql);
		try {
			Connection con = Db_Connecetion.getConnection();
			PreparedStatement p = con.prepareStatement(sql);
			for (int i = 0; i <= datas.length-1; i++) {
				p.setObject(i+1, datas[i]);
			}
			return p.executeQuery();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			JOptionPane.showConfirmDialog(null, "SQL执行语句出错！query");
			e.printStackTrace();
		}
		return null;		
	}
	
	public static int update(String sql,Object...datas) {
		System.out.println(sql);
		try {
			Connection con = Db_Connecetion.getConnection();
			PreparedStatement p=con.prepareStatement(sql);
			for (int i = 0; i<=datas.length-1; i++) {
				p.setObject(i+1, datas[i]);
			}
			return p.executeUpdate();
		} catch (SQLException e) {
			// TODO 自动生成的 catch 块
			JOptionPane.showConfirmDialog(null, "SQL执行语句出错！update");
			e.printStackTrace();
		}
		return 0;			
		}
	
//	public static void colose() throws SQLException {
//		Connection con=null;
//		PreparedStatement p=null;
//		ResultSet re=null;
//		if (con==null && p==null && re==null) {			
//				con.close();
//				p.close();
//				re.close();					
//		}
//	}		

}
