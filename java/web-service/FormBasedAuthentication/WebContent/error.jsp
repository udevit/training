<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>P�gina de error</title>
	</head>
	<body>
		<h2>Usuario o password err�neos.</h2>

	    <p>Por favor ingrese el usuario y contrase�a que est� autorizado para acceder
	    	a esta aplicaci�n. Para esta aplicaci�n, esto significa que el usuario ha sido
	        creado en el <code>archivo</code> <b>tomcat-users.xml</b> y ha sido asignado al
	        <em>grupo</em> de <code>Admin</code>.</p>
	   		<a href="<%=request.getContextPath() %>/login.jsp">Regresar a la p�gina de incio de sesi�n</a>
	</body>
</html>