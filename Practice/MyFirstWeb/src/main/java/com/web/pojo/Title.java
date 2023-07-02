package com.web.pojo;

/**
 * @author ChnpngWng
 * @date 2022-10-13 下午6:49:23
 */
//描述帖子的实体类
public class Title {
	private int id;//帖子ID
	private String title;//标题
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
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	
}
