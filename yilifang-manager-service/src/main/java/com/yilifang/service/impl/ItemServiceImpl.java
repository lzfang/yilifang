package com.yilifang.service.impl;

import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yilifang.mapper.ItemMapper;
import com.yilifang.pojo.DeleteVo;
import com.yilifang.pojo.EasyUIDataResult;
import com.yilifang.pojo.TbItem;
import com.yilifang.pojo.TbItemExample;
import com.yilifang.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	@Autowired
	private ItemMapper itemMapper;

	@Override
	public EasyUIDataResult queryItem(Integer pageSize, Integer pageNum) {
		// 设置pagesize,pageNum
		if (pageSize == null)
			pageSize = 1;
		if (pageNum == null)
			pageNum = 30;
		// 获取PageHelper，设置分页信息
		PageHelper.startPage(pageSize, pageNum);
		// 注入ItemMapper
		// 创建example对象
		TbItemExample tbExample = new TbItemExample();
		// 通过itemMapper获得查询数据
		List<TbItem> list = itemMapper.queryItem();
		// 构建分页信息
		PageInfo<TbItem> pageInfo = new PageInfo<>(list);
		EasyUIDataResult easyUI = new EasyUIDataResult();
		easyUI.setTotal((int) pageInfo.getTotal());
		easyUI.setRows(pageInfo.getList());
		return easyUI;
	}

	@Override
	public void saveItem(TbItem item) {
		//1.注入item 的 dao
		//2.先保存商品信息，并得到改商品的Id
		itemMapper.saveItem(item);
		//3.在保存商品描述
		itemMapper.saveItemDesc(item);
	}

	@Override
	public void deleteItemByIds(String ids) {
		DeleteVo dvo = new DeleteVo();
		dvo.setIds(ids.split(","));
		itemMapper.deleteItemByIds(dvo);
	}

	@Override
	public void updateItemByIds(TbItem item) {
		item.setUpdated(new Date());
		//转义一些特殊字符
		item.setDesc(StringUtils.replace(item.getDesc(), "'", "\\'"));
		itemMapper.updateItemById(item);
		itemMapper.updateItemDescById(item);
		
	}

}
