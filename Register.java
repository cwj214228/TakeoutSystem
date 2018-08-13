package model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Register {

	/**ÓÃ»§×¢²á**/
	
	public Customer customerRegister(String cid, String cname, String password,
			String sex, String phone, String address) throws SQLException, ClassNotFoundException {
		
		Customer customer = null;
		String sql = "insert into customer (cid,cname,password,sex,phone,address) values('"+cid+"','"+cname+"','"+password+"','"+sex+"','"
					+phone+"','"+address+"')";
		
		DatabaseConnect.getStat().executeUpdate(sql);
		
		ResultSet rs = DatabaseConnect.getStat().executeQuery("select * from business");
		
		if(rs.next()) {
			customer = new Customer(rs.getString(1), rs.getString(2), rs.getString(3),
						rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
			
		}
		
		return customer;
		
	}
}
