<%@page import="com.food.Dao.FoodPostDao"%>  
<%@page import="com.food.Dao.FoodDisplayDao"%> 
<%@page import="com.food.beans.EmailSending"%> 
<jsp:useBean id="obj" class="com.food.beans.FoodPostBean"/>  
  
<jsp:setProperty property="*" name="obj"/> 
   
   
   
  <% 
  int i=FoodPostDao.post(obj); 
    if (i > 0) {
    	
        //session.setAttribute("userid", user);
        response.sendRedirect("success.jsp");
        
        
       // EmailSending email = new EmailSending();
            EmailSending.sendEmail();
     
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>

