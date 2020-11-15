<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
ResultSet resultset = 
statement.executeQuery("select * from clients "); 

%>

<TABLE BORDER="1">

            <TR>
               <TH>CodeCli</TH>
               <th>Societe</th>
               <TH>Contact</TH>
               <TH>Fonction</TH>
 
           </TR>
           <TR>
           <% do{ %>
               <TD> <%= resultset.getString(1) %> </TD>
               <TD> <%= resultset.getString(2) %> </TD>
               <TD> <%= resultset.getString(3) %> </TD>
               <TD> <%=  resultset.getString(4) %> </TD>
 
           </TR>
          		 <% } while(resultset.next()); %>
       </TABLE>
       <BR>
      

</body>
</html>