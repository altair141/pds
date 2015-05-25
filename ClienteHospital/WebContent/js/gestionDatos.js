/**
 * 
 */
$(document).ready(function() {
	$("#btn_especialidadBusqueda").attr("disabled", true);
	$(".buttonReservar").attr("disabled", true);
	$("#btn_busqueda").attr("disabled", true);
	$("#btn_medicoBusqueda").attr("disabled", true);
	$("#btn_horaDisponible").attr("disabled", true);

});

$(function() {

	$("#busMedico").change(function() {
		if ($("#busMedico").val().trim() === "") {
			$("#btn_busqueda").attr("disabled", true);
			$("#textoBusquedaMedico").attr("disabled", false);
			$("#busFeIn").attr("disabled", false);
			$("#busFeTer").attr("disabled", false);
		} else {
			$("#btn_busqueda").attr("disabled", false);
			$("#textoBusquedaMedico").attr("disabled", true);
			$("#busFeIn").attr("disabled", true);
			$("#busFeTer").attr("disabled", true);
		}
	})

	$("#btn_limpiar").click(function() {
		$("#btn_busqueda").attr("disabled", true);
		$("#textoBusquedaMedico").attr("disabled", false);
		$("#busFeIn").attr("disabled", false);
		$("#busFeTer").attr("disabled", false);

	});
	$("#busFeIn")
			.focus(
					function() {
						if (($("#busFeIn").val() === null || $("#busFeIn")
								.val() === "")
								&& ($("#busFeTer").val() === null || $(
										"#busFeTer").val() === "")) {

							$("#busMedico").attr("disabled", false);
							$("#btn_busqueda").attr("disabled", true);
						} else if ((($("#busFeIn").val() !== null || $(
								"#busFeIn").val() !== "") && ($("#busFeTer")
								.val() === null || $("#busFeTer").val() === ""))
								|| (($("#busFeIn").val() === null || $(
										"#busFeIn").val() === "") && ($(
										"#busFeTer").val() !== null || $(
										"#busFeTer").val() !== ""))) {
							$("#busMedico").attr("disabled", true);
							$("#btn_busqueda").attr("disabled", true);
						} else {
							$("#busMedico").attr("disabled", true);
							$("#btn_busqueda").attr("disabled", false);
						}

					});

	$("#busFeIn")
			.change(
					function() {
						if (($("#busFeIn").val() === null || $("#busFeIn")
								.val() === "")
								&& ($("#busFeTer").val() === null || $(
										"#busFeTer").val() === "")) {
							$("#busMedico").attr("disabled", false);
							$("#btn_busqueda").attr("disabled", true);
						} else if ((($("#busFeIn").val() !== null || $(
								"#busFeIn").val() !== "") && ($("#busFeTer")
								.val() === null || $("#busFeTer").val() === ""))
								|| (($("#busFeIn").val() === null || $(
										"#busFeIn").val() === "") && ($(
										"#busFeTer").val() !== null || $(
										"#busFeTer").val() !== ""))) {
							$("#busMedico").attr("disabled", true);
							$("#btn_busqueda").attr("disabled", true);
						} else {
							$("#busMedico").attr("disabled", true);
							$("#btn_busqueda").attr("disabled", false);
						}

					});
	$("#busFeIn")
			.blur(
					function() {
						if (($("#busFeIn").val() === null || $("#busFeIn")
								.val() === "")
								&& ($("#busFeTer").val() === null || $(
										"#busFeTer").val() === "")) {
							$("#busMedico").attr("disabled", false);
							$("#btn_busqueda").attr("disabled", true);

						} else if ((($("#busFeIn").val() !== null || $(
								"#busFeIn").val() !== "") && ($("#busFeTer")
								.val() === null || $("#busFeTer").val() === ""))
								|| (($("#busFeIn").val() === null || $(
										"#busFeIn").val() === "") && ($(
										"#busFeTer").val() !== null || $(
										"#busFeTer").val() !== ""))) {
							$("#busMedico").attr("disabled", true);
							$("#btn_busqueda").attr("disabled", true);
						} else {
							$("#busMedico").attr("disabled", true);
							$("#btn_busqueda").attr("disabled", false);

						}

					});

	$("#busFeTer")
			.focus(
					function() {
						if (($("#busFeIn").val() === null || $("#busFeIn")
								.val() === "")
								&& ($("#busFeTer").val() === null || $(
										"#busFeTer").val() === "")) {
							$("#busMedico").attr("disabled", false);
							$("#btn_busqueda").attr("disabled", true);
						} else if ((($("#busFeIn").val() !== null || $(
								"#busFeIn").val() !== "") && ($("#busFeTer")
								.val() === null || $("#busFeTer").val() === ""))
								|| (($("#busFeIn").val() === null || $(
										"#busFeIn").val() === "") && ($(
										"#busFeTer").val() !== null || $(
										"#busFeTer").val() !== ""))) {
							$("#busMedico").attr("disabled", true);
							$("#btn_busqueda").attr("disabled", true);
						} else {
							$("#busMedico").attr("disabled", true);
							$("#btn_busqueda").attr("disabled", false);
						}

					});

	$("#busFeTer")
			.change(
					function() {
						if (($("#busFeIn").val() === null || $("#busFeIn")
								.val() === "")
								&& ($("#busFeTer").val() === null || $(
										"#busFeTer").val() === "")) {
							$("#busMedico").attr("disabled", false);
							$("#btn_busqueda").attr("disabled", true);
						} else if ((($("#busFeIn").val() !== null || $(
								"#busFeIn").val() !== "") && ($("#busFeTer")
								.val() === null || $("#busFeTer").val() === ""))
								|| (($("#busFeIn").val() === null || $(
										"#busFeIn").val() === "") && ($(
										"#busFeTer").val() !== null || $(
										"#busFeTer").val() !== ""))) {
							$("#busMedico").attr("disabled", true);
							$("#btn_busqueda").attr("disabled", true);
						} else {
							$("#busMedico").attr("disabled", true);
							$("#btn_busqueda").attr("disabled", false);
						}

					});
	$("#busFeTer")
			.blur(
					function() {
						if (($("#busFeIn").val() === null || $("#busFeIn")
								.val() === "")
								&& ($("#busFeTer").val() === null || $(
										"#busFeTer").val() === "")) {
							$("#busMedico").attr("disabled", false);
							$("#btn_busqueda").attr("disabled", true);
						} else if ((($("#busFeIn").val() !== null || $(
								"#busFeIn").val() !== "") && ($("#busFeTer")
								.val() === null || $("#busFeTer").val() === ""))
								|| (($("#busFeIn").val() === null || $(
										"#busFeIn").val() === "") && ($(
										"#busFeTer").val() !== null || $(
										"#busFeTer").val() !== ""))) {
							$("#busMedico").attr("disabled", true);
							$("#btn_busqueda").attr("disabled", true);
						} else {
							$("#busMedico").attr("disabled", true);
							$("#btn_busqueda").attr("disabled", false);

						}

					});

	// ------------------------------------------------------------------------------------------------------------

	$("#buscarEspecialidad").change(function() {
		if ($("#buscarEspecialidad").val().trim() === "") {
			$("#btn_medicoBusqueda").attr("disabled", true);
			$("#btn_especialidadBusqueda").attr("disabled", true);
			$("#textoBusquedaMedico").attr("disabled", false);
		} else {
			$("#textoBusquedaMedico").attr("disabled", true);
			$("#btn_medicoBusqueda").attr("disabled", true);
			$("#btn_especialidadBusqueda").attr("disabled", false);
		}
	});

	$("#textoBusquedaMedico").change(
			function() {
				if ($("#textoBusquedaMedico").val() === ""
						|| $("#textoBusquedaMedico").val() === null) {
					$("#buscarEspecialidad").attr("disabled", false);
					$("#btn_medicoBusqueda").attr("disabled", true);
				} else {
					$("#buscarEspecialidad").attr("disabled", true);
					$("#btn_medicoBusqueda").attr("disabled", false);
					$("#btn_especialidadBusqueda").attr("disabled", true);
				}
			});
	$("#textoBusquedaMedico").blur(
			function() {
				if ($("#textoBusquedaMedico").val() === ""
						|| $("#textoBusquedaMedico").val() === null) {
					$("#buscarEspecialidad").attr("disabled", false);
					$("#btn_medicoBusqueda").attr("disabled", true);
				} else {
					$("#buscarEspecialidad").attr("disabled", true);
					$("#btn_medicoBusqueda").attr("disabled", false);
					$("#btn_especialidadBusqueda").attr("disabled", true);
				}

			});

	$("#textoBusquedaMedico").focus(
			function() {
				if ($("#textoBusquedaMedico").val() === ""
						|| $("#textoBusquedaMedico").val() === null) {
					$("#buscarEspecialidad").attr("disabled", false);
					$("#btn_medicoBusqueda").attr("disabled", true);
				} else {
					$("#buscarEspecialidad").attr("disabled", true);
					$("#btn_medicoBusqueda").attr("disabled", false);
					$("#btn_especialidadBusqueda").attr("disabled", true);
				}

			});

	$("#textoBusquedaMedico").mouseout(
			function() {
				if ($("#textoBusquedaMedico").val() === ""
						|| $("#textoBusquedaMedico").val() === null) {
					$("#buscarEspecialidad").attr("disabled", false);
					$("#btn_medicoBusqueda").attr("disabled", true);
				} else {
					$("#buscarEspecialidad").attr("disabled", true);
					$("#btn_medicoBusqueda").attr("disabled", false);
					$("#btn_especialidadBusqueda").attr("disabled", true);
				}
			});
	$("#textoBusquedaMedico").mouseover(
			function() {
				if ($("#textoBusquedaMedico").val() === ""
						|| $("#textoBusquedaMedico").val() === null) {
					$("#buscarEspecialidad").attr("disabled", false);
					$("#btn_medicoBusqueda").attr("disabled", true);
				} else {
					$("#buscarEspecialidad").attr("disabled", true);
					$("#btn_medicoBusqueda").attr("disabled", false);
					$("#btn_especialidadBusqueda").attr("disabled", true);
				}
			});

	$("#btn_especialidadLimpiar").click(function() {
		$("#btn_medicoBusqueda").attr("disabled", true);
		$("#btn_especialidadBusqueda").attr("disabled", true);
		$("#textoBusquedaMedico").attr("disabled", false);

		$("#btn_especialidadBusqueda").attr("disabled", true);

	});
	$("#btn_medicoLimpiar").click(function() {
		$("#textoBusquedaMedico").attr("disabled", false);
		$("#buscarEspecialidad").attr("disabled", false);
		$("#btn_especialidadBusqueda").attr("disabled", true);
		$("#btn_medicoBusqueda").attr("disabled", true);
	});

	// --------------------------------------------------------------------------------------------------------------------
	$("#busMedicoDisponible").change(function() {
		//todos los campos llenos
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//no todos los camposfechas vacio medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//fecha llena fecha vacia medico lleno
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		// fecha vacia fecha llena medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//todos los campos vacios
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()==='0'){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//no todos los campos llenos médico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", false);
		}					
		//fecha vacia fecha llena medico vacio
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//fecha llena fecha vacia medico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
	});

	$("#btn_limpiarDisponible").click(function() {
		$("#btn_horaDisponible").attr("disabled", true);
	});

	$("#fechaInicioDisponible").change(function() {
		
		//todos los campos llenos
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//no todos los camposfechas vacio medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//fecha llena fecha vacia medico lleno
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		// fecha vacia fecha llena medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//todos los campos vacios
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()==='0'){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//no todos los campos llenos médico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", false);
		}					
		//fecha vacia fecha llena medico vacio
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//fecha llena fecha vacia medico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
			});
	$("#fechaInicioDisponible").mouseover(function() {
		
		//todos los campos llenos
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//no todos los camposfechas vacio medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//fecha llena fecha vacia medico lleno
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		// fecha vacia fecha llena medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//todos los campos vacios
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()==='0'){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//no todos los campos llenos médico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", false);
		}					
		//fecha vacia fecha llena medico vacio
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//fecha llena fecha vacia medico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
			});
	$("#fechaInicioDisponible").mouseout(function() {
		
		//todos los campos llenos
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//no todos los camposfechas vacio medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//fecha llena fecha vacia medico lleno
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		// fecha vacia fecha llena medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//todos los campos vacios
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()==='0'){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//no todos los campos llenos médico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", false);
		}					
		//fecha vacia fecha llena medico vacio
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//fecha llena fecha vacia medico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
			});
	
$("#fechaTerminoDisponible").change(function() {
		
		//todos los campos llenos
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//no todos los camposfechas vacio medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//fecha llena fecha vacia medico lleno
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		// fecha vacia fecha llena medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//todos los campos vacios
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()==='0'){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//no todos los campos llenos médico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", false);
		}					
		//fecha vacia fecha llena medico vacio
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//fecha llena fecha vacia medico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
			});
	
$("#fechaTerminoDisponible").mouseover(function() {
		
		//todos los campos llenos
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//no todos los camposfechas vacio medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//fecha llena fecha vacia medico lleno
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		// fecha vacia fecha llena medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//todos los campos vacios
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()==='0'){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//no todos los campos llenos médico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", false);
		}					
		//fecha vacia fecha llena medico vacio
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//fecha llena fecha vacia medico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
			});
	
	$("#fechaTerminoDisponible").mouseout(function() {
		
		//todos los campos llenos
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//no todos los camposfechas vacio medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()!=='0'){
			$("#btn_horaDisponible").attr("disabled", false);
		}
		//fecha llena fecha vacia medico lleno
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		// fecha vacia fecha llena medico lleno
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()!=="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//todos los campos vacios
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val().trim()==='0'){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//no todos los campos llenos médico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", false);
		}					
		//fecha vacia fecha llena medico vacio
		if($("#fechaTerminoDisponible").val()==="" && $("#fechaInicioDisponible").val()!=="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
		//fecha llena fecha vacia medico vacio
		if($("#fechaTerminoDisponible").val()!=="" && $("#fechaInicioDisponible").val()==="" && $("#busMedicoDisponible").val()==="0"){
			$("#btn_horaDisponible").attr("disabled", true);
		}
			});
	
	// --------------------------------------------------------------------------------------------------------------------
});

function muestra(valor1, valor2, valor3, valor4) {
	var idAps = document.getElementById("idMedicoBuscar");

	var idDisponible = document.getElementById("idMedicoBuscarDisponible");
	var idControl = document.getElementById("idMedicoBuscarControl");
	var nombre = document.getElementById("nombreMedico");
	var apellido = document.getElementById("apellidoMedico");
	var especialidad = document.getElementById("especialidadMedico");
	idAps.value = valor1.innerHTML;
	idControl.value = valor1.innerHTML;
	idDisponible.value = valor1.innerHTML;
	nombre.value = valor2.innerHTML;
	apellido.value = valor3.innerHTML;
	especialidad.value = valor4.innerHTML;
	$(".buttonReservar").attr("disabled", false);

}

function horaMedica(valor1, valor2, valor3, valor4) {
	var id = document.getElementById("idHoraMedicaOc");
	var fecha = document.getElementById("fechaHoraMedica");
	var hora = document.getElementById("horaHoraMedica");
	var medico = document.getElementById("medicoHoraMedica");
	medico.value = valor4.innerHTML;
	fecha.value = valor2.innerHTML;
	hora.value = valor3.innerHTML;
	id.value = valor1.innerHTML;
}
function reporte(valor1,valor2,valor3,valor4){
	
	var id= document.getElementById("idReporte");
	var fecha= document.getElementById("fecha");
	var hora= document.getElementById("hora");
	var tipo= document.getElementById("tipoReporte");
	id.value = valor1.innerHTML;
	fecha.value = valor2.innerHTML;
	hora.value = valor3.innerHTML;
	tipo.value = valor4.innerHTML;
}