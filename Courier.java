package model;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 
 * @author Administrator
 * Courier: coname, id password, phone, information
 * 			Courier, register
 */
public class Courier implements Serializable {
	
	protected String coname;
	protected String id;
	protected String password;
	protected String phone;
	protected String information;
	
	public String getConame() {
		return coname;
	}
	public void setConame(String coname) {
		this.coname = coname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	
	public Courier() {
		
	}
	
	public Courier(String id, String password) {
		super();
		this.id = id;
		this.password = password;
		
	}
	
	public Courier(String id, String coname, String password, String phone,
			String information) {
		super();
		this.coname = coname;
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.information = information;
	}
	
	/*外卖员登陆*/
	public static Courier coLogin(String coid, String password) throws SQLException, ClassNotFoundException {
		
		Courier courier = null;
		String sql = "select * from courier where coid='"+coid+"' and password='"+password+"'";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		if(rs.next()) {
			courier = new Courier(rs.getString(1), rs.getString(2), rs.getString(3), 
						rs.getString(4), rs.getString(5));
		}
		
		return courier;
	}
	
	/*外卖员注册*/
	
	public static void register(String coid, String coname, String password,
			String phone, String information) throws SQLException, ClassNotFoundException {
	
		String sql = "insert into courier (coid,coname,password,phone,information) values('"+coid+"','"+coname+"','"+password+"','"
			+phone+"','"+information+"')";
		DatabaseConnect.getStat().executeUpdate(sql);
	
	
	}
}
