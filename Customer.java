package model;

import java.io.IOException;
import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.DatabaseMetaData;




/**
 * 
 * @author Administrator
 * Customer: cname, cid, password, sex, phone, address
 * 			 customer, register
 */

public class Customer implements Serializable {
	static Customer Cu=null;
	protected String cname;
	protected  String cid;
	protected String password;
	protected String sex;
	protected String phone;
	protected String address;
	protected String image;
	
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	public Customer() {
		
	}
	
	public Customer(String cid, String password) {
		super();
		this.cid = cid;
		this.password = password;
		
		
	}
	
	public Customer(String cid, String cname, String password, String sex,
			String phone, String address) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.password = password;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		
	}
	
	public Customer(String cid, String cname, String password, String sex,
			String phone, String address, String image) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.password = password;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		this.image = image;
	}
	
	public Customer(String cid, String cname, String password, String sex,
			String phone, String address, float money) {
		super();
		this.cname = cname;
		this.cid = cid;
		this.password = password;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
	}
	
	
	/**用户登陆**/
	public static Customer cLogin(String cid, String password) throws SQLException, ClassNotFoundException {
		Customer customer = null;
		String sql = "select * from customer where cid='"+cid+"' and password='"+password+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		if(rs.next()) {
			customer = new Customer(rs.getString(1), rs.getString(2), rs.getString(3), 
					rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
		}
		
		return customer;
		
	}
	
	/**用户注册
	 * @return **/
	
	
	public static void register(String cid, String cname, String password,
			String sex, String phone, String address) throws SQLException, ClassNotFoundException {
		
		String sql = "insert into customer (cid,cname,password,sex,phone,address) values('"+cid+"','"+cname+"','"+password+"','"+sex+"','"
					+phone+"','"+address+"')";
		
		DatabaseConnect.getStat().executeUpdate(sql);
			
		
	}
	
	
	
	
	
	/**查看收藏
	 * @throws ClassNotFoundException 
	 * @throws SQLException **/
	
	public static ArrayList<Favorite> viewAllFavorite(String cid) throws SQLException, ClassNotFoundException {
		
		ArrayList<Favorite> favorite = new ArrayList<Favorite>();
		
		String sql = "select * from collection where cid='"+cid+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		while(rs.next()) {
			
			favorite.add(new Favorite(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4)));
		}
		
		return favorite;
		
	}
	/**
	 * 顾客修改个人信息
	 */
	public static void editInformation(String cid,String cname,String phone,String address) throws SQLException, ClassNotFoundException{
			String sql="update customer set cname='"+cname+"', phone='"+phone+"', address='"+address+"' where cid='"+cid+"'";
			DatabaseConnect.getStat().executeUpdate(sql);
	}
	
	/**
	 * 主页显示商家
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public ArrayList<Shop> viewAllShop() throws SQLException, ClassNotFoundException {
		
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
	
	/**
	 *用户查看已获取的红包 
	 */
	
    public static ArrayList<RedEvenlope> viewRedEvenlope(String cid) throws SQLException, ClassNotFoundException {
		
		ArrayList<RedEvenlope> redevenlopes = new ArrayList<RedEvenlope>();
		
		String sql = "select * from credevenlope where cid='"+cid+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		while(rs.next()) {
			redevenlopes.add(new RedEvenlope(rs.getString(1), rs.getString(2),rs.getString(3), 
					rs.getString(4), rs.getFloat(5), rs.getString(6), rs.getString(7)));
		}
		
		return redevenlopes;
		
		
	}
	/**
	 * 用户获取红包
	 */

	public static void addRedEvenlope(String cid, String cname, String bid, String bname, float favorable, String status) throws SQLException, ClassNotFoundException {
		
		String sql = "insert into credevenlope(cid, cname, bid, bname, favorable, status) " +
				"values('"+cid+"','"+cname+"','"+bid+"','"+bname+"','"+favorable+"','"+status+"')";
		DatabaseConnect.getStat().executeUpdate(sql);
	}
	
	/**
	 * 用户使用红包
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void useRedEvenlope(String cid, String bid, String isused) throws SQLException, ClassNotFoundException {
		
		String sql = "update credevenlope set isused='"+isused+"' where cid='"+cid+"' and bid='"+bid+"'";
		DatabaseConnect.getStat().executeUpdate(sql);
	}
	
	/**
	 * 判断用户领取红包
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public String isGetRedEvenlope(String cid, String bid) throws SQLException, ClassNotFoundException {
		
		String status = "";
		
		String sql = "select status from credevenlope where cid='"+cid+"' and bid='"+bid+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		if(rs.next()) {
			status = rs.getString("status");
		}
		
		return status;
	}

	/**
	 * 用户评论
	 */
	

	public static void commentFood(String cid, String cname, String bid, 
			String bname, String foodId, String foodName, String comment) throws SQLException, ClassNotFoundException {
		
		String sql = "insert into comment(cid, cname, bid, bname, foodid, foodname, comment) " +
				"values('"+cid+"','"+cname+"','"+bid+"','"+bname+"','"+foodId+"','"+foodName+"','"+comment+"')";
			
		DatabaseConnect.getStat().executeUpdate(sql);
		
	}
	
	/**
	 * 顾客搜索添加收藏
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public static void addcollection(String foodname,String image,String bname,String sid,String sname,String cid) throws SQLException, ClassNotFoundException{
		String sql = "insert into collection(foodname,image,bname,sid,sname,cid) " +
		"values('"+foodname+"','"+image+"','"+bname+"','"+sid+"','"+sname+"','"+cid+"')";
		DatabaseConnect.getStat().executeUpdate(sql);
	}
	
	/**
	 * 客户删除收藏的东西
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void deleteCollection(String foodname) throws SQLException, ClassNotFoundException{
		String sql ="delete from collection where foodname='"+foodname+"'";
		DatabaseConnect.getStat().executeUpdate(sql);
	}

}
