package com.zhangboyun.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.util.StringUtils;
import com.zhangboyun.Bean.Food;
import com.zhangboyun.servlet.FoodquServlet;
import com.zhangboyun.uity.Db_Connecetion;

public class FoodDao {
	public static List<Food> queryFoods(String searchName){
		List<Food> list=new ArrayList<Food>();
		String sql=null;
		ResultSet rs=null;
		if (searchName==null || searchName=="") {
			sql="select id,cuisine,foodName,price,memberPrice,introduce from food";
			rs=Db_Connecetion.query(sql);
		} else {
			sql="select id,cuisine,foodName,price,memberPrice,introduce from food where foodName like concat('%',?,'%')";
			 rs=Db_Connecetion.query(sql, searchName);
		}
		try {
			while (rs.next()) {				
				int id=rs.getInt(1);
				String cuisine=rs.getString(2);
				String foodName=rs.getString(3);
				Double price=rs.getDouble(4);
				Double memberPrice=rs.getDouble(5);
				String introduce=rs.getString(6);
				Food d=new Food(id,cuisine,foodName,price,memberPrice,introduce);
				list.add(d);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;	
	}
	
	public static void main(String[] args) {
		List<Food> s= FoodDao.queryFoods("1");
		s.forEach(o -> System.out.println(o.getFoodName()));
	}
	
	
	public static int delete(int id) {
		String sql="delete from food where id=?";
		return Db_Connecetion.update(sql, id);
	}
	public static int addFood(Food food){
		String sql="insert into "
				+ "food(cuisine, foodName, price, memberPrice, introduce) "
				+ "values(?,?,?,?,?)";		
			return Db_Connecetion.update(sql, food.getCuisine(),food.getFoodName(),food.getPrice(),
					food.getMemberPrice(),food.getIndroduction());			
	}
	
	public static Food upFood(int ido) {
		String sql="select id,cuisine,foodName,price,memberPrice,introduce from food where id=?";
		ResultSet rs=Db_Connecetion.query(sql, ido);
		try {
			while (rs.next()) {				
				String cuisine=rs.getString(2);
				String foodName=rs.getString(3);
				Double price=rs.getDouble(4);
				Double memberPrice=rs.getDouble(5);
				String introduce=rs.getString(6);
				Food d=new Food(ido,cuisine,foodName,price,memberPrice,introduce);
				return d;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static int updataFood(Food food) {
		String sql="update food set cuisine=?,foodName=?,price=?,memberPrice=?,introduce=? where id=?";
		return Db_Connecetion.update(sql, food.getCuisine(),food.getFoodName(),food.getPrice(),
				food.getMemberPrice(),food.getIndroduction(),food.getId());
		
	}
	
	
	
	
}
