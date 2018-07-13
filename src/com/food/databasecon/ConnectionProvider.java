package com.food.databasecon;



import java.sql.Connection;

import java.sql.*;  

public class ConnectionProvider {
	static String DRIVER="com.mysql.jdbc.Driver";  
	static String CONNECTION_URL="jdbc:mysql://localhost:3306/food_tracker?autoReconnect=true&useSSL=false";  
	static String USERNAME="root";  
	static String PASSWORD="root";  

	 
	  
	 
	private static Connection con=null;  
	static{  
	try{  
	Class.forName(DRIVER);  
	con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
	}catch(Exception e){}  
	}  
	  
	public static Connection getCon(){  
	    return con;  
	}  
	    
}
