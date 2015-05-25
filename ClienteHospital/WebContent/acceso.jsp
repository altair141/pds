<%@page import="capaServicio.ServicioProxy"%>
<%@page import="gestionDatos.TransformarJSon"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

String user = request.getParameter("user");
String pwd = request.getParameter("password");

ServicioProxy login=new ServicioProxy();
String logeo = login.login(user, pwd);

	if (logeo != null || !logeo.isEmpty()) {
		TransformarJSon datoslogeo=new TransformarJSon();
		String[][] matriz=datoslogeo.datosLogin(logeo);
		for(int i=0;i<matriz[0].length;i++){
			session.setAttribute("id", matriz[0][i]);
			session.setAttribute("nombre", matriz[1][i]);
			session.setAttribute("nombreUsuario", matriz[2][i]);
			session.setAttribute("tipoUsuario", matriz[3][i]);
			response.sendRedirect("index.jsp");
	}
	}else if(logeo==null){
		
		response.sendRedirect("login.jsp");
	}
		

	%>
</body>
</html>