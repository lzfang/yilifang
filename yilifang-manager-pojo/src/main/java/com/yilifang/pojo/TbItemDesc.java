package com.yilifang.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItemDesc implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private long itemId;
	private String itemDesc;
    private Date created;
    private Date updated;
    
	public long getItemId() {
		return itemId;
	}
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}
	public String getItemDesc() {
		return itemDesc;
	}
	public void setItemDesc(String itemDesc) {
		this.itemDesc = itemDesc;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public Date getUpdated() {
		return updated;
	}
	public void setUpdated(Date updated) {
		this.updated = updated;
	}
	@Override
	public String toString() {
		return "TbItemDesc [itemId=" + itemId + ", itemDesc=" + itemDesc
				+ ", created=" + created + ", updated=" + updated + "]";
	}
    
    

}
