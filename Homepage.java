package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Homepage {

	public ArrayList<Food> viewAllFood() throws SQLException, ClassNotFoundException {
		 
		ArrayList<Food> foods = new ArrayList<Food>();
		String sql = "select * from food";
		ResultSet rs = DatabaseConnect.getStat().executeQuery(sql);
		
		while(rs.next()) {
			foods.add(new Food(rs.getString(1), rs.getInt(2), rs.getString(3), rs.getInt(5)));
		}
		return foods;
	}
}
