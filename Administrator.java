package model;

/**
 * 
 * @author Administrator
 * Administrator: aname, id, password, phone
 * 				  Administrator, register
 */

public class Administrator {

	protected String aname;
	protected String id;
	protected String password;
	protected String phone;
	
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
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
	
	public Administrator(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	
	}
	
	public Administrator(String aname, String id, String password, String phone) {
		super();
		this.aname = aname;
		this.id = id;
		this.password = password;
		this.phone = phone;
	}
	
	public void register(Administrator admin) {
		
		
	}
	
}
