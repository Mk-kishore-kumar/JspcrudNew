<%@page import="com.dao.Userdao"%>
<jsp:useBean id="u" class="com.user.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
int i=Userdao.update(u);
response.sendRedirect("viewusers.jsp");
%>