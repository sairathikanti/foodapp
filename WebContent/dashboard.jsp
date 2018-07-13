
<%@ page import ="java.sql.*" %>
<%
    String email = request.getParameter("email");    
    String psw = request.getParameter("psw");
    String mobileno = request.getParameter("mobileno");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_tracker",
            "root", "root");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into USER_TBL(email, password, mobileno) values ('" + email + "','" + psw + "','" + mobileno + "')");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("welcome.jsp");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("index.jsp");
    }
%>

