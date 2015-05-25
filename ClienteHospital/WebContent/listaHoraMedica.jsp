<%@page import="capaServicio.ServicioProxy"%>
<%@page import="gestionDatos.TransformarJSon"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista Hora Medica</title>
<link rel="stylesheet" type="text/css" href="css/tablas.css" />
<script type="text/javascript" src="js/jquery-ui.min.js"></script>

<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="js/jquery-1.11.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
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

	<div>
		<h1>Horas Médicas </h1>
		<div class="busqueda">


			<fieldset>

				<legend> Búsqueda </legend>

				<form action="BuscarHoraMedica" method="post">
					<p>
						<label>Medico:</label> <select name="busquedaMedico"
							id="busMedico"><option hidden value="0">...</option>
							<%
								ServicioProxy list = new ServicioProxy();									
								String lista = list.obtenerMedicos();
								String[][] matriz = TransformarJSon.datosMedico(lista);
								for (int i = 0; i < matriz[0].length; i++) {
							%>
							<option value="<%=matriz[0][i]%>"><%=matriz[1][i]%>
								<%=matriz[2][i]%></option>
							<%
								}
							%>

						</select>
					</p>
					<p>
						<label>Fecha Inicio:</label><input type="date" name="fechaIni"
							id="busFeIn" />
					</p>
					<p>
						<label>Fecha Fin:</label><input type="date" name="fechaFin"
							id="busFeTer" />
					</p>
					<p>
					
						<input type="reset" value="Limpiar" id="btn_limpiar"> <input
							type="submit" value="Buscar" id="btn_busqueda">
					</p>

				</form>
				<a href="listaHoraMedica.jsp"><button>Recargar</button></a>
			</fieldset>

		</div>

		<div id="contenedorTabla">
			<br>
			<fieldset>
				<legend>
					<h1>Lista Horas Médicas </h1>
				</legend>
				<center>
					<table>
						<thead>
							<tr>
								<th>Id</th>
								<th>Medico</th>
								<th>Fecha</th>
								<th>Hora</th>

								<th></th>
							</tr>
						</thead>
						<tbody>
							<%
								String lista2 = list.obtenerHorasMedicas();
								
							
								try {
									lista2 = request.getAttribute("rango").toString();
									

								} catch (NullPointerException e) {
									lista2 = list.obtenerHorasMedicas();
									
								}
								if (lista2.equals("no encontrado")) {
									%>
									<h1><%=lista2 %></h1>
									<%
								} else {

									if (lista2 != null || !lista2.isEmpty()) {

										String[][] matriz2 = TransformarJSon.horasMedicas(lista2);
										for (int i = 0; i < matriz2[0].length; i++) {
							%>
							<tr>
								<td id="<%=i%>"><%=matriz2[0][i]%></td>
								<td id="medico<%=i%>"><%=matriz2[3][i]%> <%=matriz2[4][i]%></td>
								<td id="fecha<%=i%>"><%=matriz2[1][i]%></td>
								<td id="hora<%=i%>"><%=matriz2[2][i]%></td>
								<td><input type="button"
									onclick="horaMedica(<%=i%>,fecha<%=i%>,hora<%=i%>,medico<%=i%>)"
									value="Seleccionar" /></td>
							</tr>
							<%
								}
									}
								}
							%>
						</tbody>
					</table>
				</center>
			</fieldset>
			<fieldset>
				<legend>
					<h1>Detalle Hora Médica</h1>
				</legend>
			</fieldset>

			<p>
				<label>Fecha:</label> <input type="text" disabled
					id="fechaHoraMedica" />
			</p>
			<p>
				<label>Hora:</label> <input type="text" disabled id="horaHoraMedica" />
			</p>
			<p>
				<label>Médico:</label> <input type="text" disabled
					id="medicoHoraMedica" />
			</p>
			<p>
			<form>
				<input hidden id="idHoraMedicaOc" /> <input type="submit"
					value="Ver detalle" disabled />
			</form>
			
		</div>
	</div>
</body>
</html>
