package com.yilifang.pojo;

import java.util.Date;

/**
 * 商品类目实体类
 * @author Administrator
 *
 */
public class TbItemCat {
	
	private long id;
	private long parentId;
	private String name;
	private int status;
	private int sort_order;   
	private int is_parent;   
    private Date created ;     
    private Date updated ;    

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getParentId() {
		return parentId;
	}

	public void setParentId(long parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getSort_order() {
		return sort_order;
	}

	public void setSort_order(int sort_order) {
		this.sort_order = sort_order;
	}

	public int getIs_parent() {
		return is_parent;
	}

	public void setIs_parent(int is_parent) {
		this.is_parent = is_parent;
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
		return "TbItemCat [id=" + id + ", parentId=" + parentId + ", name="
				+ name + ", status=" + status + ", sort_order=" + sort_order
				+ ", is_parent=" + is_parent + ", created=" + created
				+ ", updated=" + updated + "]";
	}
  
  
}
