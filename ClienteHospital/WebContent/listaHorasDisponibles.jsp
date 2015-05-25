<%@page import="gestionDatos.TransformarJSon"%>
<%@page import="capaServicio.ServicioProxy"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Horas Médicas disponibles</title>
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
						<li><a href="listaHoraMedicaControl.jsp">lista Horas
								Medicas de control</a></li>
						<li><a href="listaHoraMedicaAps.jsp">lista Horas Medicas
								APS</a></li>
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

	<div class="contenedorGeneral">

		<h1>Horas disponibles del médico</h1>
		<%
			ServicioProxy s=new ServicioProxy();
			String lista2;
			String id="";
			String nombreMedico="";
			String apellidoMedico="";
			String especialidad="";
			try{
			id=request.getAttribute("idMedico").toString();
			}catch(NullPointerException e){
				id=null;
			}
			try{
				 apellidoMedico=request.getAttribute("apellidoMedico").toString();
				}catch(NullPointerException e){
					apellidoMedico=null;
				}
			try{
				nombreMedico=request.getAttribute("nombreMedico").toString();
				}catch(NullPointerException e){
					nombreMedico=null;
				}
			try{
				especialidad=request.getAttribute("especialidadMedico").toString();
				}catch(NullPointerException e){
					especialidad=null;
				}
			
		%>
		<fieldset>
			<legend>Búsqueda</legend>
			<form action="BuscarHoraDisponibleMedico" method="post">

				<p>
					<label>Medico:</label> <select name="busquedaMedico"
						id="busMedicoDisponible"><option hidden value="0">...</option>
						<%
							ServicioProxy list = new ServicioProxy();							
												lista2 = list.obtenerMedicos();
												String[][] matriz = TransformarJSon.datosMedico(lista2);
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
					<label>Fecha Inicio:</label><input type="date"
						id="fechaInicioDisponible" name="fechaInicioDisponible">
				</p>
				<p>
					<label>Fecha Termino:</label><input type="date"
						id="fechaTerminoDisponible" name="fechaTerminoDisponible">
				</p>
		</fieldset>
		<p>
			<input type="reset" value="Limpiar" id="btn_limpiarDisponible" /> <input
				type="submit" id="btn_horaDisponible" value="Buscar" />
		</p>
		</form>

		<fieldset>
			<legend>Médico</legend>
			<p hidden>
				<label>id:</label><input type="text" id="idMedico" name="idMedico"
					value="<%if(id==null){}else{ %><%=id%><%} %>" />
			</p>
			<p>
				<label>Nombre:</label><input disabled type="text" id="nombreMedico" value="<%if(nombreMedico==null){}else{ %><%=nombreMedico%><%} %>"/>
			</p>
			<p>
				<label>Apellido:</label><input disabled type="text"
					id="apellidoMedico" value="<%if(apellidoMedico==null){}else{ %><%=apellidoMedico%><%} %>"/>
			</p>
			<p>
				<label>Especialidad:</label><input disabled type="text"
					id="especialidadMedico" value="<%if(especialidad==null){}else{ %><%=especialidad%><%} %>"/>
			</p>
		</fieldset>
		<fieldset>
			<legend>Lista Horas Disponibles</legend>
			<center>
				<table>
					<thead>
						<tr>
							<th>Id</th>
							<th>Fecha</th>
							<th>Hora</th>
							<th>Nombre Médico</th>
							<th>Apellido Médico</th>
							<th>Tipo De Hora</th>
							<th></th>
						</tr>
					</thead>
					<tbody>
					
							<%
							
								String lista="";							
												try{
													lista=request.getAttribute("lista").toString();
													
												}catch(NullPointerException e){
													lista=null;
													lista=s.buscarDisponbilidadHoraMedica();
													
												}
												
													 
												 if(lista==null){
													 
												}else{
												
													if(lista.equals("no encontrado")){
														
													}else{
													String[][] matriz2=TransformarJSon.horasMedicasDisponible(lista);
													for(int i = 0; i < matriz2[0].length; i++){
														
							%>
								<tr>
							<td id="id<%=i%>"><%=matriz2[0][i]%></td>
							<td id="fecha<%=i%>"><%=matriz2[1][i]%></td>
							<td id="hora<%=i%>"><%=matriz2[2][i]%></td>
							<td id="nombre<%=i%>"><%=matriz2[3][i]%></td>
							<td id="apellido<%=i%>"><%=matriz2[4][i]%></td>
							<td id="tipo<%=i%>">
								<%
									String tipo=""; if(matriz2[5][i].equalsIgnoreCase("true")){
														tipo="APS";
								%> <%=tipo%> <%
 	}else{
 						tipo="Control";
 %> <%=tipo%> <%
 	}
 %>
							</td>
							<td><input type="button"
								onclick="disponible(id<%=i%>,nombre<%=i%>,apellido<%=i%>,especialidad<%=i%>)"
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
</body>
</html>