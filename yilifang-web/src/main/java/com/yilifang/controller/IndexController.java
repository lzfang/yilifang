package com.yilifang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


/**
 * 商品模块
 * @author Administrator
 *
 */

@Controller
public class IndexController {
	
	@RequestMapping("/")
	public String showIndex(){
		ModelAndView mav=new ModelAndView();
		mav.setViewName("index");
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String showPage(@PathVariable String page){
		System.out.println("page==========="+page);
		return page;
	}
	
}
