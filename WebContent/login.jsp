<%@ page import ="java.sql.*" %>
<%
    String email = request.getParameter("email");    
    String psw = request.getParameter("psw");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/food_tracker",
            "root", "root");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from members where email='" + email + "' and password='" + psw + "'");
    if (rs.next()) {
        session.setAttribute("userid",email);
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("success.jsp");
    } else {
        out.println("Invalid password <a href='index.jsp'>try again</a>");
    }
%>