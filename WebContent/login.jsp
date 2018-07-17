<%@page import="com.food.Dao.LoginDao"%> 
<%@ page import="java.sql.ResultSet" %> 

<%@ page import="com.food.beans.LoginUser" %> 
<jsp:useBean id="obj" class="com.food.beans.LoginUser"/>  
  
<jsp:setProperty property="*" name="obj"/> 
    
 <%  
boolean status=LoginDao.login(obj);  
if(status){  
	LoginUser u = new LoginUser();
out.print(status);
session.setAttribute("userid","true"); 
response.sendRedirect("success.jsp");
} else {
    out.println("Invalid details <a href='index.html'>try again</a>");
} 
%> 
