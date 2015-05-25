package capaServicio;

public class ServicioProxy implements capaServicio.Servicio {
  private String _endpoint = null;
  private capaServicio.Servicio servicio = null;
  
  public ServicioProxy() {
    _initServicioProxy();
  }
  
  public ServicioProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicioProxy();
  }
  
  private void _initServicioProxy() {
    try {
      servicio = (new capaServicio.ServicioServiceLocator()).getServicio();
      if (servicio != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicio)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicio)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicio != null)
      ((javax.xml.rpc.Stub)servicio)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public capaServicio.Servicio getServicio() {
    if (servicio == null)
      _initServicioProxy();
    return servicio;
  }
  
  public java.lang.String buscarSuDisponbilidadHoraPorFechaMedico(java.lang.String idMedico, java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.buscarSuDisponbilidadHoraPorFechaMedico(idMedico, fecha1, fecha2);
  }
  
  public java.lang.String obtenerHoraMedicaControlPorIdMedico(java.lang.String idMedico) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerHoraMedicaControlPorIdMedico(idMedico);
  }
  
  public java.lang.String login(java.lang.String user, java.lang.String pass) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.login(user, pass);
  }
  
  public java.lang.String obtenerBoxPorId(java.lang.String idBox) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerBoxPorId(idBox);
  }
  
  public java.lang.String reservarHoraAps(java.lang.String idHoraMedicaAps, java.lang.String idPaciente) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.reservarHoraAps(idHoraMedicaAps, idPaciente);
  }
  
  public java.lang.String obtenerBox() throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerBox();
  }
  
  public java.lang.String obtenerMedicos() throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerMedicos();
  }
  
  public java.lang.String obtenerPaciente() throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerPaciente();
  }
  
  public java.lang.String buscarHoraAPS() throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.buscarHoraAPS();
  }
  
  public java.lang.String buscarHoraControlPorRango(java.lang.String fechaInicio, java.lang.String fechaFin) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.buscarHoraControlPorRango(fechaInicio, fechaFin);
  }
  
  public java.lang.String buscarHoraAPSPorRango(java.lang.String fechaInicio, java.lang.String fechaFin) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.buscarHoraAPSPorRango(fechaInicio, fechaFin);
  }
  
  public java.lang.String buscarHoraControlPorMedico(java.lang.String idMedico) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.buscarHoraControlPorMedico(idMedico);
  }
  
  public java.lang.String buscarHoraControl() throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.buscarHoraControl();
  }
  
  public java.lang.String buscarHoraAPSPorMedico(java.lang.String idMedico) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.buscarHoraAPSPorMedico(idMedico);
  }
  
  public java.lang.String obtenerMedicosDeUnEspecialidad(java.lang.String idEspecialidad) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerMedicosDeUnEspecialidad(idEspecialidad);
  }
  
  public java.lang.String obtenerEspecilidades() throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerEspecilidades();
  }
  
  public java.lang.String buscarSuDisponbilidadHoraMedico(java.lang.String idMedico) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.buscarSuDisponbilidadHoraMedico(idMedico);
  }
  
  public java.lang.String buscarDisponbilidadHoraMedica() throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.buscarDisponbilidadHoraMedica();
  }
  
  public java.lang.String reservarHoraMedicaControl(java.lang.String idHoraMedica, java.lang.String idPaciente) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.reservarHoraMedicaControl(idHoraMedica, idPaciente);
  }
  
  public java.lang.String obtenerPorcentajeOcupacionBox(java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerPorcentajeOcupacionBox(fecha1, fecha2);
  }
  
  public java.lang.String obtenerPorcentajeOcupacionMedico(java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerPorcentajeOcupacionMedico(fecha1, fecha2);
  }
  
  public java.lang.String obtenerMedicosMasSolicitado(java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerMedicosMasSolicitado(fecha1, fecha2);
  }
  
  public java.lang.String obtenerPacientesMasAtendido(java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerPacientesMasAtendido(fecha1, fecha2);
  }
  
  public java.lang.String pacienteMasUtiliza() throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.pacienteMasUtiliza();
  }
  
  public java.lang.String obtenerHorasMedicas() throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerHorasMedicas();
  }
  
  public java.lang.String buscarMedicoPorTexto(java.lang.String busqueda) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.buscarMedicoPorTexto(busqueda);
  }
  
  public java.lang.String obtenerHoraMedicaApsPorIdMedico(java.lang.String idMedico) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerHoraMedicaApsPorIdMedico(idMedico);
  }
  
  public java.lang.String obtenerMedicoPorId(java.lang.String id) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerMedicoPorId(id);
  }
  
  public java.lang.String obtenerPorcentajeOcupacionBoxPorBox(java.lang.String box, java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerPorcentajeOcupacionBoxPorBox(box, fecha1, fecha2);
  }
  
  public java.lang.String obtenerPorcentajeOcupacionBoxSoloBox(java.lang.String box) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.obtenerPorcentajeOcupacionBoxSoloBox(box);
  }
  
  public java.lang.String buscarSuDisponbilidadHoraPorFecha(java.lang.String fecha1, java.lang.String fecha2) throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.buscarSuDisponbilidadHoraPorFecha(fecha1, fecha2);
  }
  
  public java.lang.String buscarReportes() throws java.rmi.RemoteException{
    if (servicio == null)
      _initServicioProxy();
    return servicio.buscarReportes();
  }
  
  
}