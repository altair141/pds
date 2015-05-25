package capaNegocio.hospital;

import java.io.IOException;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.simple.JSONObject;
import org.orm.PersistentException;

import orm.HoraMedicaDAO;
import utilitario.Transformar;

public class Reporte {
	private Date fecha;
	private int id;
	private String resultado;

	public Reporte() {
		// TODO Auto-generated constructor stub
	}

	public Reporte(Date fecha, int id, String resultado) {
		super();
		this.fecha = fecha;
		this.id = id;
		this.resultado = resultado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	// --------------------------------%
	// medicos-----------------------------------------------------

	public String verIndicePorcentajeMedicos(String fechaInicio,
			String fechaFin) {
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		Transformar t=new Transformar();
		try {

			// obtener lista de medicos y horas medicas
			orm.Medico[] listaMedicos = orm.MedicoDAO.listMedicoByQuery(null,
					null);
			orm.Reserva[] listaReservas = orm.ReservaDAO.listReservaByQuery(
					null, null);
			orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
					.listHoraMedicaByQuery(null, null);

			if (listaHorasMedicas.length > 0 && listaMedicos.length > 0
					&& listaReservas.length > 0) {

				for (orm.Medico medico : listaMedicos) {
					int contadorHorasPorMedico = 0;
					for (orm.Reserva reserva : listaReservas) {
						for (orm.HoraMedica horaMedica : listaHorasMedicas) {
							if (reserva.getIdHoraMedica().getIdHora() == horaMedica
									.getIdHora()) {
								String fechas=obtenerFecha(horaMedica.getFecha());
								
								if (t.compararFechas(fechaInicio, fechaFin, fechas)
										&& horaMedica.getIdMedico().getMedico() == medico
												.getMedico()) {

									contadorHorasPorMedico++;
								}
							}
						}
					}
					// metodo para calcular el porcentaje
					double participacion = calcularPorcentaje(
							listaHorasMedicas.length, contadorHorasPorMedico);
					// agregando datos al json
					obj.put("idMedico", medico.getMedico());
					obj.put("porcentaje", participacion);
					obj.writeJSONString(out);
					jsonText = out.toString();
				}

			}

		} catch (PersistentException e) {
			jsonText = null;
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			jsonText = null;
			e.printStackTrace();
		}

		return jsonText;
	}

	// -----------------------------%
	// box--------------------------------------------------------
	public String verIndicePorcentajeBox(Date fechaInicio, Date fechaFin) {
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";

		try {
			orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
					.listHoraMedicaByQuery(null, null);
			orm.Box[] listaBox = orm.BoxDAO.listBoxByQuery(null, null);
			orm.Reserva[] listaReserva = orm.ReservaDAO.listReservaByQuery(
					null, null);

			if (listaBox.length > 0 && listaHorasMedicas.length > 0
					&& listaReserva.length > 0) {

				for (orm.Box box : listaBox) {
					int contadorBox = 0;
					for (orm.Reserva reserva : listaReserva) {
						for (orm.HoraMedica horaMedica : listaHorasMedicas) {
							if (reserva.getIdHoraMedica().getIdHora() == horaMedica
									.getIdHora()) {
								if (horaMedica.getFecha().after(fechaInicio)
										&& horaMedica.getFecha().before(
												fechaFin)) {
									contadorBox++;
								}
							}
						}
					}
					// metodo para calcular el porcentaje
					double participacion = calcularPorcentaje(
							listaReserva.length, contadorBox);
					// agregando datos al json
					obj.put("idBox", box.getIdHabitacion());
					obj.put("porcentaje", participacion);
					obj.writeJSONString(out);
					jsonText = out.toString();
				}

			}

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			jsonText = null;
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			jsonText = null;
			e.printStackTrace();
		}

		return jsonText;
	}

	// ----------------------------------medico mas
	// solicitado---------------------------------------------------

	public String medicoMasSolicitado(String fechaInicio, String fechaFin) {
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		Transformar t=new Transformar();
		try {

			// obtener lista de medicos y horas medicas
			orm.Medico[] listaMedicos = orm.MedicoDAO.listMedicoByQuery(null,
					null);
			orm.Reserva[] listaReservas = orm.ReservaDAO.listReservaByQuery(
					null, null);
			orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
					.listHoraMedicaByQuery(null, null);

			if (listaHorasMedicas.length > 0 && listaMedicos.length > 0) {

				for (orm.Medico medico : listaMedicos) {
					int contadorHorasPorMedico = 0, contadorMedicoAnterior = 0;
					capaNegocio.personas.Medico medicoNegocioAnterior = new capaNegocio.personas.Medico();
					// capaNegocio.personas.Medico medicoNegocio=new
					// capaNegocio.personas.Medico();
					for (orm.Reserva reserva : listaReservas) {
						for (orm.HoraMedica horaMedica : listaHorasMedicas) {
							if (reserva.getIdHoraMedica().getIdHora() == horaMedica
									.getIdHora()) {
								String fecha=obtenerFecha(horaMedica.getFecha());
								if (t.compararFechas(fechaInicio, fechaFin, fecha)
										&& horaMedica.getIdMedico().getMedico() == medico
												.getMedico()&&horaMedica.getAsp().equals("true")) {

									contadorHorasPorMedico++;
								}
							}

						}
					}
					// comparacion entre el medico anterior y el puntero para
					// saber quien tiene mas reservadas
				
					if (contadorHorasPorMedico > contadorMedicoAnterior
							&& contadorMedicoAnterior == 0) {
						
					
						// agregando datos al json
						obj.put("idMedico", medico.getMedico());
						obj.put("nombre", medico.getIdPersona().getNombre()
								+ " " + medico.getIdPersona().getApellidos());
						obj.writeJSONString(out);
						jsonText = out.toString();
					} else if (contadorHorasPorMedico > contadorMedicoAnterior
							&& contadorMedicoAnterior != 0) {
						
						
					
						
						obj.clear();
						obj.put("idMedico", medico.getMedico());
						obj.put("nombre", medico.getIdPersona().getNombre() + " "
										+ medico.getIdPersona().getApellidos());
						
						obj.writeJSONString(out);
						jsonText = out.toString();

					} else if (contadorHorasPorMedico == contadorMedicoAnterior
							&& contadorMedicoAnterior != 0) {
					
						obj.put("idMedico", medico.getMedico());
						obj.put("nombre", medico.getIdPersona().getNombre()
								+ " " + medico.getIdPersona().getApellidos());
						obj.writeJSONString(out);
						jsonText = out.toString();
					}

					// el contador anterior cambia con el valor del medico
					// puntero
					contadorMedicoAnterior = contadorHorasPorMedico;
					medicoNegocioAnterior.setId(medico.getMedico());
					medicoNegocioAnterior.setNombre(medico.getIdPersona()
							.getNombre());
					medicoNegocioAnterior.setApellidos(medico.getIdPersona()
							.getApellidos());
				}

			}

		} catch (PersistentException e) {
			jsonText = null;
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			jsonText = null;
			e.printStackTrace();
		}

		return jsonText;
	}

	// --------------------------------------paciente mas
	// utiliza-----------------------------------------------

	public String pacienteMasUtiliza() {
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";

		try {
			orm.Reserva[] listaReservas = orm.ReservaDAO.listReservaByQuery(
					null, null);
			orm.Paciente[] listaPacientes = orm.PacienteDAO
					.listPacienteByQuery(null, null);

			if (listaReservas.length > 0 && listaPacientes.length > 0) {
				for (orm.Paciente paciente : listaPacientes) {
					capaNegocio.personas.Paciente pacienteNegocioAnterior = new capaNegocio.personas.Paciente();
					int contadorPorPaciente = 0, contadorPacienteAnterior = 0;
					for (orm.Reserva reserva : listaReservas) {
						if (paciente.getIdPaciente() == reserva.getIdPaciente()
								.getIdPaciente()) {
							contadorPorPaciente++;
						}
					}

					// comparacion entre el paciente anterior y el puntero para
					// saber quien tiene mas reservaciones realizadas
					if (contadorPorPaciente > contadorPacienteAnterior
							&& contadorPacienteAnterior == 0) {
						// agregando datos al json
						obj.put("idPaciente", paciente.getIdPaciente());
						obj.put("nombre", paciente.getIdPersona().getNombre()
								+ " " + paciente.getIdPersona().getApellidos());
						obj.writeJSONString(out);
						jsonText = out.toString();
					} else if (contadorPorPaciente > contadorPacienteAnterior
							&& contadorPacienteAnterior != 0) {
						obj.clear();
						obj.put("idPaciente",							
								paciente.getIdPaciente());
						obj.put(
								"nombre", paciente
										.getIdPersona().getNombre()
										+ " "
										+ paciente.getIdPersona()
												.getApellidos());
						obj.writeJSONString(out);
						jsonText = out.toString();

					} else if (contadorPorPaciente == contadorPacienteAnterior
							&& contadorPacienteAnterior != 0) {
						obj.put("idPaciente", paciente.getIdPaciente());
						obj.put("nombre", paciente.getIdPersona().getNombre()
								+ " " + paciente.getIdPersona().getApellidos());
						obj.writeJSONString(out);
						jsonText = out.toString();
					}

					contadorPacienteAnterior = contadorPorPaciente;
					pacienteNegocioAnterior.setId(paciente.getIdPaciente());
					pacienteNegocioAnterior.setNombre(paciente.getIdPersona()
							.getNombre());
					pacienteNegocioAnterior.setApellidos(paciente
							.getIdPersona().getApellidos());
				}

			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			jsonText = null;
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			jsonText = null;
			e.printStackTrace();
		}

		return jsonText;
	}

	// -------------------------------------------------------------------------------------
	public String pacienteMasUtiliza(String fechaInicio, String fechaTermino) {
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		Transformar t=new Transformar();
		try {
			orm.Reserva[] listaReservas = orm.ReservaDAO.listReservaByQuery(
					null, null);
			orm.Paciente[] listaPacientes = orm.PacienteDAO
					.listPacienteByQuery(null, null);

			if (listaReservas.length > 0 && listaPacientes.length > 0) {
				for (orm.Paciente paciente : listaPacientes) {
					capaNegocio.personas.Paciente pacienteNegocioAnterior = new capaNegocio.personas.Paciente();
					int contadorPorPaciente = 0, contadorPacienteAnterior = 0;
					for (orm.Reserva reserva : listaReservas) {
						orm.HoraMedica hMedica=orm.HoraMedicaDAO.getHoraMedicaByORMID(reserva.getIdHoraMedica().getIdHora());
						String fecha=obtenerFecha(hMedica.getFecha());
						if (paciente.getIdPaciente() == reserva.getIdPaciente()
								.getIdPaciente()&&t.compararFechas(fechaInicio, fechaTermino, fecha)) {
							contadorPorPaciente++;
						}
					}

					// comparacion entre el paciente anterior y el puntero para
					// saber quien tiene mas reservaciones realizadas
					if (contadorPorPaciente > contadorPacienteAnterior
							&& contadorPacienteAnterior == 0) {
						// agregando datos al json
						obj.put("idPaciente", paciente.getIdPaciente());
						obj.put("nombre", paciente.getIdPersona().getNombre()
								+ " " + paciente.getIdPersona().getApellidos());
						obj.writeJSONString(out);
						jsonText = out.toString();
					} else if (contadorPorPaciente > contadorPacienteAnterior
							&& contadorPacienteAnterior != 0) {
						obj.clear();
						obj.put("idPaciente",							
								paciente.getIdPaciente());
						obj.put(
								"nombre", paciente
										.getIdPersona().getNombre()
										+ " "
										+ paciente.getIdPersona()
												.getApellidos());
						obj.writeJSONString(out);
						jsonText = out.toString();

					} else if (contadorPorPaciente == contadorPacienteAnterior
							&& contadorPacienteAnterior != 0) {
						obj.put("idPaciente", paciente.getIdPaciente());
						obj.put("nombre", paciente.getIdPersona().getNombre()
								+ " " + paciente.getIdPersona().getApellidos());
						obj.writeJSONString(out);
						jsonText = out.toString();
					}

					contadorPacienteAnterior = contadorPorPaciente;
					pacienteNegocioAnterior.setId(paciente.getIdPaciente());
					pacienteNegocioAnterior.setNombre(paciente.getIdPersona()
							.getNombre());
					pacienteNegocioAnterior.setApellidos(paciente
							.getIdPersona().getApellidos());
				}

			}
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			jsonText = null;
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			jsonText = null;
			e.printStackTrace();
		}

		return jsonText;
	}

	// -------------------------------------------------------------------------------------
	public double calcularPorcentaje(int total, int cantidadParticipacion) {

		return (cantidadParticipacion / total) * 100;

	}

	public String verIndicePorcentajeBoxPorBox(String box,String fechaIni,String fechaFin){
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		
		int id=0;
		Transformar t=new Transformar();
		try{
			id=t.StringToInt(box);
		}catch(NullPointerException e){
			return null;
		}
		try {
			
			orm.Box boxOrm=orm.BoxDAO.getBoxByORMID(id);
			orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
					.listHoraMedicaByQuery(null, null);			
			orm.Reserva[] listaReserva = orm.ReservaDAO.listReservaByQuery(
					null, null);

			if ( listaHorasMedicas.length > 0	&& listaReserva.length > 0) {

				
					int contadorBox = 0;
					for (orm.Reserva reserva : listaReserva) {
						for (orm.HoraMedica horaMedica : listaHorasMedicas) {
							if (reserva.getIdHoraMedica().getIdHora() == horaMedica
									.getIdHora()&&
									horaMedica.getIdBox().getIdHabitacion()==boxOrm.getIdHabitacion()) {
								
								String fecha=obtenerFecha(horaMedica.getFecha());
								if (t.compararFechas(fechaIni, fechaFin, fecha)) {
									contadorBox++;
								}
							}
						}
					}
					// metodo para calcular el porcentaje
					double participacion = calcularPorcentaje(
							listaReserva.length, contadorBox);
					// agregando datos al json
					obj.put("idBox", boxOrm.getIdHabitacion());
					obj.put("porcentaje", participacion);
					obj.writeJSONString(out);
					jsonText = out.toString();
				

			}

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			jsonText = null;
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			jsonText = null;
			e.printStackTrace();
		}

		return jsonText;
	}
	public String verIndicePorcentajeBoxPorSoloBox(String box){
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		
		int id=0;
		Transformar t=new Transformar();
		try{
			id=t.StringToInt(box);
		}catch(NullPointerException e){
			return null;
		}
		try {
			
			orm.Box boxOrm=orm.BoxDAO.getBoxByORMID(id);
			orm.HoraMedica[] listaHorasMedicas = orm.HoraMedicaDAO
					.listHoraMedicaByQuery(null, null);			
			orm.Reserva[] listaReserva = orm.ReservaDAO.listReservaByQuery(
					null, null);

			if ( listaHorasMedicas.length > 0	&& listaReserva.length > 0) {

				
					int contadorBox = 0;
					for (orm.Reserva reserva : listaReserva) {
						for (orm.HoraMedica horaMedica : listaHorasMedicas) {
							if (reserva.getIdHoraMedica().getIdHora() == horaMedica
									.getIdHora()&&
									horaMedica.getIdBox().getIdHabitacion()==boxOrm.getIdHabitacion()) {
																
									contadorBox++;
								}
							}
						}
					
					// metodo para calcular el porcentaje
					double participacion = calcularPorcentaje(
							listaReserva.length, contadorBox);
					// agregando datos al json
					obj.put("idBox", boxOrm.getIdHabitacion());
					obj.put("porcentaje", participacion);
					obj.writeJSONString(out);
					jsonText = out.toString();
				

			}	

		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			jsonText = null;
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			jsonText = null;
			e.printStackTrace();
		}

		return jsonText;
	}
	
		// -------------------------------------------------------------------------------------
	public String obtenerReportes(){
		JSONObject obj = new JSONObject();
		StringWriter out = new StringWriter();
		String jsonText = "";
		Transformar t=new Transformar();
		try {
			orm.Reporte[] listaReportes=orm.ReporteDAO.listReporteByQuery(null, null);
			for(orm.Reporte reporte: listaReportes){
				orm.TipoReporte tipoReporte=orm.TipoReporteDAO.getTipoReporteByORMID(reporte.getIdTipoReporte().getId());
				reporte.getFecha();
				String fecha="";
				String hora="";
				obj.put("idReporte",reporte.getId() );
				obj.put("fechaReporte",fecha );
				obj.put("horaReporte", hora);
				obj.put("tipoReporte", tipoReporte.getTipo());
				obj.writeJSONString(out);
				jsonText = out.toString();
				
			}
 			
		} catch (PersistentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonText =null;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			jsonText =null;
		}
		return jsonText;
	}
	public String obtenerFecha(Date fecha) {
		DateFormat fechaFormato = new SimpleDateFormat("yyyy-MM-dd");
		String convertido = fechaFormato.format(fecha);
		return convertido;
	}

	// ------------------------------------------------------------------------------------------------------------------
	public String obtenerHora(Date horas) {

		DateFormat hora = new SimpleDateFormat("HH:mm:ss");
		String convertido = hora.format(horas);
		return convertido;
	}
}
