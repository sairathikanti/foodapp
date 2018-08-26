package com.food.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.Statement;

import com.food.beans.FoodPostBean;



public class FoodPostDao {
	public static int post(FoodPostBean f){  
		int status = 0;
	//	String query="select * from FOOD_POSTING";
		try{  
			  Class.forName("com.mysql.jdbc.Driver"); 
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_post",
			            "root", "root");
			  Statement st = con.createStatement();
			 
			  //status = st.executeUpdate("insert into FOOD_POSTING(name, email, mobileno, address) values ('" + f.getName() + "','" + f.getEmail() + "','" + f.getMobileno() + "','" + f.getAddress() + "')", Statement.RETURN_GENERATED_KEYS);
			
			  status = st.executeUpdate("insert into FOOD_POSTING(name, email, mobileno, address) values ('" + f.getName() + "','" + f.getEmail() + "','" + f.getMobileno() + "','" + f.getAddress() + "')");
				
			  
			  //	status=ps.executeUpdate();   status=rs.next();
			  System.out.print(status);
			  
			  
		//	  ResultSet rs = st.executeQuery(query)
			
			  
		}catch(Exception e){}  
		      
		 return status;
		}  

}
