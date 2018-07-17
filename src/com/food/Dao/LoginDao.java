package com.food.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.food.beans.LoginUser;


public class LoginDao {
	public static boolean login(LoginUser u){  
		boolean status=false;
		 
		try{  
			  Class.forName("com.mysql.jdbc.Driver"); 
			  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_tracker",
			            "root", "root");
			  Statement st = con.createStatement();
			 
			   ResultSet rs = st.executeQuery("select * from USER_TBL where email='" + u.getEmail() + "' and password='" + u.getPsw() + "'");
			    status=rs.next();
		}catch(Exception e){}  
		      
		return status;  
		}  


}
