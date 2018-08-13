package model;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.Date;

public class Comment implements Serializable {
	
	private String cid;
	private String cname;
	private String cimage;
	private String bid;
	private String bname;
	private String foodid;
	private String foodName;
	private String comment;
	private String breplay;
	private Date time;
	
	
	
	public String getCid() {
		return cid;
	}



	public void setCid(String cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public String getCimage() {
		return cimage;
	}



	public void setCimage(String cimage) {
		this.cimage = cimage;
	}



	public String getBid() {
		return bid;
	}



	public void setBid(String bid) {
		this.bid = bid;
	}



	public String getBname() {
		return bname;
	}



	public void setBname(String bname) {
		this.bname = bname;
	}



	public String getFoodid() {
		return foodid;
	}



	public void setFoodid(String foodid) {
		this.foodid = foodid;
	}



	public String getFoodName() {
		return foodName;
	}



	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}



	public String getComment() {
		return comment;
	}



	public void setComment(String comment) {
		this.comment = comment;
	}



	public String getBreplay() {
		return breplay;
	}



	public void setBreplay(String breplay) {
		this.breplay = breplay;
	}



	public Date getTime() {
		return time;
	}



	public void setTime(Date time) {
		this.time = time;
	}



	public Comment(String cid, String cname, String cimage, String bid,
			String bname, String foodid, String foodName, String comment,
			String breplay, Date time) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cimage = cimage;
		this.bid = bid;
		this.bname = bname;
		this.foodid = foodid;
		this.foodName = foodName;
		this.comment = comment;
		this.breplay = breplay;
		this.time = time;
	}
	
	/**
	 * ¹Ë¿ÍÆÀÂÛ
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws IOException 
	 */
	public static void comment(String cid,String cname,String bid,String bname,String foodname,String evaluate) throws SQLException, ClassNotFoundException{
		String sql = "insert into comment (cid,cname,bid,bname,foodid,foodname,comment) " +
		"values ('"+cid+"','"+cname+"',"+bid+",'"+bname+"','"+"102f1"+"','"+foodname+"','"+evaluate+"')";
		DatabaseConnect.getStat().executeUpdate(sql);
	}
	
}
