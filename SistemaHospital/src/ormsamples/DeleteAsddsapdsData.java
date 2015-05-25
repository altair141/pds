/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class DeleteAsddsapdsData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = orm.AsddsapdsPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Reserva lormReserva = orm.ReservaDAO.loadReservaByQuery(null, null);
			// Delete the persistent object
			orm.ReservaDAO.delete(lormReserva);
			orm.HoraMedica lormHoraMedica = orm.HoraMedicaDAO.loadHoraMedicaByQuery(null, null);
			// Delete the persistent object
			orm.HoraMedicaDAO.delete(lormHoraMedica);
			orm.Paciente lormPaciente = orm.PacienteDAO.loadPacienteByQuery(null, null);
			// Delete the persistent object
			orm.PacienteDAO.delete(lormPaciente);
			orm.Persona lormPersona = orm.PersonaDAO.loadPersonaByQuery(null, null);
			// Delete the persistent object
			orm.PersonaDAO.delete(lormPersona);
			orm.TipoReporte lormTipoReporte = orm.TipoReporteDAO.loadTipoReporteByQuery(null, null);
			// Delete the persistent object
			orm.TipoReporteDAO.delete(lormTipoReporte);
			orm.Reporte lormReporte = orm.ReporteDAO.loadReporteByQuery(null, null);
			// Delete the persistent object
			orm.ReporteDAO.delete(lormReporte);
			orm.DirectorHospital lormDirectorHospital = orm.DirectorHospitalDAO.loadDirectorHospitalByQuery(null, null);
			// Delete the persistent object
			orm.DirectorHospitalDAO.delete(lormDirectorHospital);
			orm.Medico lormMedico = orm.MedicoDAO.loadMedicoByQuery(null, null);
			// Delete the persistent object
			orm.MedicoDAO.delete(lormMedico);
			orm.Especialidad lormEspecialidad = orm.EspecialidadDAO.loadEspecialidadByQuery(null, null);
			// Delete the persistent object
			orm.EspecialidadDAO.delete(lormEspecialidad);
			orm.Box lormBox = orm.BoxDAO.loadBoxByQuery(null, null);
			// Delete the persistent object
			orm.BoxDAO.delete(lormBox);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteAsddsapdsData deleteAsddsapdsData = new DeleteAsddsapdsData();
			try {
				deleteAsddsapdsData.deleteTestData();
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
