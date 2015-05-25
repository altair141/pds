<%@page import="gestionDatos.TransformarJSon"%>
<%@page import="capaServicio.ServicioProxy"%>
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
						<li><a href="listaHorasDisponibles.jsp">lista Horas
								Medicas disponibles</a></li>
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
						<li><a href="listaReportes.jsp">Lista Reportes</a></li>
						<li class="divider"></li>
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
	<% 
	ServicioProxy s=new ServicioProxy();
	String listaBox="";
	String id="";
	String nombreBox="";
	String porcentaje="";
	try{
		id=request.getAttribute("idBox").toString();
		}catch(NullPointerException e){
			id=null;
		}
	try{
		nombreBox=request.getAttribute("nombreBox").toString();
		}catch(NullPointerException e){
			nombreBox=null;
		}
	try{
		porcentaje=request.getAttribute("porcentaje").toString();
	}catch(NullPointerException e){
		porcentaje="";
	}
	%>
		<h1>Reporte ocupación box</h1>
		<fieldset>
			<legend>Búsqueda</legend>
			<form action="GenerarReporteBox" method="post">
			<p>
				<label>Box:</label> 
				<select name="busquedaBox"
						id="busMedicoDisponible">
				<option hidden value="0">...</option>
				<%
				
				
					try{
						listaBox=s.obtenerBox();
					}catch(NullPointerException e){
						listaBox=null;
					}
					
				
					String[][] box=TransformarJSon.box(listaBox);
					
					for(int i=0;i<box[0].length;i++){
						
						%>
						<option value="<%=box[0][i]%>"><%=box[1][i] %></option>
						<%
					}
				%>
				</select>
			</p>
			<p>
				<label>Fecha Inicio:</label><input type="date"
					id="fechaInicioDisponible" name="fechaInicioBox">
			</p>
			<p>
				<label>Fecha Termino:</label><input type="date"
					id="fechaTerminoDisponible" name="fechaTerminoBox">
			</p>
			
			<p>
			<input type="reset" value="Limpiar" id="btn_limpiarDisponible" /> <input
				type="submit" id="btn_horaDisponible" value="Buscar" />
		</p>
		</form>
		</fieldset>
		
		<fieldset>
			<legend>Detalle Box</legend>
			<p hidden>
				<label>id:</label><input type="text" id="idBox" name="idBox"
					value="<%if(id==null){}else{ %><%=id%><%} %>" />
			</p>
			<p>
				<label>Nombre:</label><input disabled type="text" id="nombreMedico" value="<%if(nombreBox==null){}else{ %><%=nombreBox%><%} %>"/>
				<label>Porcentaje de ocupacion:</label><input disabled type="text" id="nombreMedico" value="<%if(porcentaje==null){}else{ %><%=porcentaje%><%} %>%"/>
			</p>
			
			
		</fieldset>
		
		
	</div>


</body>
</html>