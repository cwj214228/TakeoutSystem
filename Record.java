package model;

/**
 * 
 * @author Administrator
 * Record: sname, orderTime,foodName, price, state
 * 		   Record 
 */
public class Record {
 
	protected int cid;
	protected String sname;
	protected String orderTime;
	protected String foodName;
	protected float price;
	protected String state;		//交易状态，成功or取消
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Record(int cid, String sname, String orderTime, String foodName, float price,
			String state) {
		super();
		this.cid = cid;
		this.sname = sname;
		this.orderTime = orderTime;
		this.foodName = foodName;
		this.price = price;
		this.state = state;
	}
	
	
}
