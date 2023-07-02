package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bank.entity.Card;
import com.bank.service.CardServiceImpl;

@Controller
public class CardController {
	//自动装配对象
	@Autowired
	private CardServiceImpl service;
	//全表查询
	@RequestMapping("/select")
	public String queryAllCard(Model model) {
		List<Card> list = service.queryAllInfo();
		model.addAttribute("list",list);
		return "main";
	}
	//根据ID删除信息
	@RequestMapping("/deleteById")
	public String deleteCardById(int id,Model model) {
		int result = service.deleteCardById(id);
		if(result>0) {
			model.addAttribute("msg", "数据删除成功");
			return "forward:/select.do";
		}else {
			model.addAttribute("msg", "数据删除失败！");
			return "error";
		}
	}
	//添加数据信息
	@RequestMapping("/addCardInfo")
	public String addCardInfo(Card card,Model model) {
		int result = service.addCardInfo(card);
		if(result>0) {
			model.addAttribute("msg", "数据添加成功！");
			return "forward:/select.do";
		}else {
			model.addAttribute("msg", "数据添加失败！");
			return "error";
		}
	}
	
	//跳转页面
	@RequestMapping("/goToAdd")
	public String goToAdd() {
		return "addInfo";
	}

}
