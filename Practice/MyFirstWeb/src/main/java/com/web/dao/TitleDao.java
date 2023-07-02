package com.web.dao;

import java.util.ArrayList;
import java.util.List;

import com.web.pojo.Title;

/**
 * @author ChnpngWng
 * @date 2022-10-13 下午6:56:22
 */
//针对Titlie帖子进行增删改查的操作
public class TitleDao {
	//模拟项目中的数据源
	public static List<Title> titleList = new ArrayList<Title>();
	//发贴方法
	public void addTitle(String title){
		Title t= new Title();//创建了空的帖子对象
		t.setTitle(title);//给帖子对象设置标题
		//计算下一个产生的id
		if(titleList.size() > 0){
			int id = titleList.get(titleList.size()-1).getId();
			id++;
			t.setId(id);
		} else {
			t.setId(1);
		}
		//将帖子对象放入数据源中
		titleList.add(t);
	}
}
