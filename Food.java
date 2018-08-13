package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

/**
 * 
 * @author Administrator
 * Food: foodname, foodid, sellcount, price, discount, foodInformation, comment
 *		 Food, getFoodDate,, addFood, alterDate, delete, customerComment
 */
public class Food implements Serializable{
	
	protected String sid;
	protected String sname;
	protected String foodName;
	protected String foodId;
	protected float foodPrice;
	protected int sellCount;
	protected float discount;
	protected String foodInformation;
	protected String comment;
	protected int sellcount;
	protected String image;
	
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSellCount() {
		return sellCount;
	}
	public void setSellCount(int sellCount) {
		this.sellCount = sellCount;
	}
	public String getFoodName() {
		return foodName;
	}
	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodId() {
		return foodId;
	}
	public void setFoodId(String foodId) {
		this.foodId = foodId;
	}
	public float getFoodPrice() {
		return foodPrice;
	}
	public void setFoodPrice(float foodPrice) {
		this.foodPrice = foodPrice;
	}
	public int getCellCount() {
		return sellCount;
	}
	public void setCellCount(int sellCount) {
		this.sellCount = sellCount;
	}
	public String getFoodname() {
		return foodName;
	}
	public void setFoodname(String foodName) {
		this.foodName = foodName;
	}
	public String getFoodid() {
		return foodId;
	}
	public void setFoodid(String foodId) {
		this.foodId = foodId;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getSellcount() {
		return sellcount;
	}
	public void setSellcount(int sellcount) {
		this.sellcount = sellcount;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public String getFoodInformation() {
		return foodInformation;
	}
	public void setFoodInformation(String foodInformation) {
		this.foodInformation = foodInformation;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	public Food() {
		
	}
	
	public Food(String foodName,int foodPrice,
			String foodInformation, int sellCount) {
		super();
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.sellCount = sellCount;
		this.foodInformation = foodInformation;
		
	}
	
	/*public Food(String sid,String sname,String foodid,String foodname,
			float foodprice,String foodInformation,String image,int sellcount){
		this.sid=sid;
		this.sname=sname;
		this.foodId=foodid;
		this.foodName=foodname;
		this.foodPrice=foodprice;
		this.foodInformation=foodInformation;
		this.image=image;
		this.sellcount=sellcount;
	}*/
	
	/**上架食物**/
	public Food(String sid, String sname, String foodId, String foodName, float foodPrice, 
			String foodInformation, String foodImage, int sellCount) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.foodId = foodId;
		this.foodName = foodName;
		this.foodPrice = foodPrice;
		this.foodInformation = foodInformation;
		this.image = foodImage;
		this.sellCount = sellCount;
		
	}
	
	
	public Food(String sid, String sname, String foodName, String foodId,
			float foodPrice, int sellCount, float discount,
			String foodInformation, String comment, int sellcount, String image) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.foodName = foodName;
		this.foodId = foodId;
		this.foodPrice = foodPrice;
		this.sellCount = sellCount;
		this.discount = discount;
		this.foodInformation = foodInformation;
		this.comment = comment;
		this.sellcount = sellcount;
		this.image = image;
	}
	
	public Food(String foodId, String foodName, int sellCount, float discount,
			String foodInformation, String comment) {
		super();
		this.foodName = foodName;
		this.foodId = foodId;
		this.sellCount = sellCount;
		this.discount = discount;
		this.foodInformation = foodInformation;
		this.comment = comment;
	}
	
	/********访问数据库***********/
	
	public void getFoodDate() {
		
	}
	
	/*********插入数据到数据库，上架菜式******/
	
	
	public static void upFood(String bid, String bname, String foodId, String foodName, float foodprice, 
			String foodInformation, String foodImage, int sellcount) throws SQLException, ClassNotFoundException {
			
		String sql = "insert into food3 (bid, bname, foodid, foodname, foodprice, descript, foodimage, sellcount) " +
				"values('"+bid+"','"+bname+"','"+foodId+"','"+foodName+"','"
			+foodprice+"','"+foodInformation+"','"+foodImage+"','"+sellcount+"')";
		DatabaseConnect.getStat().executeUpdate(sql);
			
	
	}
	/*
	public static void upFood(String foodName, Float foodprice, 
			String foodInformation, String foodImage, int sellcount) throws SQLException, ClassNotFoundException {
			
		String sql = "insert into food3 (foodname, foodprice, descript, foodimage, sellcount) " +
				"values('"+foodName+"','"
			+foodprice+"','"+foodInformation+"','"+foodImage+"','"+sellcount+"')";
		DatabaseConnect.getStat().executeUpdate(sql);
			
	
	}*/
	
	/********修改数据库信息*******************/
	
	public void alterDate() {
		
	}
	
	/********删除数据库某些信息，下架菜式
	 * @throws ClassNotFoundException 
	 * @throws SQLException ******/
	
	public void downFood(String foodId) throws SQLException, ClassNotFoundException {
		
		/*ResultSet rs = DatabaseConnect.getStat().executeQuery("select * from food where foodname='"+foodName+"'");
		
		if(rs.next()) {
			String sql = "delete from food where foodname='"+foodName+"'";
			DatabaseConnect.getStat().executeUpdate(sql);
			JOptionPane.showMessageDialog(null, "物品下架成功");
		} else {
			JOptionPane.showMessageDialog(null, "查不此物品");
		}*/
		
		String sql = "delete from food3 where foodid='"+foodId+"'";
		DatabaseConnect.getStat().executeUpdate(sql);
		JOptionPane.showMessageDialog(null, "物品下架成功");
	}
	
	/**
	 * 用户搜索
	 */
	public static ArrayList<Food> searchResult(String search) throws SQLException, ClassNotFoundException {
		ArrayList<Food> foods= new ArrayList<Food>();
		String sql = "select * from food2 where foodname like '%"+search+"%'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		while(rs.next()) {
			foods.add(new Food(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getFloat(5), rs.getString(6),rs.getString(7),
						rs.getInt(8)));
		}
		
		return foods;
	}
	
	/**
	 * 商家管理自家的食物
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static ArrayList<Food> showFood(String bid) throws SQLException, ClassNotFoundException{
		ArrayList<Food> showFood= new ArrayList<Food>();
		String sql = "select * from food3 where bid='"+bid+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		while(rs.next()) {
			showFood.add(new Food(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getFloat(5),rs.getString(6),rs.getString(7),rs.getInt(8)));
		}
		return showFood;
	}
	
	/**
	 * 用户购买食物
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	/*public static void buyFood(String foodName,String foodImage,String price,String cid,String sid,String shop,int count,String shopName) throws SQLException, ClassNotFoundException{
		String sql = "insert into order2 (foodname,foodimage,price,cid,sid,shop,count,shopname,state) " +
				"values ('"+foodName+"','"+foodImage+"',"+price+",'"+cid+"','"+sid+"','"+shop+"',"+count+",'"+shopName+"','"+"未完成"+"')";
		DatabaseConnect.getStat().executeUpdate(sql);
	}*/
	
	
	public static void buyFood(String bid, String bname, String foodid, String foodName,
			String foodImage, String cid, String cname, float price,
			int count, String state) throws SQLException, ClassNotFoundException{
		
		String sql = "insert into order2 (bid, bname, foodid, foodname, foodimage, cid, cname, price, count, state) " +
				"values('"+bid+"','"+bname+"','"+foodid+"','"+foodName+"','"+foodImage+"','"+cid+"','"
				+cname+"','"+price+"','"+count+"','"+state+"')";
		
		DatabaseConnect.getStat().executeUpdate(sql);
	}
	
	/********用户评论，向数据库插入信息*************/
	
	public void customerComment() {
		
		
	}
}
