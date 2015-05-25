<%@page import="capaServicio.ServicioProxy"%>
<%@page import="gestionDatos.TransformarJSon"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de médicos</title>
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
		<div class="busqueda">
			<h1>Lista de Médicos</h1>
			<fieldset>
				<legend>Buscar por especialidad</legend>
				<p class="contenedorBusqueda">
				<form action="BuscarMedico" method="post"
					id="formMedicoEspecialidad">
					<select name="especialidad" id="buscarEspecialidad">
						<option hidden value="0">...</option>
						<%
							ServicioProxy list = new ServicioProxy();							
							String lista = list.obtenerEspecilidades();
							String[][] matriz = TransformarJSon.especialidad(lista);
							for (int i = 0; i < matriz[0].length; i++) {
						%>
						<option value="<%=matriz[0][i]%>"><%=matriz[1][i]%></option>
						<%
							}
						%>

					</select> <input class="btn_busqueda" id="btn_especialidadBusqueda"
						type="submit" value="Buscar"> <input class="btn_busqueda"
						id="btn_especialidadLimpiar" type="reset" value="Limpiar">
				</form>
				</p>
			</fieldset>
			
			<fieldset>
				<legend>Búscar por Médico</legend>
				<form action="BuscarMedico" method="post">
					<p class="contenedorBusqueda">
						<input type="search" name="busqueda" id="textoBusquedaMedico"
							class="input_busqueda" placeholder="buscar por medico..."
							required /> <input type="submit" class="btn_busqueda"
							id="btn_medicoBusqueda" value="Buscar"> <input
							class="btn_busqueda" id="btn_medicoLimpiar" type="reset"
							value="Limpiar">

					</p>
				</form>
			</fieldset>

		</div>
		<a href="listaMedicos.jsp"><input hidden type="text"  /> <input
					type="submit" value="Recargar"></a>

		<div id="contenedorTabla">
			<br>
			<fieldset>

				<legend>
					<h2>Lista de Médicos</h2>
				</legend>
				<center>
					<table>
						<thead>
							<tr>
								<th>Id</th>
								<th>Nombre</th>
								<th>Apellido</th>
								<th>Especialidad</th>

								<th></th>
							</tr>
						</thead>
						<tbody>
							<%
								String lista2 = "";
						
								try {
									lista2 = request.getAttribute("listaMedicos").toString();
									
								} catch (NullPointerException e) {
									lista2 = list.obtenerMedicos();
								}
								if (lista2.equals("no encontrado")) {
						
									
								} else {
									
									
									if (lista2 != null || !lista2.isEmpty()) {

										String[][] matriz2 = TransformarJSon.datosMedico(lista2);
										for (int i = 0; i < matriz2[0].length; i++) {
							%>
							<tr>
								<td id="id<%=i%>"><%=matriz2[0][i]%></td>
								<td id="nombre<%=i%>"><%=matriz2[1][i]%></td>
								<td id="apellido<%=i%>"><%=matriz2[2][i]%></td>
								<td id="especialidad<%=i%>"><%=matriz2[4][i]%></td>
								<td><input type="button"
									onclick="muestra(id<%=i%>,nombre<%=i%>,apellido<%=i%>,especialidad<%=i%>)"
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
		</div>
		<br>
		<fieldset>
			<legend>Detalle Medico</legend>

			<p>
				<label>Nombre:</label> <input type="text" disabled id="nombreMedico" />
			</p>
			<p>
				<label>Apellido:</label><input type="text" disabled
					id="apellidoMedico" />
			</p>
			<p>
				<label>Especialidad:</label><input type="text" disabled
					id="especialidadMedico" />
			</p>
			<p>
			<form action="reservarHoraAps.jsp" method="post"
				id="formReservarHoraAps">
				<input hidden type="text" value="" class="idMedicoSeleccionado"
					id="idMedicoSeleccionado"> <input type="submit"
					value="Reservar Hora APS" class="buttonReservar">
			</form>
			<form action="" method="post">
				<input hidden type="text" class="idMedicoSeleccionado" /> <input
					type="submit" value="Ver horas reservadas" class="buttonReservar">
			</form>
			<form action="BuscarHoraDisponibleMedico" method="post">
			<input hidden type="date"id="fechaInicioDisponible" name="fechaInicioDisponible">
			<input hidden type="date"id="fechaTerminoDisponible" name="fechaTerminoDisponible">
				<input hidden type="text" class="idMedicoSeleccionado" id="idMedicoBuscarDisponible" name="busquedaMedico"/> <input
					type="submit" value="Ver horas disponibles" class="buttonReservar">
			</form>
			<form action="BuscarHoraControlPorMedico" method="post">
				<input hidden type="text" id="idMedicoBuscarControl" class="idMedicoSeleccionado" name="idMedico" /> <input
					type="submit" value="Buscar horas control" class="buttonReservar">
			</form>
			<form action="BuscarHoraApsPorMedico" method="post">
				<input hidden type="text" id="idMedicoBuscar" class="idMedicoSeleccionado" name="idMedico" /> <input
					type="submit" value="Buscar horas APS" class="buttonReservar">
			</form>			
			</p>
		</fieldset>



	</div>
</body>
</html>
