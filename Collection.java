package model;

public class Collection {
	protected String sid;
	protected String sName;
	protected String sellcount;
	protected String foodName;
	protected String foodPrice;
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
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
	public String getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(String foodPrice) {
		this.foodPrice = foodPrice;
	}

	public Collection(String sid, String sName, String sellcount,
			String foodName, String foodPrice) {
		super();
		this.sid = sid;
		this.sName = sName;
		this.sellcount = sellcount;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}
	
	
}
