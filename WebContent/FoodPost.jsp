

 <%@page import="com.food.Dao.FoodPostDao"%>  
<jsp:useBean id="obj" class="com.food.beans.FoodPostBean"/>  
  
<jsp:setProperty property="*" name="obj"/> 

<!-- food posting -->  
  <% 
  int j=FoodPostDao.post(obj); 
    if (j > 0) {
    	
        //session.setAttribute("userid", user);
      //  response.sendRedirect("welcome.jsp");
        out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
    
    
    
    
%>