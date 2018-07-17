package com.food.Dao;

import java.sql.*;

import com.food.beans.User;





public class RegisterDao {

	public static int register(User u){  
		
			int status=0;  
			try{  
				  Class.forName("com.mysql.jdbc.Driver"); 
				  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_tracker",
				            "root", "root");
				  Statement st = con.createStatement();
				    //ResultSet rs;
				     status = st.executeUpdate("insert into USER_TBL(email, password, mobileno) values ('" + u.getEmail() + "','" + u.getPsw() + "','" + u.getMobileno() + "')");
		//	status=ps.executeUpdate();  
			System.out.println(status);
			}catch(Exception e){}  
			      
			return status;  
			}  
	
	

	
}
