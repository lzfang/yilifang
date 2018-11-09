package com.yilifang.service;

import com.yilifang.pojo.EasyUIDataResult;
import com.yilifang.pojo.TbItem;

public interface ItemService {
   
	/**
	 * 进行分页查询
	 */
	public EasyUIDataResult queryItem(Integer pageSize,Integer pageNum);
	
	public void saveItem(TbItem item);
	public void  deleteItemByIds(String ids);

	public void updateItemByIds(TbItem item);

}
