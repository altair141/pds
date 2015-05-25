/**
 * Licensee: Universidad de La Frontera
 * License Type: Academic
 */
package ormsamples;

import org.orm.*;
public class CreateAsddsapdsData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = orm.AsddsapdsPersistentManager.instance().getSession().beginTransaction();
		try {
			orm.Reserva lormReserva = orm.ReservaDAO.createReserva();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idPersonaRegistra, idHoraMedica, idPaciente
			orm.ReservaDAO.save(lormReserva);
			orm.HoraMedica lormHoraMedica = orm.HoraMedicaDAO.createHoraMedica();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva, fecha, asp, idBox, idMedico
			orm.HoraMedicaDAO.save(lormHoraMedica);
			orm.Paciente lormPaciente = orm.PacienteDAO.createPaciente();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva, idPersona, nroFichaMedica
			orm.PacienteDAO.save(lormPaciente);
			orm.Persona lormPersona = orm.PersonaDAO.createPersona();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reserva, medico, directorHospital, paciente, clave, nombreUsuario, celular, email, telefono, estado, region, provincia, comuna, ciudad, direccion, fechaNacimiento, rut, apellidos, nombre
			orm.PersonaDAO.save(lormPersona);
			orm.TipoReporte lormTipoReporte = orm.TipoReporteDAO.createTipoReporte();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reporte, tipo
			orm.TipoReporteDAO.save(lormTipoReporte);
			orm.Reporte lormReporte = orm.ReporteDAO.createReporte();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : idTipoReporte, resultado, fecha, idDirectorHospital
			orm.ReporteDAO.save(lormReporte);
			orm.DirectorHospital lormDirectorHospital = orm.DirectorHospitalDAO.createDirectorHospital();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : reporte, idPersona
			orm.DirectorHospitalDAO.save(lormDirectorHospital);
			orm.Medico lormMedico = orm.MedicoDAO.createMedico();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : horaMedica, idPersona, especialidad
			orm.MedicoDAO.save(lormMedico);
			orm.Especialidad lormEspecialidad = orm.EspecialidadDAO.createEspecialidad();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : medico, nombreEspecialidad
			orm.EspecialidadDAO.save(lormEspecialidad);
			orm.Box lormBox = orm.BoxDAO.createBox();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : horaMedica, especialidad, nroHabitacion
			orm.BoxDAO.save(lormBox);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateAsddsapdsData createAsddsapdsData = new CreateAsddsapdsData();
			try {
				createAsddsapdsData.createTestData();
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
