/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class ListAsddsapdsData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Reserva...");
		orm.Reserva[] ormReservas = orm.ReservaDAO.listReservaByQuery(null, null);
		int length = Math.min(ormReservas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormReservas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing HoraMedica...");
		orm.HoraMedica[] ormHoraMedicas = orm.HoraMedicaDAO.listHoraMedicaByQuery(null, null);
		length = Math.min(ormHoraMedicas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormHoraMedicas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Paciente...");
		orm.Paciente[] ormPacientes = orm.PacienteDAO.listPacienteByQuery(null, null);
		length = Math.min(ormPacientes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPacientes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Persona...");
		orm.Persona[] ormPersonas = orm.PersonaDAO.listPersonaByQuery(null, null);
		length = Math.min(ormPersonas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TipoReporte...");
		orm.TipoReporte[] ormTipoReportes = orm.TipoReporteDAO.listTipoReporteByQuery(null, null);
		length = Math.min(ormTipoReportes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormTipoReportes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Reporte...");
		orm.Reporte[] ormReportes = orm.ReporteDAO.listReporteByQuery(null, null);
		length = Math.min(ormReportes.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormReportes[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing DirectorHospital...");
		orm.DirectorHospital[] ormDirectorHospitals = orm.DirectorHospitalDAO.listDirectorHospitalByQuery(null, null);
		length = Math.min(ormDirectorHospitals.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormDirectorHospitals[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Medico...");
		orm.Medico[] ormMedicos = orm.MedicoDAO.listMedicoByQuery(null, null);
		length = Math.min(ormMedicos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormMedicos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Especialidad...");
		orm.Especialidad[] ormEspecialidads = orm.EspecialidadDAO.listEspecialidadByQuery(null, null);
		length = Math.min(ormEspecialidads.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormEspecialidads[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Box...");
		orm.Box[] ormBoxs = orm.BoxDAO.listBoxByQuery(null, null);
		length = Math.min(ormBoxs.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(ormBoxs[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Reserva by Criteria...");
		orm.ReservaCriteria lormReservaCriteria = new orm.ReservaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormReservaCriteria.idReserva.eq();
		lormReservaCriteria.setMaxResults(ROW_COUNT);
		orm.Reserva[] ormReservas = lormReservaCriteria.listReserva();
		int length =ormReservas== null ? 0 : Math.min(ormReservas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormReservas[i]);
		}
		System.out.println(length + " Reserva record(s) retrieved."); 
		
		System.out.println("Listing HoraMedica by Criteria...");
		orm.HoraMedicaCriteria lormHoraMedicaCriteria = new orm.HoraMedicaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormHoraMedicaCriteria.idHora.eq();
		lormHoraMedicaCriteria.setMaxResults(ROW_COUNT);
		orm.HoraMedica[] ormHoraMedicas = lormHoraMedicaCriteria.listHoraMedica();
		length =ormHoraMedicas== null ? 0 : Math.min(ormHoraMedicas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormHoraMedicas[i]);
		}
		System.out.println(length + " HoraMedica record(s) retrieved."); 
		
		System.out.println("Listing Paciente by Criteria...");
		orm.PacienteCriteria lormPacienteCriteria = new orm.PacienteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPacienteCriteria.idPaciente.eq();
		lormPacienteCriteria.setMaxResults(ROW_COUNT);
		orm.Paciente[] ormPacientes = lormPacienteCriteria.listPaciente();
		length =ormPacientes== null ? 0 : Math.min(ormPacientes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPacientes[i]);
		}
		System.out.println(length + " Paciente record(s) retrieved."); 
		
		System.out.println("Listing Persona by Criteria...");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormPersonaCriteria.idPersona.eq();
		lormPersonaCriteria.setMaxResults(ROW_COUNT);
		orm.Persona[] ormPersonas = lormPersonaCriteria.listPersona();
		length =ormPersonas== null ? 0 : Math.min(ormPersonas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormPersonas[i]);
		}
		System.out.println(length + " Persona record(s) retrieved."); 
		
		System.out.println("Listing TipoReporte by Criteria...");
		orm.TipoReporteCriteria lormTipoReporteCriteria = new orm.TipoReporteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormTipoReporteCriteria.id.eq();
		lormTipoReporteCriteria.setMaxResults(ROW_COUNT);
		orm.TipoReporte[] ormTipoReportes = lormTipoReporteCriteria.listTipoReporte();
		length =ormTipoReportes== null ? 0 : Math.min(ormTipoReportes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormTipoReportes[i]);
		}
		System.out.println(length + " TipoReporte record(s) retrieved."); 
		
		System.out.println("Listing Reporte by Criteria...");
		orm.ReporteCriteria lormReporteCriteria = new orm.ReporteCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormReporteCriteria.id.eq();
		lormReporteCriteria.setMaxResults(ROW_COUNT);
		orm.Reporte[] ormReportes = lormReporteCriteria.listReporte();
		length =ormReportes== null ? 0 : Math.min(ormReportes.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormReportes[i]);
		}
		System.out.println(length + " Reporte record(s) retrieved."); 
		
		System.out.println("Listing DirectorHospital by Criteria...");
		orm.DirectorHospitalCriteria lormDirectorHospitalCriteria = new orm.DirectorHospitalCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormDirectorHospitalCriteria.id.eq();
		lormDirectorHospitalCriteria.setMaxResults(ROW_COUNT);
		orm.DirectorHospital[] ormDirectorHospitals = lormDirectorHospitalCriteria.listDirectorHospital();
		length =ormDirectorHospitals== null ? 0 : Math.min(ormDirectorHospitals.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormDirectorHospitals[i]);
		}
		System.out.println(length + " DirectorHospital record(s) retrieved."); 
		
		System.out.println("Listing Medico by Criteria...");
		orm.MedicoCriteria lormMedicoCriteria = new orm.MedicoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormMedicoCriteria.medico.eq();
		lormMedicoCriteria.setMaxResults(ROW_COUNT);
		orm.Medico[] ormMedicos = lormMedicoCriteria.listMedico();
		length =ormMedicos== null ? 0 : Math.min(ormMedicos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormMedicos[i]);
		}
		System.out.println(length + " Medico record(s) retrieved."); 
		
		System.out.println("Listing Especialidad by Criteria...");
		orm.EspecialidadCriteria lormEspecialidadCriteria = new orm.EspecialidadCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormEspecialidadCriteria.id.eq();
		lormEspecialidadCriteria.setMaxResults(ROW_COUNT);
		orm.Especialidad[] ormEspecialidads = lormEspecialidadCriteria.listEspecialidad();
		length =ormEspecialidads== null ? 0 : Math.min(ormEspecialidads.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormEspecialidads[i]);
		}
		System.out.println(length + " Especialidad record(s) retrieved."); 
		
		System.out.println("Listing Box by Criteria...");
		orm.BoxCriteria lormBoxCriteria = new orm.BoxCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//lormBoxCriteria.idHabitacion.eq();
		lormBoxCriteria.setMaxResults(ROW_COUNT);
		orm.Box[] ormBoxs = lormBoxCriteria.listBox();
		length =ormBoxs== null ? 0 : Math.min(ormBoxs.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(ormBoxs[i]);
		}
		System.out.println(length + " Box record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListAsddsapdsData listAsddsapdsData = new ListAsddsapdsData();
			try {
				listAsddsapdsData.listTestData();
				//listAsddsapdsData.listByCriteria();
			}
			finally {
				orm.AsddsapdsPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
