package model;

import java.io.Serializable;

public class Favorite implements Serializable {

	private String foodName;
	private String foodImage;
	private String bname;
	private String sellcount;
	private String sid;
	
	
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSellcount() {
		return sellcount;
	}
	public void setSellcount(String sellcount) {
		this.sellcount = sellcount;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodImage() {
		return foodImage;
	}
	public void setFoodImage(String foodImage) {
		this.foodImage = foodImage;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	
	public Favorite(String foodName, String foodImage, String bname,String sid) {
		super();
		this.foodName = foodName;
		this.foodImage = foodImage;
		this.bname = bname;
		this.sid=sid;
	}
	
	
}
