<%-- 
    Document   : success
    Created on : Jun 23, 2012, 12:11:25 PM
    Author     : TATARAO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title><bean:message key="welcome.title"/></title>
    </head>
    <body>
        <bean:message key="lab.name" /> : <bean:write name="RegisterForm" property="name" />
        <br>
        <bean:message key="lab.pass" /> :<bean:write name="RegisterForm" property="password" />
    </body>
</html>
