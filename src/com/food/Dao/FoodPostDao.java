package com.food.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.food.beans.FoodPostBean;



public class FoodPostDao {
	public static ResultSet post(FoodPostBean f){  
		ResultSet resultset = null;
		String query="select * from FOOD_POSTING";
		try{  
			  Class.forName("com.mysql.jdbc.Driver"); 
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_post",
			            "root", "root");
			  Statement st = con.createStatement();
			 
			 int status = st.executeUpdate("insert into FOOD_POSTING(name, email, mobileno, address) values ('" + f.getName() + "','" + f.getEmail() + "','" + f.getMobileno() + "','" + f.getAddress() + "')", Statement.RETURN_GENERATED_KEYS);
				//	status=ps.executeUpdate();   status=rs.next();
			  
			  
			  
			  
			  //searching last record id
			  ResultSet rs = st.getGeneratedKeys();
			  int generatedKey = 0;
			  
			  if (rs.next()) {
			      generatedKey = rs.getInt(1);
			  }
			   
			  System.out.println("Inserted record's ID: " + generatedKey);
			 
			  Statement statement = con.createStatement() ;
	       resultset = 
	                statement.executeQuery("select * from FOOD_POSTING where id = generatedKey") ; 
			  System.out.println("dao result"+resultset);
			 
			  
			 
			  
		}catch(Exception e){}  
		      
		 return resultset;
		}  

}
