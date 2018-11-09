package com.yilifang.pojo;

import java.io.Serializable;
import java.util.Date;

public class TbItem implements Serializable{
	
	private static final long serialVersionUID = -3738290223083325071L;
	private  long  id;          
	private String title;       
	private	String sellPoint;
	private long  price;
	private int	num;
	private	String barcode;
	private	String	image;
	private  long	cid;
	private int	status; 
	private Date created;
	private Date updated;
	private String desc;
	
	
	public String getDesc() {
		return desc;
	}


	public void setDesc(String desc) {
		this.desc = desc;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getSellPoint() {
		return sellPoint;
	}


	public void setSellPoint(String sellPoint) {
		this.sellPoint = sellPoint;
	}


	public long getPrice() {
		return price;
	}


	public void setPrice(long price) {
		this.price = price;
	}


	public int getNum() {
		return num;
	}


	public void setNum(int num) {
		this.num = num;
	}


	public String getBarcode() {
		return barcode;
	}


	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}


	public String getImage() {
		return image;
	}


	public void setImage(String image) {
		this.image = image;
	}


	public long getCid() {
		return cid;
	}


	public void setCid(long cid) {
		this.cid = cid;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
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
		return "TbItem [id=" + id + ", title=" + title + ", sellPoint="
				+ sellPoint + ", price=" + price + ", num=" + num
				+ ", barcode=" + barcode + ", image=" + image + ", cid=" + cid
				+ ", status=" + status + ", created=" + created + ", updated="
				+ updated + ", desc=" + desc + "]";
	}
	

}
