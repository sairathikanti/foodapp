package com.food.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.food.beans.User;
import com.food.databasecon.ConnectionProvider;

public class RegisterDao {

	public static int register(User u){  
		int status=0;  
		try{  
		Connection con=ConnectionProvider.getCon();  
		PreparedStatement ps=con.prepareStatement("insert into USER_TBL values(?,?,?)");  
		ps.setString(1,u.getEmail());  
		ps.setString(2,u.getPsw());  
		ps.setString(3,u.getMobileno());  
		              
		status=ps.executeUpdate();  
		}catch(Exception e){}  
		      
		return status;  
		}  
}
