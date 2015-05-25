/**
 * Servicio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package capaServicio;

public interface Servicio extends java.rmi.Remote {
    public java.lang.String buscarSuDisponbilidadHoraPorFechaMedico(java.lang.String idMedico, java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException;
    public java.lang.String obtenerHoraMedicaControlPorIdMedico(java.lang.String idMedico) throws java.rmi.RemoteException;
    public java.lang.String login(java.lang.String user, java.lang.String pass) throws java.rmi.RemoteException;
    public java.lang.String obtenerBoxPorId(java.lang.String idBox) throws java.rmi.RemoteException;
    public java.lang.String reservarHoraAps(java.lang.String idHoraMedicaAps, java.lang.String idPaciente) throws java.rmi.RemoteException;
    public java.lang.String obtenerBox() throws java.rmi.RemoteException;
    public java.lang.String obtenerMedicos() throws java.rmi.RemoteException;
    public java.lang.String obtenerPaciente() throws java.rmi.RemoteException;
    public java.lang.String buscarHoraAPS() throws java.rmi.RemoteException;
    public java.lang.String buscarHoraControlPorRango(java.lang.String fechaInicio, java.lang.String fechaFin) throws java.rmi.RemoteException;
    public java.lang.String buscarHoraAPSPorRango(java.lang.String fechaInicio, java.lang.String fechaFin) throws java.rmi.RemoteException;
    public java.lang.String buscarHoraControlPorMedico(java.lang.String idMedico) throws java.rmi.RemoteException;
    public java.lang.String buscarHoraControl() throws java.rmi.RemoteException;
    public java.lang.String buscarHoraAPSPorMedico(java.lang.String idMedico) throws java.rmi.RemoteException;
    public java.lang.String obtenerMedicosDeUnEspecialidad(java.lang.String idEspecialidad) throws java.rmi.RemoteException;
    public java.lang.String obtenerEspecilidades() throws java.rmi.RemoteException;
    public java.lang.String buscarSuDisponbilidadHoraMedico(java.lang.String idMedico) throws java.rmi.RemoteException;
    public java.lang.String buscarDisponbilidadHoraMedica() throws java.rmi.RemoteException;
    public java.lang.String reservarHoraMedicaControl(java.lang.String idHoraMedica, java.lang.String idPaciente) throws java.rmi.RemoteException;
    public java.lang.String obtenerPorcentajeOcupacionBox(java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException;
    public java.lang.String obtenerPorcentajeOcupacionMedico(java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException;
    public java.lang.String obtenerMedicosMasSolicitado(java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException;
    public java.lang.String obtenerPacientesMasAtendido(java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException;
    public java.lang.String pacienteMasUtiliza() throws java.rmi.RemoteException;
    public java.lang.String obtenerHorasMedicas() throws java.rmi.RemoteException;
    public java.lang.String buscarMedicoPorTexto(java.lang.String busqueda) throws java.rmi.RemoteException;
    public java.lang.String obtenerHoraMedicaApsPorIdMedico(java.lang.String idMedico) throws java.rmi.RemoteException;
    public java.lang.String obtenerMedicoPorId(java.lang.String id) throws java.rmi.RemoteException;
    public java.lang.String obtenerPorcentajeOcupacionBoxPorBox(java.lang.String box, java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException;
    public java.lang.String obtenerPorcentajeOcupacionBoxSoloBox(java.lang.String box) throws java.rmi.RemoteException;
    public java.lang.String buscarSuDisponbilidadHoraPorFecha(java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException;
    public java.lang.String buscarReportes() throws java.rmi.RemoteException;
}
