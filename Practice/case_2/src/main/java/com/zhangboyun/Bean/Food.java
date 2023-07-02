package com.zhangboyun.Bean;

import java.util.ArrayList;
import java.util.List;

public class Food {	
	private Integer id;
	private String cuisine;
	private String foodName;
	private Double price;
	private Double memberPrice;
	private String indroduction;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getMemberPrice() {
		return memberPrice;
	}
	public void setMemberPrice(Double memberPrice) {
		this.memberPrice = memberPrice;
	}
	public String getIndroduction() {
		return indroduction;
	}
	public void setIndroduction(String indroduction) {
		this.indroduction = indroduction;
	}
	public Food(Integer id, String cuisine, String foodName, Double price, Double memberPrice, String indroduction) {		
		this.id = id;
		this.cuisine = cuisine;
		this.foodName = foodName;
		this.price = price;
		this.memberPrice = memberPrice;
		this.indroduction = indroduction;
	}
			
	
}
