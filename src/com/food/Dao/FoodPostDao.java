package com.food.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

import com.food.beans.FoodPostBean;



public class FoodPostDao {
	public static int post(FoodPostBean f){  
		int status = 0;
	try {
			  Class.forName("com.mysql.jdbc.Driver"); 
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_app",
			            "root", "root");
			  Statement st = con.createStatement();
			 
			  //status = st.executeUpdate("insert into FOOD_POSTING(name, email, mobileno, address) values ('" + f.getName() + "','" + f.getEmail() + "','" + f.getMobileno() + "','" + f.getAddress() + "')", Statement.RETURN_GENERATED_KEYS);
			
			  status = st.executeUpdate("insert into food_posting(name, email, mobileno, address, quantity) values ('" + f.getName() + "','" + f.getEmail() + "','" + f.getMobileno() + "','" + f.getAddress() + "," + f.getQuantity() + "')");
				
			  
			  //	status=ps.executeUpdate();   status=rs.next();
			  System.out.print(status);
			  
			  
		//	  ResultSet rs = st.executeQuery(query)
			
			  
		}catch(Exception e){}  
		      
		 return status;
		}  

}
