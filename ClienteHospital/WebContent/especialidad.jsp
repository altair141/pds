

<%@page import="capaServicio.ServicioProxy"%>
<%@page import="gestionDatos.TransformarJSon"%>
<%@page import="java.text.ParseException"%>
<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.parser.JSONParser"%>
<%@page import="com.sun.org.apache.xalan.internal.xsltc.compiler.Parser"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
						<li><a href="listaHoraMedica.jsp">lista Horas Medicas por rango</a></li>
						<li><a href="listaHoraMedica.jsp">lista Horas Medicas por médico</a></li>
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
	<div class="contenedorGeneral">
		<div class="busqueda">
			
			<fieldset>
				<legend>Buscar por especialidad</legend>
				<p class="contenedorBusqueda">
				<form action="MedicosPorEspecialidad" method="post" id="formMedicoEspecialidad">
					<select name="especialidad">
						<option hidden value="0">...</option>
						<%
						
						    ServicioProxy list2=new ServicioProxy();
							String lista2 = list2.obtenerEspecilidades();
							String[][] matriz2 = TransformarJSon.datosEspecialidad(lista2);
							for (int i = 0; i < matriz2[0].length; i++) {
						%>
						<option value="<%=matriz2[0][i]%>"><%=matriz2[1][i]%></option>
						<%
							}
						%>

					</select> <input class="btn_busqueda" id="especialidadBusqueda"
						type="submit" value="Buscar"> <input class="btn_busqueda"
						id="especialidadLimpiar" type="reset" value="Limpiar">
						</form>
				</p>
			</fieldset>
		</div>

	<div id="contenedorTabla">
			<br>
			<fieldset>

				<legend>
					<h1>Lista de Médicos</h1>
				</legend>
				<center>
					<table>
						<thead>
							<tr>
								<th>id</th>
								<th>nombre</th>
								<th>
								<th>
							</tr>
						</thead>
						<tbody>
							<%
								ServicioProxy s = new ServicioProxy();
								String lista = s.obtenerMedicos();
								String[][] matriz = TransformarJSon.datosEspecialidad(lista);
								for (int i = 0; i < matriz[0].length; i++) {
							%>
							<tr>
								<td id="<%=i%>"><%=matriz[0][i]%></td>
								<td id="nombre<%=i%>"><%=matriz[1][i]%></td>
								<td><input type="button"
									onclick="muestra(<%=i%>,nombre<%=i%>)" value="Seleccionar" /></td>
							</tr>
							<%
								}
							%>
						</tbody>
					</table>
				</center>
			</fieldset>
		</div>
		<br>
		<fieldset>
			<legend>Detalle Medico</legend>

			<p>
				<label>Médico:</label> <input type="text" disabled id="nombreMedico" />
			</p>
			<p>
			<form action="reservarHoraAps" method="post" id="formReservarHoraAps">
				<input hidden type="text" value="" id="idMedicoSeleccionado">
				<input type="submit" value="Reservar Hora APS"
					class="buttonReservar">
			</form>

			</p>
		</fieldset>



	</div>
	

	</div>
</body>
</html>