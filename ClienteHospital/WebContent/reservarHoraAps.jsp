<%@page import="capaServicio.ServicioProxy"%>
<%@page import="gestionDatos.TransformarJSon"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reservar hora APS</title>
<link rel="stylesheet" type="text/css" href="css/tablas.css" />
<script type="text/javascript" src="js/jquery-ui.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/formulario.js"></script>
</head>
<body>
	<div class="container" id="header">
		<p id="userWelcomeText" style="text-align: right">Bienvenido</p>
	</div>
		<nav class="navbar navbar-default" role="navigation">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="index.jsp">Inicio</a>
		</div>
		<div class="collapse navbar-collapse"
			id="bs-example-navbar-collapse-1">
			<ul class="nav navbar-nav">
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">Hora
						Medica<span class="caret"></span>
				</a>
					<ul class="dropdown-menu" role="menu">
					<li><a href="listaHorasDisponibles.jsp">lista Horas Medicas disponibles</a></li>
						<li><a href="listaHoraMedica.jsp">lista Horas Medicas</a></li>
						<li><a href="listaHoraMedicaControl.jsp">lista Horas Medicas de control</a></li>
						<li><a href="listaHoraMedicaAps.jsp">lista Horas Medicas APS</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">Medicos<span
						class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="listaMedicos.jsp">Lista Medicos</a></li>
						

					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">Pacientes<span
						class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="">Lista Pacientes</a></li>


					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">Reserva<span
						class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="">Reservar hora control</a></li>
						<li><a href="reservarHoraAps.jsp">Reservar hora APS</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">Reporte<span
						class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="listaReportes.jsp">Lista Reportes</a></li>
						<li class="divider"></li>
						<li><a href="generarReporteBox.jsp">box utilizados</a></li>
						<li><a href="RegistrarUsuario.jsp">medicos solicitados</a></li>
						<li><a href="medicoMasSolicitado.jsp">Medico m�s solicitado</a></li>
						<li><a href="pacienteMasAtendido.jsp">Paciente m�s atendido</a></li>
					</ul></li>
				
			</ul>
			
		</div>
	</div>
	</nav>
	<div id="reservarHoraAps">
		<form id="formReservaAps" action="ReservarHoraAps" method="post">
			<h1>Reservar Hora APS</h1>

			<fieldset>
				<legend>Detalle Hora Medica</legend>
					
				<p>
				<label>Hora Medica:</label>
				<select name="horaMedica">

						<option hidden value="0">...</option>
						<%
							
						ServicioProxy list2= new ServicioProxy();
							String lista2 = list2.buscarHoraAPS();
							String[][] matriz2 = TransformarJSon.horasMedicas(lista2);
							for (int i = 0; i < matriz2[0].length; i++) {
						%>
						<option value="<%=matriz2[0][i]%>"><%=matriz2[1][i]%>-<%=matriz2[2][i]%> </option>
						<%
							}
						%>

					</select>
				</p>

			</fieldset>
			<fieldset>
				<legend>Datos Paciente</legend>

				<p>
					<label>nombre:</label> 
					<select name="paciente">

						<option hidden value="0">...</option>
						<%
							ServicioProxy list=new ServicioProxy();												
							String lista = list.obtenerPaciente();
							String[][] matriz = TransformarJSon.pacientes(lista);
							for (int i = 0; i < matriz[0].length; i++) {
						%>
						<option value="<%=matriz[0][i]%>"><%=matriz[1][i]%></option>
						<%
							}
						%>

					</select>
				</p>


			</fieldset>
			
		

			<br> <br> <br> <p><input type="reset" value="Limpiar" /> <input type="submit" value="Siguiente" /></p>
			<br> <br> <br>
		</form>
		
		<%
		String resultado="";
		String mensaje="";
		try{
			resultado=request.getAttribute("reserva").toString();
			
		}catch(NullPointerException e){
			resultado=null;
			mensaje="error";
		}
		%>
		<fieldset><p><label>Resultado:</label><input disabled value="<% if(resultado==null){}else{%><%=resultado%><%}%>"></p></fieldset>
		
		
		
	</div>
</body>
</html>