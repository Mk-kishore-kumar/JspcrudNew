<%@page import="com.dao.Userdao"%>
<jsp:useBean id="u" class="com.user.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
Userdao.delete(u);
response.sendRedirect("viewusers.jsp");
%>