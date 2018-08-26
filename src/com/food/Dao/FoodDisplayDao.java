package com.food.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.food.beans.FoodDisplayBean;


public class FoodDisplayDao {

	
	 public  List<FoodDisplayBean> display() throws SQLException {
		List<FoodDisplayBean> data = new ArrayList<>();
		ResultSet rs = null;
		String query="select * from FOOD_POSTING";
		try{  
			  Class.forName("com.mysql.jdbc.Driver"); 
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_post",
			            "root", "root");
			  Statement st = con.createStatement();
			 
		//	int  status = st.executeUpdate("insert into FOOD_POSTING(name, email, mobileno, address) values ('" + f.getName() + "','" + f.getEmail() + "','" + f.getMobileno() + "','" + f.getAddress() + "')", Statement.RETURN_GENERATED_KEYS);
				//	status=ps.executeUpdate();   status=rs.next();
		//	  System.out.print(status);
			  
			  
		   rs = st.executeQuery(query);
		   System.out.println("result set"+rs);
			  while (rs.next()) {
		            String name = rs.getString("name");
		            String email = rs.getString("email");
		            String mobileno = rs.getString("mobileno");
		            String address = rs.getString("address");
		            FoodDisplayBean f = new FoodDisplayBean(name,email,mobileno,address);
		            data.add(f);
		            
		            System.out.println("data..."+data);
		        }
			  
		}catch(Exception e){}  
		      
		 return data;
		}  

}
