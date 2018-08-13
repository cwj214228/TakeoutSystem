package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

/**
 * 
 * @author Administrator
 * Business: bname, bid, password, phone, information
 * 			 Business, register, addFood
 */

public class Business implements Serializable {

	protected String bname;
	protected String bid;
	protected String password;
	protected String phone;
	protected String information;
	protected String address;
	protected int foodNum;
	
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getInformation() {
		return information;
	}
	public void setInformation(String information) {
		this.information = information;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public int getFoodNum() {
		return foodNum;
	}
	public void setFoodNum(int foodNum) {
		this.foodNum = foodNum;
	}
	
	public Business() {
		
	}
	
	public Business(String bid, String password) {
		super();
		this.bid = bid;
		this.password = password;
		
	}
	
	public Business(String bid, String bname, String password, String phone, String address) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}
	
	/*
	public Business(String bname, String bid, String password, String phone,
			String information) {
		super();
		this.bname = bname;
		this.bid = bid;
		this.password = password;
		this.phone = phone;
		this.information = information;
	}
	*/
	
	/*商家登陆*/
	public static Business bLogin(String bid, String password) throws SQLException, ClassNotFoundException {
		
		Business business = null;
		String sql = "select * from business where bid='"+bid+"' and password='"+password+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		if(rs.next()) {
			business = new Business(rs.getString(1), rs.getString(2), rs.getString(3), 
					rs.getString(4), rs.getString(5));
		}
		
		return business;
		
	}
	
	/*商家注册*/

	public static void register(String bid, String bname, String password,
			String phone, String address) throws SQLException, ClassNotFoundException {
	
		
		String sql = "insert into business (bid,bname,password,phone,address) values('"+bid+"','"+bname+"','"+password+"','"
			+phone+"','"+address+"')";
		DatabaseConnect.getStat().executeUpdate(sql);
		
	}
	
	/**商家修改个人信息
	 * @throws ClassNotFoundException 
	 * @throws SQLException **/
	
	public static void modifyInformation(String bid, String phone, String address) throws SQLException, ClassNotFoundException {
		ResultSet rs = DatabaseConnect.getStat().executeQuery("select * from business where bid='"+bid+"'");
		
		if(rs.next()) {
			String  sql = "update business set phone='"+phone+"',address='"+address+"' where bid='"+bid+"'";
			DatabaseConnect.getStat().executeUpdate(sql);
		}
	}
	

	
	/*开业*/
	public void openShop(String bname) throws SQLException, ClassNotFoundException {
		
		ResultSet rs = DatabaseConnect.getStat().executeQuery("select * from status where bname='"+bname+"'");
		
		if(rs.next()) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			System.out.println(dateFormat.format(new Date()));
			String sql = "update status set bstatus='开业',opentime='"+dateFormat.format(new Date())+"' where bname='"+bname+"'";
			DatabaseConnect.getStat().executeUpdate(sql);
		}
	}
	
	/*休息*/
	public void closeShop(String bname) throws SQLException, ClassNotFoundException {
		
		ResultSet rs = DatabaseConnect.getStat().executeQuery("select * from status where bname='"+bname+"'");
		
		if(rs.next()) {
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			System.out.println(dateFormat.format(new Date()));
			String sql = "update status set bstatus='休息',opentime='"+dateFormat.format(new Date())+"' where bname='"+bname+"'";
			DatabaseConnect.getStat().executeUpdate(sql);
		}
	}
	
	/*查看所有评论*/
	
	
	public ArrayList<Comment> viewAllComment(String bid,String foodid) throws SQLException, ClassNotFoundException {
		
		ArrayList<Comment> comments = new ArrayList<Comment>();
		
		String sql = "select * from comment where bid='"+bid+"' and foodid='"+foodid+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		while(rs.next()) {
			comments.add(new Comment(rs.getString(1), rs.getString(2), rs.getString(3), 
					rs.getString(4), rs.getString(5), rs.getString(6), 
					rs.getString(7), rs.getString(8), rs.getString(9), 
					rs.getTimestamp(10)));
		}
		
		return comments;
	}

	/*回复评论*/
	
	
	public void replayComment(String cid, String replay) throws SQLException, ClassNotFoundException {
		
		String sql = "select * from comment where cid='"+cid+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		String breplay = "";
		if(rs.next()) {
			breplay = rs.getString(9);
		}
		
		
		String sql1 = "update comment set breplay='"+breplay+" "+replay+"' where cid='"+cid+"'";
		DatabaseConnect.getStat().executeUpdate(sql1);
			
		
		
	}
	
	
	/*查看用户订单*/
	public ArrayList<Order> viewAllOrder() throws SQLException, ClassNotFoundException {
		ArrayList<Order> orders = new ArrayList<Order>();
		
		String sql = "select * from vieworder";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		while(rs.next()) {
			orders.add(new Order(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getInt(4), rs.getFloat(5), rs.getString(6),rs.getString(7),
						rs.getString(8)));
		}
		
		return orders;
	}
	
	/**
	 * 查看商家店下的菜品数量
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * */
	
	public Integer searchFoodNum(String bid) throws SQLException, ClassNotFoundException {
		
		String sql = "select count(*) from food3 where bid='"+bid+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		int num = 0;
		if(rs.next()) {
			num = rs.getInt(1);
		}
		
		return num;
		
	}
	
	
	
	/**
	 * 商家查看店下红包
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	
	public static ArrayList<RedEvenlope> viewRedEvenlope(String bid) throws SQLException, ClassNotFoundException {
		
		ArrayList<RedEvenlope> redevenlopes = new ArrayList<RedEvenlope>();
		
		String sql = "select * from bredevenlope where bid='"+bid+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		while(rs.next()) {
			redevenlopes.add(new RedEvenlope(rs.getString(1), rs.getString(2),rs.getString(3), 
					rs.getFloat(4), rs.getFloat(5), rs.getString(6)));
		}
		
		return redevenlopes;
		
		
	}
	
	/**
	 * 商家添加红包
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	
	public static void addRedEvenlope(String bid, String bname, String eid, float lowerlimit, float favorable, String descript) throws SQLException, ClassNotFoundException {
		
		String sql = "insert into bredevenlope(bid, bname, eid, lowerlimit, favorable, descript) " +
				"values('"+bid+"','"+bname+"','"+eid+"','"+lowerlimit+"','"+favorable+"','"+descript+"')";
		DatabaseConnect.getStat().executeUpdate(sql);
	}
	
	/**
	 * 查看商家店下的红包数量
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * */
	
	public Integer searchRedEvenlopeNum(String bid) throws SQLException, ClassNotFoundException {
		
		String sql = "select count(*) from bredevenlope where bid='"+bid+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		int num = 0;
		if(rs.next()) {
			num = rs.getInt(1);
		}
		
		return num;
		
	}
	
	
	/**
	 * 商家删除红包
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void deleteRedEvenlope(String bid, String eid) throws SQLException, ClassNotFoundException {
		
		String sql = "delete from bredevenlope where bid='"+bid+"' and eid='"+eid+"'";
		DatabaseConnect.getStat().executeUpdate(sql);
	}
	
	/**
	 * 判断商家是否营业中
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	
	public static String judgeOperating(String bid) throws SQLException, ClassNotFoundException {
		
		String sql = "select bstatus from status where bid='"+bid+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		String status = "";
		
		if(rs.next()) {
			status = rs.getString(1);
		}
		return status;
	}
}
