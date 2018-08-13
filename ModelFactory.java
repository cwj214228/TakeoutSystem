package model;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
/**
 * 
 * @author Administrator
 * ModelFactory: cLogin, bLogin, coLogin, aLogin, getShopDate
 */

public class ModelFactory {
	static Customer Cu=null;
	/**用户登陆
	 * @throws ClassNotFoundException 
	 * @throws SQLException */
	
	public static Customer cLogin(String cid, String password) throws SQLException, ClassNotFoundException {
		System.out.println("ceshi");
		return new Customer().cLogin(cid, password);
	}
	
	/**商家登陆
	 * @throws ClassNotFoundException 
	 * @throws SQLException */

	public static Business bLogin(String bid, String password) throws SQLException, ClassNotFoundException {
		Business business;
		business=Business.bLogin(bid, password);
		return business;
		
	}
	
	/**外卖员登陆
	 * @throws ClassNotFoundException 
	 * @throws SQLException */
	
	public static Courier coLogin(String coid, String password) throws SQLException, ClassNotFoundException {
		
		return new Courier().coLogin(coid, password);
	}
	
	/**管理员登陆*/
	public static Administrator aLogin(String id, String password) throws SQLException, ClassNotFoundException {
		
		Administrator administrator = null;
		String sql = "select * from Administrator where id='"+id+"' and password='"+password+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		if(rs.next()) {
			administrator = new Administrator(id, password);
		}
		
		return administrator;
	}
	
	public void getShopDate() {
		
	}
	
	
	/**查看所有外卖
	 * @throws ClassNotFoundException 
	 * @throws SQLException */
	public static ArrayList<Food> viewAllFoods(Homepage homepage) throws SQLException, ClassNotFoundException {
		return homepage.viewAllFood();
	}
	
	/**用户注册
	 * @throws IOException */
	
	
	public static void customerRegister(String cid, String cname,
			String password,String sex, String phone, String address) throws SQLException, ClassNotFoundException {
		
		Customer.register(cid, cname, password, sex, phone, address);
		

		
	}
	
	
	/**商家注册*/
	
	
	public static void businessRegister(String bid, String bname,
			String password, String phone, String address) throws SQLException, ClassNotFoundException {
		
		Business.register(bid, bname, password, phone, address);
		
		
	}
	/**外卖员注册*/
	
	
	public static void courierRegister(String coid, String coname, 
			String password, String phone, String information) throws SQLException, ClassNotFoundException {
		
		Courier.register(coid, coname, password, phone, information);	
		
	}
	
	/**
	 * 用户功能
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	
	/**查看收藏**/
	public static ArrayList<Favorite> viewAllFavorite(String cid) throws SQLException, ClassNotFoundException {
		ArrayList<Favorite> viewAllFavorite=Customer.viewAllFavorite(cid);
		return viewAllFavorite;
	}
	
	/**
	 * 用户搜索结果
	 */
	public static ArrayList<Food> searchResult(String search) throws SQLException, ClassNotFoundException {
		ArrayList<Food> foods=null;
		foods=Food.searchResult(search);
		return foods; 
	}
	
	/**用户查看已获红包
	 * @throws ClassNotFoundException 
	 * @throws SQLException **/
	public static ArrayList<RedEvenlope> viewCRedEvenlope(Customer customer, String cid) throws SQLException, ClassNotFoundException {
		return customer.viewRedEvenlope(cid);
	}
	
	/**
	 * 用户删除红包
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	/*public static void deleteCRedEvenlope(Business business, String bid, String eid) throws SQLException, ClassNotFoundException {
		business.deleteRedEvenlope(bid, eid);
	}*/
	
	/**
	 * 用户添加红包
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void addCRedEvenlope(Customer customer, String cid, String cname, String bid, String bname,
			float favorable, String status) throws SQLException, ClassNotFoundException {
		customer.addRedEvenlope(cid, cname, bid, bname, favorable, status);
	}
	
	
	/**
	 *用户使用红包 
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void useRedEvenlope(String cid, String bid, String isused) throws SQLException, ClassNotFoundException {
		Customer.useRedEvenlope(cid, bid, isused);
	}
	
	
	
	/**
	 * 用户评论
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void commentFood(String cid, String cname, String bid, 
			String bname, String foodId, String foodName, String comment) throws SQLException, ClassNotFoundException {
		
		Customer.commentFood(cid, cname, bid, bname, foodId, foodName, comment);
	}
	
	
	
	
	/**
	 * 商家功能
	 */
	
	/**商家修改个人信息
	 * @throws ClassNotFoundException 
	 * @throws SQLException **/
	public static void modifyInformation(Business business, String bid, String phone, String address) throws SQLException, ClassNotFoundException {
		
		business.modifyInformation(bid, phone, address);
	}
	
	
	/**商品上架
	 * @throws ClassNotFoundException 
	 * @throws SQLException */
	
	/*public static void upFood(String foodName, int foodPrice, 
			String foodInformation, int sellcount) throws SQLException, ClassNotFoundException {
		
		Food.upFood(foodName, foodPrice, foodInformation, sellcount);
		
		
	}*/
	
	
	public static void upFood(String bid, String bname, String foodId, String foodName, float foodPrice, 
			String foodInformation, String foodimage, int sellcount) throws SQLException, ClassNotFoundException {
		
		Food.upFood(bid, bname, foodId, foodName, foodPrice, foodInformation, foodimage, sellcount);
		
		
	}
	
	/*public static void upFood(String foodImage) throws SQLException, ClassNotFoundException {
		
		String sql = "insert into image (image) " +
				"values('"+foodImage+"')";
		
		DatabaseConnect.getStat().executeUpdate(sql);
	}*/
	
	/**物品下架*/
	
	public static void downFood(Food food, String foodId) throws SQLException, ClassNotFoundException {
		food.downFood(foodId);
	}
	
	/**开业*/
	
	public static void openShop(Business business, String bname) throws SQLException, ClassNotFoundException {
		business.openShop(bname);
	}
	
	/**结业*/
	
	public static void closeShop(Business business, String bname) throws SQLException, ClassNotFoundException {
		business.closeShop(bname);
	}
	
	/**查看所有评论
	 * @throws ClassNotFoundException 
	 * @throws SQLException */
	
	/*public static ArrayList<Comment> viewAllComments(Business business) throws SQLException, ClassNotFoundException {
		return business.viewAllComment();
	}*/
	
	public static ArrayList<Comment> viewAllComments(Business business, String bid, String foodid) throws SQLException, ClassNotFoundException {
		return business.viewAllComment(bid, foodid);
	}
	
	
	/**
	 * 回复评论
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	
	public static void replayComment(Business business, String cid, String replay) throws SQLException, ClassNotFoundException {
		business.replayComment(cid, replay);
	}
	
	
	/**商家查看店下红包
	 * @throws ClassNotFoundException 
	 * @throws SQLException **/
	public static ArrayList<RedEvenlope> viewRedEvenlope(Business business, String bid) throws SQLException, ClassNotFoundException {
		return Business.viewRedEvenlope(bid);
	}
	
	/**
	 * 商家删除红包
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void deleteRedEvenlope(Business business, String bid, String eid) throws SQLException, ClassNotFoundException {
		business.deleteRedEvenlope(bid, eid);
	}
	
	/**
	 * 商家添加红包
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static void addRedEvenlope(Business business, String bid, String bname, String eid, float lowerlimit,
			float favorable, String descript) throws SQLException, ClassNotFoundException {
		business.addRedEvenlope(bid, bname, eid, lowerlimit, favorable, descript);
	}
	
	/**查看所有订单**/
	public static ArrayList<Order> viewAllOrder(Business business) throws SQLException, ClassNotFoundException {
		return business.viewAllOrder();
	}
	
	/**主页展示商店图片等信息**/
	public static ArrayList<Shop> showShops() throws SQLException, ClassNotFoundException {
		ArrayList<Shop> showShops;
		showShops=Shop.showShops();
		return showShops;
	}
	
	
	/**
	 * 商家管理自家的食物
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static ArrayList<Food> showFood(String bid) throws SQLException, ClassNotFoundException{
		ArrayList<Food> showFood;
		showFood=Food.showFood(bid);
		return showFood;
	}
	/***
	 * 商家登陆成功后，获取自家商店的信息
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static Shop getShop(String bid) throws SQLException, ClassNotFoundException{
		Shop shop=null;
		shop=Shop.getShop(bid);
		return shop;
	}
	
	/**
	 * 主页显示所有商家
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	public static ArrayList<Shop> viewAllShop(Customer customer) throws SQLException, ClassNotFoundException {
		return customer.viewAllShop();
	}
	/**
	 * 用户查看订单
	 * @param cid
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static ArrayList<Order> viewOrder(String cid) throws SQLException, ClassNotFoundException{
		ArrayList<Order> viewOrder=null;
		viewOrder=Order.viewOrder(cid);
		return viewOrder;
	}
	
	/**
	 * 顾客评论
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws IOException 
	 */
	public static void comment(String cid,String cname,String bid,String bname,String foodname,String evaluate) throws SQLException, ClassNotFoundException{
		Comment comments=null;
		comments.comment(cid, cname, bid, bname, foodname, evaluate);
	}
	
	/**
	 * 顾客购买食物
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	/*public static void buyFood(String foodName,String foodImage,String price,String cid,String sid,String shop,int count,String shopName) throws SQLException, ClassNotFoundException{
		Food.buyFood(foodName, foodImage, price, cid, sid, shop,count,shopName);
	}*/

	
	public static void buyFood(String bid, String bname, String foodid, String foodName,
			String foodImage, String cid, String cname, float price,
			int count, String state) throws SQLException, ClassNotFoundException{
		
		Food.buyFood(bid, bname, foodid, foodName, foodImage, cid, cname, price, count, state);
		
	}
	
	
	/**
	 * 顾客修改个人信息
	 */
	public static void editInformation(String cid,String cname,String phone,String address) throws SQLException, ClassNotFoundException{
		Customer.editInformation(cid,cname, phone, address);
		
	}
	
	/**
	 * 顾客搜索添加收藏
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public static void addcollection(String foodname,String image,String bname,String sid,String sname,String cid) throws SQLException, ClassNotFoundException{
		Customer.addcollection(foodname, image, bname, sid, sname, cid);
	}
	
	/**
	 * 客户删除收藏的东西
	 * @return 
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void deleteCollection(String foodname) throws SQLException, ClassNotFoundException{
		Customer.deleteCollection(foodname);
	}
	
	/**
	 * 判断商家否营业
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 */
	
	public static String judgeOperating(String bid) throws SQLException, ClassNotFoundException {
		return Business.judgeOperating(bid);
	}
}
