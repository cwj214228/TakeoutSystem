package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * 
 * @author Administrator
 * Shop: sid, sname, score, address, information, type, evaluate, cellcount,State
 *  	 Shop
 */

public class Shop implements Serializable{
	protected String sid;
	protected String sname;
	protected float score;
	protected int cellCount;		//销量
	protected int lowest;			//起送
	protected int fare;				//配送费
	protected int average;			//人均消费
	protected String information;
	protected String images;
	protected String type;
	protected String evaluate;
	protected String state;		//判断是否开店
	protected String simage;
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	public int getCellCount() {
		return cellCount;
	}
	public void setCellCount(int cellCount) {
		this.cellCount = cellCount;
	}
	
	public String getSimage() {
		return simage;
	}
	public void setSimage(String simage) {
		this.simage = simage;
	}
	public int getLowest() {
		return lowest;
	}
	public void setLowest(int lowest) {
		this.lowest = lowest;
	}
	public int getFare() {
		return fare;
	}
	public void setFare(int fare) {
		this.fare = fare;
	}
	public int getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getScore() {
		return score;
	}
	public void setScore(float score) {
		this.score = score;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}
	public int getCellcount() {
		return cellCount;
	}
	public void setCellcount(int cellCount) {
		this.cellCount = cellCount;
	}	
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public String getImages() {
		return images;
	}
	public void setImages(String images) {
		this.images = images;
	}
	public Shop(String sid, String sname, String information, String images) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.information = information;
		this.images=images;
	}
	public Shop(String sid, String simage, String sname, int score, int cellCount, int lowest,
			int fare, int average, String stype) {
		super();
		this.sid = sid;
		this.simage = simage;
		this.sname = sname;
		this.score = score;
		this.cellCount = cellCount;
		this.lowest = lowest;
		this.fare = fare;
		this.average = average;
		this.type = stype;
		
	}
	
	/*****访问数据库
	 * @throws SQLException 
	 * @throws ClassNotFoundException ******/
	
	/*public static ArrayList<Shop> showShops() throws SQLException, ClassNotFoundException{
		ArrayList<Shop> shops= new ArrayList<Shop>();
		String sql = "select * from shop";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		while(rs.next()) {
			shops.add(new Shop(rs.getString(1), rs.getString(2), rs.getString(10),
						rs.getString(3)));
		}
		return shops;
	}*/
	
	/**
	 * 主页显示商家
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static ArrayList<Shop> showShops() throws SQLException, ClassNotFoundException {
		
		ArrayList<Shop> shop = new ArrayList<Shop>();
		
		String sql = "select * from shop3";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		while(rs.next()) {
			shop.add(new Shop(rs.getString(1), rs.getString(3), rs.getString(2), rs.getInt(4),
					rs.getInt(5), rs.getInt(6), rs.getInt(7), rs.getInt(8),
					rs.getString(9)));
		}
		
		return shop;
	}
	
	
	/*****更新数据，修改商店信息**************/
	
	/***
	 * 商家登陆成功后，获取自家商店的信息
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static Shop getShop(String bid) throws SQLException, ClassNotFoundException{
		Shop shop=null;
		String sql = "select * from shop2 where sid='"+bid+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		while(rs.next()) {
			shop=new Shop(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4));
		}
		return shop;
	}
	
	public void alterShop() {
		
	}
}
