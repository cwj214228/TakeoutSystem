package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 
 * @author Administrator
 * Order: foodId, foodName, count, price, orderTime, remark, state
 * 		  Order, customerPlaceOrder, customerCancelOrder, 
 * 		  courierPlaceOrder, courierCancelOrder
 */

public class Order implements Serializable {

	private String foodId;
	private String foodName;
	private String foodImage;
	private int count;
	private float price;
	private String orderTime;
	private String remark;
	private String state; 
	private String cid;
	private String sid;
	
	
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
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
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(String orderTime) {
		this.orderTime = orderTime;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public Order(String foodId, String foodName, int count, float price,
			String orderTime, String remark, String state,String cid) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.count = count;
		this.price = price;
		this.orderTime = orderTime;
		this.remark = remark;
		this.state = state;
		this.cid=cid;
	}
	
	
	public Order(String foodId, String foodName, String foodImage, int count,
			float price, String orderTime, String remark, String state) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodImage = foodImage;
		this.count = count;
		this.price = price;
		this.orderTime = orderTime;
		this.remark = remark;
		this.state = state;
		
	}
	

	
	public Order(String foodId, String foodName, String foodImage, int count,
			float price, String orderTime, String remark, String state,String cid) {
		super();
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodImage = foodImage;
		this.count = count;
		this.price = price;
		this.orderTime = orderTime;
		this.remark = remark;
		this.state = state;
		this.cid=cid;
	}
	
	
	
	public Order(String foodName, String foodImage, float price, String sid,
			String remark, String state) {
		super();
		this.foodName = foodName;
		this.foodImage = foodImage;
		this.price = price;
		this.sid = sid;
		this.remark = remark;
		this.state = state;
		
	}
	/**
	 * 用户查看订单
	 * @param cid
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static ArrayList<Order> viewOrder(String cid) throws SQLException, ClassNotFoundException{
		System.out.println(cid);
		ArrayList<Order> viewOrder=new ArrayList<Order>();
		String sql = "select foodname,foodimage,price,sid,shopname,state from order2_copy where cid ='"+cid+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		while(rs.next()) {
			viewOrder.add(new Order(rs.getString(1), rs.getString(2), rs.getFloat(3),rs.getString(4),
					rs.getString(5), rs.getString(6)));
		} 
		return viewOrder;
	}
}
