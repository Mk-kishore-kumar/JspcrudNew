<%@page import="com.dao.Userdao"%>
<jsp:useBean id="u" class="com.user.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>
<%
int i=Userdao.save(u);
if(i>0){
	response.sendRedirect("adduser-success.jsp");
}else{
	response.sendRedirect("adduser-error.jsp");
}
%>
