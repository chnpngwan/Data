package model;

/**
 * @author ChnpngWng
 *
 * @date   Dec 6, 20228:30:57 AM
 */
public class Food {
	private int id;
	private String  cuisine;
	private String  foodName;
	private Double  price;
	private Double  memberPrice;
	private String  introduce;
	/**
	 * 
	 */
	public Food() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param cuisine
	 * @param foodName
	 * @param price
	 * @param memberPrice
	 * @param introduce
	 */
	public Food(int id, String cuisine, String foodName, Double price, Double memberPrice, String introduce) {
		super();
		this.id = id;
		this.cuisine = cuisine;
		this.foodName = foodName;
		this.price = price;
		this.memberPrice = memberPrice;
		this.introduce = introduce;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the cuisine
	 */
	public String getCuisine() {
		return cuisine;
	}
	/**
	 * @param cuisine the cuisine to set
	 */
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	/**
	 * @return the foodName
	 */
	public String getFoodName() {
		return foodName;
	}
	/**
	 * @param foodName the foodName to set
	 */
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	/**
	 * @return the memberPrice
	 */
	public Double getMemberPrice() {
		return memberPrice;
	}
	/**
	 * @param memberPrice the memberPrice to set
	 */
	public void setMemberPrice(Double memberPrice) {
		this.memberPrice = memberPrice;
	}
	/**
	 * @return the introduce
	 */
	public String getIntroduce() {
		return introduce;
	}
	/**
	 * @param introduce the introduce to set
	 */
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	
}
