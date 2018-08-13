 package server;

import java.io.*;
import java.net.*;
import java.sql.SQLException;
import java.util.ArrayList;

import view.showGoods;

import model.*;

/**
 * 
 * @author Administrator
 * Client: ip, port, oos, ois, s
 * 		   Client, Clogin, Csignout, Cregister, Blogin, Bsignout ,Bregister,
 * 		   Cologin, Cosignout, Coregister, Alogin, Asignout
 */

public class Client implements Protocal {
	
	private String ip = "111.230.73.191";
	private int port = 1388;
	private ObjectOutputStream oos;
	private ObjectInputStream ois;
	
	public Client() throws UnknownHostException, IOException {
		Socket socket = new Socket(ip, port);
		
		oos = new ObjectOutputStream(socket.getOutputStream());
		ois = new ObjectInputStream(socket.getInputStream());
		
	}
	
	/**用户登陆**/
	public Customer cLogin(String id, String password) throws IOException, ClassNotFoundException {
		oos.writeInt(CUSTOMER_LOGIN);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		oos.writeUTF(password);
		oos.flush();
		
		Customer customer = (Customer) ois.readObject();
		return customer;
		
	}
	
	/**商家登陆**/
	public Business bLogin(String id, String password) throws IOException, ClassNotFoundException {
		oos.writeInt(BUSINESS_LOGIN);
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		oos.writeUTF(password);
		oos.flush();
		
		Business business = (Business) ois.readObject();
		return business;
		
	}
	
	/**外卖登陆**/
	public Courier coLogin(String id, String password) throws IOException, ClassNotFoundException {
		oos.writeInt(COURIER_LOGIN );
		oos.flush();
		oos.writeUTF(id);
		oos.flush();
		oos.writeUTF(password);
		oos.flush();
		
		Courier courier = (Courier) ois.readObject();
		return courier;
		
		
	}
	
	/**管理员登陆**/
	public Administrator aLogin(String name, String password) {
		return null;
		
	}
	
	public void cSignout() {
		
	}
	
	public void bSignout() {
		
	}
	
	public void coSignout() {
		
	}
	
	public void aSignout() {
		
	}
	/**
	 * 顾客修改个人信息
	 */
	public void editInformation(String cid,String cname,String phone,String address) throws IOException, ClassNotFoundException {
		oos.writeInt(CUSTOMER_EDITINFORMATION);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		oos.writeUTF(cname);
		oos.flush();
		oos.writeUTF(phone);
		oos.flush();
		oos.writeUTF(address);
		oos.flush();
	}
	
	/**用户注册**/
	public void cRegister(String cid, String cname, String password,
			String sex, String phone, String address) throws IOException, ClassNotFoundException {
		
		oos.writeInt(CUSTOMER_REGISTER);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		oos.writeUTF(cname);
		oos.flush();
		oos.writeUTF(password);
		oos.flush();
		oos.writeUTF(sex);
		oos.flush();
		oos.writeUTF(phone);
		oos.flush();
		oos.writeUTF(address);
		oos.flush();
		
		
	}
	
	/**用户购买
	 * @throws IOException **/
	public void customerBuy(String sid,String cid,String foodid,int count,float price,String orderTime) throws IOException{
		oos.writeInt(CUSTOMER_BUY);
		oos.flush();
		oos.writeUTF(sid);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		oos.writeUTF(foodid);
		oos.flush();
		oos.writeInt(count);
		oos.flush();
		oos.writeFloat(price);
		oos.flush();
		oos.writeUTF(orderTime);
		oos.flush();
	}
	
	
	/**商家注册**/
	public void bRegister(String bid, String bname, String password, 
			String phone, String address) throws IOException {
		
		oos.writeInt(BUSINESS_REGISTER);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(bname);
		oos.flush();
		oos.writeUTF(password);
		oos.flush();
		oos.writeUTF(phone);
		oos.flush();
		oos.writeUTF(address);
		oos.flush();
		
	}
	
	/**外卖员注册**/
	public void coRegister(String coid,String coname, String password, 
			String phone, String information) throws IOException {
		
		oos.writeInt(COURIER_REGISTER);
		oos.flush();
		oos.writeUTF(coid);
		oos.flush();
		oos.writeUTF(coname);
		oos.flush();
		oos.writeUTF(password);
		oos.flush();
		oos.writeUTF(phone);
		oos.flush();
		oos.writeUTF(information);
		oos.flush();
		
		
	} 
	
	/**
	 * 用户功能
	 */
	
	
	
	/**查看收藏
	 * @throws ClassNotFoundException 
	 * @throws IOException **/
	
	public ArrayList<Favorite> viewAllFavorite(String cid) throws IOException, ClassNotFoundException {
		oos.writeInt(CUSTOMER_FAVORITE);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		ArrayList<Favorite> favorites = (ArrayList<Favorite>) ois.readObject();
		return favorites;
	}
	
	
	
	/**
	 *用户查看店下红包 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public ArrayList<RedEvenlope> viewCRedEvenlope(String cid) throws IOException, ClassNotFoundException {
		oos.writeInt(CUSTOMER_VIEWREDEVENLOPE);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		
		ArrayList<RedEvenlope> redevenlopes = (ArrayList<RedEvenlope>) ois.readObject();
		return redevenlopes;
	}
	
	/**
	 * 用户删除红包
	 * @throws IOException 
	 */
	
	/*public void deleteRedEvenlope(String bid, String eid) throws IOException {
		oos.writeInt(CUSTOMER_DELETEREDEVENLOPE);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(eid);
		oos.flush();
	}*/
	
	/**
	 *用户添加红包 
	 * @throws IOException 
	 */
	
	public void addCRedEvenlope(String cid, String cname, String bid, String bname,
			float favorable, String status) throws IOException {
		oos.writeInt(CUSTOMER_ADDREDEVENLOPE);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		oos.writeUTF(cname);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(bname);
		oos.flush();
		oos.writeFloat(favorable);
		oos.flush();
		oos.writeUTF(status);
		oos.flush();
	}
	
	
	/**
	 *用户使用红包 
	 * @throws IOException 
	 */
	public void useRedEvenlope(String cid, String bid, String isused) throws IOException {
		oos.writeInt(CUSTOMER_USEREDEVENLOPE);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(isused);
		oos.flush();
		
		
	}
	
	/**
	 * 用户评论
	 * @throws IOException 
	 */
	public void commentFood(String cid, String cname, String bid, 
			String bname, String foodId, String foodName, String comment) throws IOException {
		
		oos.writeInt(CUSTOMER_COMMENT);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		oos.writeUTF(cname);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(bname);
		oos.flush();
		oos.writeUTF(foodId);
		oos.flush();
		oos.writeUTF(foodName);
		oos.flush();
		oos.writeUTF(comment);
		oos.flush();
	}
	
	
	
	/**
	 * 商家登陆成功后，获取自家商店的信息
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public Shop getShop(String bid) throws IOException, ClassNotFoundException{
		oos.writeInt(BUSINESS_GETSHOP);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		Shop shop=null;
		shop=(Shop)ois.readObject();
		return shop;
	}
	
	/**商家管理自家的食物
	 * @throws IOException 
	 * @throws ClassNotFoundException **/
	public ArrayList<Food> showFood(String sid) throws IOException, ClassNotFoundException{
		oos.writeInt(BUSINESS_SHOWFOODS);
		oos.flush();
		oos.writeUTF(sid);
		oos.flush();
		ArrayList<Food> showFood=(ArrayList<Food>)ois.readObject();
		return showFood;
	}
	
	/**商家修改个人信息
	 * @throws IOException **/
	public void modifyInformation(String bid, String phone, String address) throws IOException {
		oos.writeInt(BUSINESS_MODIFYINFORMATION);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(phone);
		oos.flush();
		oos.writeUTF(address);
		oos.flush();
		
	}
	
	
	
	/**商品上架
	 * @throws IOException **/
	
	public void upFood(String bid, String bname, String foodId, String foodName, float foodprice, 
			String foodInformation, String foodImage, int sellcount) throws IOException {
		
		oos.writeInt(BUSINESS_UPFOOD);
		oos.flush();
		
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(bname);
		oos.flush();
		oos.writeUTF(foodId);
		oos.flush();
		oos.writeUTF(foodName);
		oos.flush();
		oos.writeFloat(foodprice);
		oos.flush();
		oos.writeUTF(foodInformation);
		oos.flush();
		
		File tempFile =new File(foodImage.trim()); 
		//String fileName = "E://JavaProject/takeoutsystem/Image/" + tempFile.getName();  
		String fileName = "C://Users/ASUS/Desktop/system1/Image/Food/" + tempFile.getName();      
		
	    oos.writeUTF(fileName);
		oos.flush();
		oos.writeInt(sellcount);
		oos.flush();
		
		FileInputStream fis = new FileInputStream(new File(foodImage));
			
		int len = 0;
		byte[]b = new byte[1024];
			
		while((len=fis.read(b))!= -1){
			oos.write(b,0,len);
			oos.flush();

		}
			
		oos.write(b,0,1);
		oos.flush();
		fis.close();
			
	
		
	}
	
	/**商品下架**/
	public void downFood(String foodId) throws IOException {
		oos.writeInt(BUSINESS_DOWNFOOD);
		oos.flush();
		oos.writeUTF(foodId);
		oos.flush();
	}
	
	/**开店
	 * @throws IOException **/
	public void openShop(String bname) throws IOException {
		oos.writeInt(BUSINESS_OPEN);
		oos.flush();
		oos.writeUTF(bname);
		oos.flush();
	}
	
	/**休息
	 * @throws IOException **/
	public void closeShop(String bname) throws IOException {
		oos.writeInt(BUSINESS_CLOSE);
		oos.flush();
		oos.writeUTF(bname);
		oos.flush();
	}
	
	public void customerReminder() {
		
	}
	
	/**商家查看评论
	 * @throws IOException 
	 * @throws ClassNotFoundException **/
	
	public ArrayList<Comment> viewAllComment(String bid, String foodid) throws IOException, ClassNotFoundException {
		oos.writeInt(BUSINESS_VIEWCOMMENT);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(foodid);
		oos.flush();
		ArrayList<Comment> comments = (ArrayList<Comment>) ois.readObject();
		return comments;
		
	}
	
	/**商家回复评论
	 * @throws IOException **/
	public void replayComment(String cid, String replay) throws IOException {
		oos.writeInt(BUSINESS_REPLAYCOMMENT);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		oos.writeUTF(replay);
		oos.flush();
	}
	
	/**商家查看用户订单
	 * @throws IOException 
	 * @throws ClassNotFoundException **/
	public ArrayList<Order> viewAllOrder() throws IOException, ClassNotFoundException {
		oos.writeInt(BUSINESS_VIEWORDER);
		oos.flush();
		
		ArrayList<Order> orders = (ArrayList<Order>) ois.readObject();
		return orders;
	}
	
	
	/**
	 *商家查看店下红包 
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public ArrayList<RedEvenlope> viewRedEvenlope(String bid) throws IOException, ClassNotFoundException {
		oos.writeInt(BUSINESS_VIEWREDEVENLOPE);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		
		ArrayList<RedEvenlope> redevenlopes = (ArrayList<RedEvenlope>) ois.readObject();
		return redevenlopes;
	}
	
	/**
	 * 商家删除红包
	 * @throws IOException 
	 */
	
	public void deleteRedEvenlope(String bid, String eid) throws IOException {
		oos.writeInt(BUSINESS_DELETEREDEVENLOPE);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(eid);
		oos.flush();
	}
	
	/**
	 *商家添加红包 
	 * @throws IOException 
	 */
	
	public void addRedEvenlope(String bid, String bname, String eid, 
			float lowerlimit, float favorable, String descript) throws IOException {
		oos.writeInt(BUSINESS_ADDREDEVENLOPE);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(bname);
		oos.flush();
		oos.writeUTF(eid);
		oos.flush();
		oos.writeFloat(lowerlimit);
		oos.flush();
		oos.writeFloat(favorable);
		oos.flush();
		oos.writeUTF(descript);
		oos.flush();
	}
	
	
	
	/**
	 * 用户搜索结果
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public ArrayList<Food> searchResult(String search) throws IOException, ClassNotFoundException{
		oos.writeInt(CUSTOMER_SEARCH);
		oos.flush();
		oos.writeUTF(search);
		oos.flush();
		ArrayList<Food> foods=(ArrayList<Food>)ois.readObject();
		return foods;
	}
	
	/**
	 * 主页展示商店信息
	 * @throws ClassNotFoundException 
	 * @throws IOException 
	 */
	public ArrayList<Shop> showShop() throws IOException, ClassNotFoundException{
		oos.writeInt(SHOWALLSHOP);
		oos.flush();
		ArrayList<Shop> shops=(ArrayList<Shop>)ois.readObject();
		return shops;
	}
	
	/**
	 * 顾客查看订单
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public ArrayList<Order> viewOrder(String cid) throws IOException, ClassNotFoundException {
		oos.writeInt(CUSTOMER_VIEWORDER);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		
		ArrayList<Order> viewOrder=(ArrayList<Order>)ois.readObject();
		return viewOrder;
	}
	
	/**
	 * 顾客评论
	 * @throws IOException 
	 */
	public void comment(String cid,String cname,String bid,String bname,String foodname,String evaluate) throws IOException{
		oos.writeInt(CUSTOMER_EVOLUATE);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		oos.writeUTF(cname);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(bname);
		oos.flush();
		oos.writeUTF(foodname);
		oos.flush();
		oos.writeUTF(evaluate);
		oos.flush();
	}
	
	
	/**
	 * 顾客购买食物
	 * @return 
	 * @throws ClassNotFoundException 
	 * @throws SQLException 
	 * @throws IOException 
	 */
	public void buyFood(String bid, String bname, String foodid, String foodName,
			String foodImage, String cid, String cname, float price,
			int count, String state) throws SQLException, ClassNotFoundException, IOException{
		
		oos.writeInt(CUSTOMER_BUYFOOD);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(bname);
		oos.flush();
		oos.writeUTF(foodid);
		oos.flush();
		oos.writeUTF(foodName);
		oos.flush();
		oos.writeUTF(foodImage);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		oos.writeUTF(cname);
		oos.flush();
		oos.writeFloat(price);
		oos.flush();
		oos.writeInt(count);
		oos.flush();
		oos.writeUTF(state);
		oos.flush();
		
	}
	
	/**
	 * 顾客搜索添加收藏
	 * @throws IOException 
	 */
	public void addcollection(String foodname,String image,String bname,String sid,String sname,String cid) throws IOException{
		oos.writeInt(CUSTOMER_COLLECTION);
		oos.flush();
		oos.writeUTF(foodname);
		oos.flush();
		oos.writeUTF(image);
		oos.flush();
		oos.writeUTF(bname);
		oos.flush();
		oos.writeUTF(sid);
		oos.flush();
		oos.writeUTF(sname);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
	}
	
	/**
	 * 客户删除收藏的东西
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public void deleteCollection(String foodname) throws IOException, ClassNotFoundException{
		oos.writeInt(CUSTOMER_DELETECOLLECTION);
		oos.flush();
		oos.writeUTF(foodname);
		oos.flush();
	}
	
	/**
	 * 聊天功能
	 */
	
	/**
	 * 用户联系商家
	 * @throws IOException 
	 */
	
	public void connectBusiness(String cid, String bid, String message) throws IOException {
		oos.writeInt(CUSTOMER_CONNECTBUSINESS);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(message);
		oos.flush();
	}
	
	/**
	 * 用户读取商家发送的信息
	 * @throws IOException
	 */
	
	public String readBusinessMessage() throws IOException {
		return ois.readUTF();
	}
	
	/**
	 * 商家联系用户
	 * @throws IOException 
	 */
	
	public void connectCustomer(String bid, String cid, String message) throws IOException {
		oos.writeInt(BUSINESS_CONNECTCUSTOMER);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		oos.writeUTF(cid);
		oos.flush();
		oos.writeUTF(message);
		oos.flush();
	}
	
	/**
	 * 商家读取用户发送的信息
	 * @throws IOException 
	 */
	
	public String readCustomerMessage() throws IOException {
		return ois.readUTF();
	}
	
	/**
	 * 判断商家是否营业中
	 * @throws IOException 
	 */
	
	public String judgeOperating(String bid) throws IOException {
		
		oos.writeInt(BUSINESS_STATUS);
		oos.flush();
		oos.writeUTF(bid);
		oos.flush();
		
		String status = ois.readUTF();
		
		return status;
	}
}
