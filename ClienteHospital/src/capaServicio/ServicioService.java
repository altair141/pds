/**
 * ServicioService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package capaServicio;

public interface ServicioService extends javax.xml.rpc.Service {
    public java.lang.String getServicioAddress();

    public capaServicio.Servicio getServicio() throws javax.xml.rpc.ServiceException;

    public capaServicio.Servicio getServicio(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
