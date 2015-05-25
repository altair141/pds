package capaServicio;

import java.util.Date;

import utilitario.Transformar;
import capaNegocio.hospital.Box;
import capaNegocio.hospital.HoraMedica;
import capaNegocio.hospital.Reporte;
import capaNegocio.hospital.Reserva;
import capaNegocio.personas.Especialidad;
import capaNegocio.personas.Medico;
import capaNegocio.personas.Paciente;
import capaNegocio.personas.Persona;

public class Servicio {

	public String obtenerMedicosDeUnEspecialidad(String idEspecialidad) {
		Especialidad especialidad = new Especialidad();
		Transformar t = new Transformar();
		int id = 0;
		if (t.validarNumero(idEspecialidad)) {
			id = t.StringToInt(idEspecialidad);
			especialidad.setId(id);
			Medico medico = new Medico();
			medico.setEspecialidad(especialidad);
			return medico.obtenerMedicosPorEspecialidad();

		}
		return null;
	}

	public String obtenerEspecilidades() {
		Especialidad e = new Especialidad();

		return e.buscarTodasEspecilidades();
	}

	public String buscarHoraAPSPorMedico(String idMedico) {
		HoraMedica hMedica = new HoraMedica();
		Transformar t = new Transformar();
		Medico m = new Medico();
		int id = 0;
		try{
		if (t.validarNumero(idMedico)) {
			id = t.StringToInt(idMedico);
			m.setId(id);
			hMedica.setMedico(m);
			return hMedica.buscarHoraApsPorMedico();
		}
		return "no encontrado";
		}catch(NumberFormatException e){
			return "no encontrado";	
		}
			
	}
	public String buscarHoraAPS() {
		HoraMedica hMedica = new HoraMedica();		
		try{	
			return hMedica.buscarHoraAps();
		}catch(NullPointerException e){
			return "no encontrado";	
		}		
	}
	public String buscarHoraControl() {
		HoraMedica hMedica = new HoraMedica();	
		try{	
			return hMedica.buscarHoraControl();
		}catch(NullPointerException e){
			return "no encontrado";	
		}			
	}
	public String buscarHoraControlPorMedico(String idMedico) {
		HoraMedica hMedica = new HoraMedica();
		Transformar t = new Transformar();
		Medico m = new Medico();
		int id = 0;
		try{
		if (t.validarNumero(idMedico)) {
			id = t.StringToInt(idMedico);
			m.setId(id);
			hMedica.setMedico(m);
			return hMedica.buscarHoraControlPorMedico();
		}
		return "no encontrado";
		}catch(NumberFormatException e){
			return "no encontrado";	
		}
	}

	public String buscarHoraAPSPorRango(String fechaInicio, String fechaFin) {
		HoraMedica hMedica = new HoraMedica();
		Transformar t = new Transformar();

		if (t.validarFecha(fechaInicio) && t.validarFecha(fechaFin)) {

			return hMedica.buscarHoraMedicaApsPorRango(fechaInicio, fechaFin);

		}
		return "no encontrado";
	}
	public String buscarHoraControlPorRango(String fechaInicio, String fechaFin) {
		HoraMedica hMedica = new HoraMedica();
		Transformar t = new Transformar();

		if (t.validarFecha(fechaInicio) && t.validarFecha(fechaFin)) {

			return hMedica.buscarHoraMedicaControlPorRango(fechaInicio, fechaFin);

		}
		return "no encontrado";
	}

	public String reservarHoraAps(String idHoraMedicaAps, String idPaciente) {
		HoraMedica hMedica = new HoraMedica();
		Paciente p = new Paciente();
		Persona per = new Persona();
		Transformar t = new Transformar();
		Reserva reserva = new Reserva();
		int id = 0, paciente = 0;
		if (t.validarNumero(idHoraMedicaAps) && t.validarNumero(idPaciente)) {
			id = t.StringToInt(idHoraMedicaAps);
			paciente = t.StringToInt(idPaciente);

			hMedica.setId(id);
			p.setIdPaciente(paciente);
			per.setId(p.getId());
			hMedica.setPersonaRegistra(per);
			hMedica.setPaciente(p);
			reserva.setHoraMedica(hMedica);
			return reserva.reservarHorasAPS( idHoraMedicaAps, idPaciente);

		}

		return null;
	}

	public String buscarSuDisponbilidadHoraPorFechaMedico(String idMedico, String fecha1,
			String fecha2) {
		HoraMedica hMedica = new HoraMedica();
		Medico medico = new Medico();
		Transformar t = new Transformar();
		int id = 0;
		if (t.validarNumero(idMedico) && t.validarFecha(fecha1)
				&& t.validarFecha(fecha2)) {
			id = t.StringToInt(idMedico);
			medico.setId(id);
			hMedica.setMedico(medico);			
			return hMedica.buscarDisponibilidadDeHorarioPorMedicoFecha(fecha1, fecha2);

		}

		return null;
	}
	
	public String buscarSuDisponbilidadHoraPorFecha(String fecha1,
			String fecha2) {
		HoraMedica hMedica = new HoraMedica();	
		Transformar t = new Transformar();
		int id = 0;
		if (t.validarFecha(fecha1)
				&& t.validarFecha(fecha2)) {										
			return hMedica.buscarDisponibilidadDeHorarioPorFecha(fecha1, fecha2);
		}

		return null;
	}
	public String buscarSuDisponbilidadHoraMedico(String idMedico) {
		HoraMedica hMedica = new HoraMedica();
		Medico medico = new Medico();
		Transformar t = new Transformar();
		int id = 0;
		if (t.validarNumero(idMedico)) {
			id = t.StringToInt(idMedico);
			medico.setId(id);
			hMedica.setMedico(medico);			
			return hMedica.buscarDisponibilidadDeHorarioPorMedico();

		}

		return null;
	}

	public String buscarDisponbilidadHoraMedica() {
		HoraMedica hMedica = new HoraMedica();		
		return hMedica.buscarDisponibilidadDeHorario();
	}
	public String reservarHoraMedicaControl(String idHoraMedica,
			String idPaciente) {
		HoraMedica hMedica = new HoraMedica();
		Paciente p = new Paciente();
		Persona per=new Persona();
		Reserva reserva = new Reserva();
		Transformar t = new Transformar();
		int id = 0, paciente = 0;
		if (t.validarNumero(idHoraMedica) && t.validarNumero(idPaciente)) {
			
			id = t.StringToInt(idHoraMedica);
			paciente = t.StringToInt(idPaciente);
			per.setId(p.getId());
			p.setId(paciente);
			hMedica.setPaciente(p);
			hMedica.setPersonaRegistra(per);
			reserva.setHoraMedica(hMedica);
			
			return reserva.reservarHoraControl();
		}
		return null;
	}

	public String obtenerBox() {
		Box b = new Box();

		return b.buscarBox();
	}

	public String obtenerBoxPorId(String idBox) {
		int id=0;
		Transformar t=new Transformar();
		Box b = new Box();
		if(t.validarNumero(idBox)){
			id=t.StringToInt(idBox);
			b.setIdBox(id);
			return b.buscarBoxPorId();
		}
		return null;	
	}
	public String obtenerPorcentajeOcupacionBox(String fecha1, String fecha2) {
		Reporte reporte = new Reporte();
		Transformar t = new Transformar();

		if (t.validarFecha(fecha1) && t.validarFecha(fecha2)) {
			Date fechaIni = new Date(fecha1);
			Date fechaFin = new Date(fecha2);

			return reporte.verIndicePorcentajeBox(fechaIni, fechaFin);
		}
		return null;
	}

	public String obtenerMedicos() {
		Medico m = new Medico();

		return m.obtenerMedicos();
	}
	
	public String obtenerPorcentajeOcupacionBoxPorBox(String box,String fecha1,String fecha2){
		
			Reporte reporte = new Reporte();
			Transformar t = new Transformar();
			if (t.validarFecha(fecha1) && t.validarFecha(fecha2)) {				
				return reporte.verIndicePorcentajeBoxPorBox(box,fecha1, fecha2);				
			}
			return null;
	}
	public String obtenerPorcentajeOcupacionBoxSoloBox(String box){
		
		Reporte reporte = new Reporte();
		Transformar t = new Transformar();
						
			return reporte.verIndicePorcentajeBoxPorSoloBox(box);				
		
		
}

	public String obtenerPorcentajeOcupacionMedico(String fecha1, String fecha2) {
		// aqui vamos
		Reporte reporte = new Reporte();
		Transformar t = new Transformar();
		if (t.validarFecha(fecha1) && t.validarFecha(fecha2)) {
			
			return reporte.verIndicePorcentajeMedicos(fecha1, fecha2);

		}
		return null;
	}

	public String obtenerMedicosMasSolicitado(String fecha1, String fecha2) {
		// aqui vamos
		Reporte reporte = new Reporte();
		Transformar t = new Transformar();
		if (t.validarFecha(fecha1) && t.validarFecha(fecha2)) {
		
			return reporte.medicoMasSolicitado(fecha1, fecha2);

		}
		return null;
	}

	public String obtenerPacientesMasAtendido(String fecha1, String fecha2) {
		// aqui vamos
		Reporte reporte = new Reporte();
		Transformar t = new Transformar();
		if (t.validarFecha(fecha1) && t.validarFecha(fecha2)) {
			
			return reporte.pacienteMasUtiliza(fecha1, fecha1);

		}
		return null;
	}

	public String pacienteMasUtiliza() {
		Reporte reporte = new Reporte();
		return reporte.pacienteMasUtiliza();
	}

	public String login(String user, String pass) {
		Persona persona = new Persona();
		return persona.login();
	}

	public String obtenerPaciente() {
		return Paciente.obtenerListaPacientes();
	}

	public String obtenerHorasMedicas() {
		HoraMedica h = new HoraMedica();
		return h.obtenerListaHoras();
	}

	public String buscarMedicoPorTexto(String busqueda) {
		Medico m = new Medico();
		if (busqueda != null) {
			String respuesta = m.obtenerMedicosPorBusqueda(busqueda);
			if (respuesta != null || respuesta != "") {
				return respuesta;
			}
		}
		return "no encontrado";
	}

	public String obtenerHoraMedicaControlPorIdMedico(String idMedico) {
		HoraMedica h = new HoraMedica();
		Medico m = new Medico();
		int id = 0;
		Transformar t = new Transformar();
		try{
		if (t.validarNumero(idMedico)) {
			id = t.StringToInt(idMedico);
			m.setId(id);
			h.setMedico(m);
			return h.buscarHoraControlPorMedico();
		}
		}catch(NumberFormatException e){
			return "no encontrado";
		}
		return "no encontrado";
	}
	public String obtenerHoraMedicaApsPorIdMedico(String idMedico) {
		HoraMedica h = new HoraMedica();
		Medico m = new Medico();
		int id = 0;
		Transformar t = new Transformar();
		try{
		if (t.validarNumero(idMedico)) {
			id = t.StringToInt(idMedico);
			m.setId(id);
			h.setMedico(m);
			return h.buscarHoraApsPorMedico();
		}
		}catch(NumberFormatException e){
			return "no encontrado";
		}
		return "no encontrado";
	}
	
	public String obtenerMedicoPorId(String id){
		Medico m=new Medico();
		Transformar t=new Transformar();	
		try{
		if(t.validarNumero(id)){
			m.setId(t.StringToInt(id));
			return m.obtenerMedicoPorId();
		}
		}catch(NumberFormatException e){
			return null;
		}
		return null;
	}
	
	public String buscarReportes(){
		Reporte r=new Reporte();
		return r.obtenerReportes();
		
		
	}
}



