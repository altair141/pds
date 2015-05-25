/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class RetrieveAndUpdateAsddsapdsData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = orm.AsddsapdsPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Reserva lormReserva = orm.ReservaDAO.loadReservaByQuery(null, null);
			// Update the properties of the persistent object
			orm.ReservaDAO.save(lormReserva);
			orm.HoraMedica lormHoraMedica = orm.HoraMedicaDAO.loadHoraMedicaByQuery(null, null);
			// Update the properties of the persistent object
			orm.HoraMedicaDAO.save(lormHoraMedica);
			orm.Paciente lormPaciente = orm.PacienteDAO.loadPacienteByQuery(null, null);
			// Update the properties of the persistent object
			orm.PacienteDAO.save(lormPaciente);
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Update the properties of the persistent object
			orm.PersonaDAO.save(lormPersona);
			orm.TipoReporte lormTipoReporte = orm.TipoReporteDAO.loadTipoReporteByQuery(null, null);
			// Update the properties of the persistent object
			orm.TipoReporteDAO.save(lormTipoReporte);
			orm.Reporte lormReporte = orm.ReporteDAO.loadReporteByQuery(null, null);
			// Update the properties of the persistent object
			orm.ReporteDAO.save(lormReporte);
			orm.DirectorHospital lormDirectorHospital = orm.DirectorHospitalDAO.loadDirectorHospitalByQuery(null, null);
			// Update the properties of the persistent object
			orm.DirectorHospitalDAO.save(lormDirectorHospital);
			orm.Medico lormMedico = orm.MedicoDAO.loadMedicoByQuery(null, null);
			// Update the properties of the persistent object
			orm.MedicoDAO.save(lormMedico);
			orm.Especialidad lormEspecialidad = orm.EspecialidadDAO.loadEspecialidadByQuery(null, null);
			// Update the properties of the persistent object
			orm.EspecialidadDAO.save(lormEspecialidad);
			orm.Box lormBox = orm.BoxDAO.loadBoxByQuery(null, null);
			// Update the properties of the persistent object
			orm.BoxDAO.save(lormBox);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Reserva by ReservaCriteria");
		orm.ReservaCriteria lormReservaCriteria = new orm.ReservaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormReservaCriteria.idReserva.eq();
		System.out.println(lormReservaCriteria.uniqueReserva());
		
		System.out.println("Retrieving HoraMedica by HoraMedicaCriteria");
		orm.HoraMedicaCriteria lormHoraMedicaCriteria = new orm.HoraMedicaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormHoraMedicaCriteria.idHora.eq();
		System.out.println(lormHoraMedicaCriteria.uniqueHoraMedica());
		
		System.out.println("Retrieving Paciente by PacienteCriteria");
		orm.PacienteCriteria lormPacienteCriteria = new orm.PacienteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPacienteCriteria.idPaciente.eq();
		System.out.println(lormPacienteCriteria.uniquePaciente());
		
		System.out.println("Retrieving Persona by PersonaCriteria");
		orm.PersonaCriteria lormPersonaCriteria = new orm.PersonaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormPersonaCriteria.idPersona.eq();
		System.out.println(lormPersonaCriteria.uniquePersona());
		
		System.out.println("Retrieving TipoReporte by TipoReporteCriteria");
		orm.TipoReporteCriteria lormTipoReporteCriteria = new orm.TipoReporteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormTipoReporteCriteria.id.eq();
		System.out.println(lormTipoReporteCriteria.uniqueTipoReporte());
		
		System.out.println("Retrieving Reporte by ReporteCriteria");
		orm.ReporteCriteria lormReporteCriteria = new orm.ReporteCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormReporteCriteria.id.eq();
		System.out.println(lormReporteCriteria.uniqueReporte());
		
		System.out.println("Retrieving DirectorHospital by DirectorHospitalCriteria");
		orm.DirectorHospitalCriteria lormDirectorHospitalCriteria = new orm.DirectorHospitalCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormDirectorHospitalCriteria.id.eq();
		System.out.println(lormDirectorHospitalCriteria.uniqueDirectorHospital());
		
		System.out.println("Retrieving Medico by MedicoCriteria");
		orm.MedicoCriteria lormMedicoCriteria = new orm.MedicoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormMedicoCriteria.medico.eq();
		System.out.println(lormMedicoCriteria.uniqueMedico());
		
		System.out.println("Retrieving Especialidad by EspecialidadCriteria");
		orm.EspecialidadCriteria lormEspecialidadCriteria = new orm.EspecialidadCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormEspecialidadCriteria.id.eq();
		System.out.println(lormEspecialidadCriteria.uniqueEspecialidad());
		
		System.out.println("Retrieving Box by BoxCriteria");
		orm.BoxCriteria lormBoxCriteria = new orm.BoxCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//lormBoxCriteria.idHabitacion.eq();
		System.out.println(lormBoxCriteria.uniqueBox());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateAsddsapdsData retrieveAndUpdateAsddsapdsData = new RetrieveAndUpdateAsddsapdsData();
			try {
				retrieveAndUpdateAsddsapdsData.retrieveAndUpdateTestData();
				//retrieveAndUpdateAsddsapdsData.retrieveByCriteria();
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
