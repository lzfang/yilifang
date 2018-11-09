package com.yilifang.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yilifang.pojo.EasyUIDataResult;
import com.yilifang.pojo.TbItem;
import com.yilifang.service.ItemCatService;
import com.yilifang.service.ItemDescService;
import com.yilifang.service.ItemService;


/**
 * 商品模块
 * @author Administrator
 *
 */
@Controller
public class ItemDescController extends BaseController{
	@Autowired
	private ItemDescService itemDescService; 

    @RequestMapping("item/desc/{id}")
    @ResponseBody
    public Map<String,Object> queryItemDescById(@PathVariable String id){
    	Map<String,Object> map = null;
    	try{
    		map= new HashMap<>();
    		long itemid = Long.parseLong(id);
    		String itemeDesc = itemDescService.queryItemDescById(itemid);
    		map.put("itemDesc", itemeDesc);
    		map.put("status", SUCCES);
    	}catch(Exception e){
    		logger.error(e);
    		map.put("status",ERROR);
    	}
    	return map;
    }
}
