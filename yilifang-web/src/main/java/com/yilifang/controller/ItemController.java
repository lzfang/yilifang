package com.yilifang.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yilifang.pojo.EasyUIDataResult;
import com.yilifang.pojo.TbItem;
import com.yilifang.pojo.TbItemDesc;
import com.yilifang.service.ItemCatService;
import com.yilifang.service.ItemService;


/**
 * 商品模块
 * @author Administrator
 *
 */
@Controller
public class ItemController extends BaseController{
	@Autowired
	private ItemService itemService; 

	@Autowired
	private ItemCatService itemSerCatService;
	
	@RequestMapping(value="item/list",method=RequestMethod.GET)
	@ResponseBody
	public EasyUIDataResult itemList(Integer page,Integer rows){
		System.out.println(page+"----"+rows);
		return itemService.queryItem(page, rows);
	}
	
	@RequestMapping(value="item/cat/list")
	@ResponseBody
	public List<Map<String, Object>> queryItemCat(){
		return itemSerCatService.queryItemCat();
	}
	
	
	@RequestMapping(value="item/save")
	@ResponseBody
	public Map<String,Object> saveItem(TbItem item){
		logger.debug("商品添加");;
		try{
			item.setCreated(new Date());
			item.setUpdated(new Date());
			System.out.println(item);
			itemService.saveItem(item);
			result.put("status",SUCCES);
		}catch(Exception e){
			logger.error(e);
			result.put("status",ERROR);
		}
		return result;
	}
	
	@RequestMapping("/rest/item/delete")
	@ResponseBody
	public Map<String,Object> deleteItemByIds(String ids){
		try{
			logger.debug("进入删除方法 ids="+ids);
			logger.info("进行删除操作");
			itemService.deleteItemByIds(ids);
			result.put("status",SUCCES);
		}catch(Exception e){
			logger.error(e);
			result.put("status",ERROR);
		}
		return result;
	}
	
	@RequestMapping("/item/update")
	Map<String,Object> updateItemById(TbItem item){
		try{
			logger.info("进行修改操作");
			itemService.updateItemByIds(item);
			result.put("status",SUCCES);
		}catch(Exception e){
			logger.error(e);
			result.put("status",ERROR);
		}
		return result;
	}
	
}
