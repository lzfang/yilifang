package com.yilifang.service.impl;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yilifang.mapper.ItemDescMapper;
import com.yilifang.mapper.ItemMapper;
import com.yilifang.pojo.DeleteVo;
import com.yilifang.pojo.EasyUIDataResult;
import com.yilifang.pojo.TbItem;
import com.yilifang.pojo.TbItemExample;
import com.yilifang.service.ItemDescService;
import com.yilifang.service.ItemService;

@Service
public class ItemDescServiceImpl implements ItemDescService {
	@Autowired
	private ItemDescMapper itemDescMapper;

	@Override
	public String queryItemDescById(long id) {
		
		return itemDescMapper.queryItemById(id);
	}

}
