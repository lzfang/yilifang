package com.yilifang.mapper;

import java.util.List;

import com.yilifang.pojo.DeleteVo;
import com.yilifang.pojo.TbItem;
import com.yilifang.pojo.TbItemDesc;

public interface ItemMapper {

	public List<TbItem> queryItem();
	public void saveItem(TbItem item);
	public void  deleteItemByIds(DeleteVo dvo);
	public void saveItemDesc(TbItem item);
	public void updateItemById(TbItem item);
	public void updateItemDescById(TbItem item);
	
}
