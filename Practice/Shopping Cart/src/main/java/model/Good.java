package model;

import java.util.Date;

/**
 * @author ChnpngWng
 *
 * @date   Dec 20, 20228:50:37 AM
 */
public class Good {
	private int id;
	private String name;
	private double price;
	private int count;
	private Date createTime;
	private String desc;
	/**
	 * 
	 */
	public Good() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param id
	 * @param name
	 * @param price
	 * @param count
	 * @param createTime
	 * @param desc
	 */
	public Good(int id, String name, double price, int count, Date createTime, String desc) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.count = count;
		this.createTime = createTime;
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "Good [id=" + id + ", name=" + name + ", price=" + price + ", count=" + count + ", createTime="
				+ createTime + ", desc=" + desc + "]";
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	/**
	 * @return the createTime
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * @param createTime the createTime to set
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * @return the desc
	 */
	public String getDesc() {
		return desc;
	}
	/**
	 * @param desc the desc to set
	 */
	public void setDesc(String desc) {
		this.desc = desc;
	}

	
}
