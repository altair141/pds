<%@page import="gestionDatos.TransformarJSon"%>
<%@page import="capaServicio.ServicioProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de reportes</title>
<link rel="stylesheet" type="text/css" href="css/tablas.css" />
<script type="text/javascript" src="js/jquery-ui.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/formulario.js"></script>
<script src="js/gestionDatos.js"></script>
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
						<li><a href="listaHoraMedica.jsp">lista Horas Medicas</a></li>
						<li class="divider"></li>
						<li><a href="listaHoraMedica.jsp">lista Horas Medicas por
								rango</a></li>
						<li><a href="listaHoraMedica.jsp">lista Horas Medicas por
								médico</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">Medicos<span
						class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="listaMedicos.jsp">Lista Medicos</a></li>
						<li><a href="especialidad.jsp">Lista Especialidades</a></li>

					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">Pacientes<span
						class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="ListaClientes.jsp">Lista Pacientes</a></li>


					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">Reserva<span
						class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="ListaSucursales.jsp">Reservar hora control</a></li>
						<li><a href="reservarHoraAps.jsp">Reservar hora APS</a></li>
					</ul></li>
				<li class="dropdown"><a href="#" class="dropdown-toggle"
					data-toggle="dropdown" role="button" aria-expanded="false">Reporte<span
						class="caret"></span></a>
					<ul class="dropdown-menu" role="menu">
						<li><a href="ListaUsuarios.jsp">box utilizados</a></li>
						<li><a href="RegistrarUsuario.jsp">medicos solicitados</a></li>
						<li><a href="EditarUsuario.jsp">Medico más solicitado</a></li>
						<li><a href="EliminarUsuario.jsp">Paciente mas atendido</a></li>
					</ul></li>

			</ul>

		</div>
	</div>
	</nav>

	<a href="GenerarReporte.jsp"><button>Crear reporte</button></a>
	<h1>Reportes</h1>
	<fieldset>
	<%ServicioProxy s=new ServicioProxy(); %>	
		<legend>Lista de Reportes</legend>

		<center>
			<table>
				<thead>
					<tr>
						<th hidden>Id</th>
						<th>Fecha</th>
						<th>Hora</th>
						<th>Tipo de reporte</th>
						<th></th>
					</tr>
				</thead>
				<tbody>
	<% String lista="";
				
				try{
					lista=s.buscarReportes();
					
				}catch(NullPointerException e){
					lista=null;
				}
				if(lista==null){
					
				}else{
					String[][]matriz2=TransformarJSon.datosReporte(lista);					
				for(int i = 0; i < matriz2[0].length; i++){
					
				
				%>
					<tr>
						<td id="id<%=i%>" hidden><%=matriz2[0][i] %></td>
						<td id="fecha<%=i%>"><%=matriz2[1][i] %></td>
						<td id="hora<%=i%>"><%=matriz2[2][i] %></td>
						<td id="tipoReporte<%=i%>"><%=matriz2[3][i] %></td>
						<td><input type="button"
								onclick="reporte(id<%=i%>,fecha<%=i%>,hora<%=i%>,tipoReporte<%=i%>)"
								value="Seleccionar" /></td>
					</tr>
				<%
				}
				}
				%>	
				</tbody>
			</table>
		</center>
	</fieldset>

	<fieldset>
		<legend>Datos reporte</legend>
		
		<p>
			<label>Tipo de reporte:</label> <input type="text" id="tipoReporte"
				disabled />
		</p>
		<p>
			<label> Hora:</label><input type="time" id="hora" disabled />
		</p>
		<p>
			<label>Fecha:</label><input type="date" disabled id="fecha" />
		</p>
		<form action="DetalleReporte" method="post">
		<p>
			<label>Id reporte:</label> <input type="text" id="idReporte" 
				name="idReporte" />
		</p hidden>
			<input hidden id="idReporte" type="text" /> <input type="submit"
				value="Ver detalle">
		</form>

	</fieldset>


</body>
</html>