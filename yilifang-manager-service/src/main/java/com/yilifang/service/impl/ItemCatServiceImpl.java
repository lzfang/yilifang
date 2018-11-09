package com.yilifang.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yilifang.mapper.ItemCatMapper;
import com.yilifang.pojo.TbItemCat;
import com.yilifang.service.ItemCatService;
@Service
public class ItemCatServiceImpl implements ItemCatService{

	@Autowired
	private ItemCatMapper itemCatMapper;
	
	@Override
	public List<Map<String, Object>> queryItemCat() {
		//注入Dao
		List<TbItemCat> itemCats = itemCatMapper.queryItemCat();
		int level=0;
		List<Map<String, Object>> arrays = buildTreeJson(itemCats, level);
		return arrays;
	}

	
	private List<Map<String, Object>> buildTreeJson(List<TbItemCat> itemCats,int level) {
		List<Map<String,Object>> arrays=new ArrayList<>();
		for (TbItemCat cat:itemCats){
			if (cat.getParentId()==level){
				Map<String,Object> temp=new HashMap<>();
				temp.put("id", cat.getId());
				temp.put("text", cat.getName());
				//判断当前数据是否存在子节点
				if (cat.getIs_parent()==1){
					List<Map<String, Object>> child= buildTreeJson(itemCats,(int)cat.getId());
					temp.put("children",child);
				}
				arrays.add(temp);
			}
		}
		return arrays;
	}

}
