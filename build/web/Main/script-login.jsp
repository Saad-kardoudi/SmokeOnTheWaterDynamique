<%-- 
    Document   : script-login
    Created on : 22 avr. 2020, 22:51:08
    Author     : Ilyas
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="com.smokeonthewater.DCM"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
            String log_in =request.getParameter("username");
            String password =request.getParameter("password");
            
            ResultSet rs = DCM.Select_request("SELECT RANK from JARDINIER WHERE LOGIN='"+log_in+"' AND PASSWORD='"+password+"'");
            if(rs.next()){
                session.setAttribute("login", log_in);
                session.setAttribute("rank", rs.getString(1));
                response.sendRedirect("");
            }else{
               RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp?error=1");
               dispatcher.include(request, response); 
            }
%>
