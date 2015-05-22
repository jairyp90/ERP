package com.rtm.compras.managedBean;

import com.rtm.compras.bean.TDetallesolicitud;
import com.rtm.compras.business.BusinessDetallesolicitud;
import com.rtm.compras.business.BusinessDetallesolicitudImpl;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

@ManagedBean(name="detallesolicitudBean")
@SessionScoped
public class DetallesolicitudBean {
    static final Logger log = Logger.getLogger(DetallesolicitudBean.class);

    private BusinessDetallesolicitud businessDetallesolicitud = new BusinessDetallesolicitudImpl();

    private TDetallesolicitud detallesolicitud;

    private List<TDetallesolicitud> listaDetallesolicitud;

    public DetallesolicitudBean() {
        detallesolicitud = new TDetallesolicitud();
		ListarDetallesolicitudes(detallesolicitud);
    }

    public void ListarDetallesolicitudes(TDetallesolicitud detallesolicitud) {
        log.debug("Estoy en el Metodo VOID ManagedBeans ListarDetallesolicitudes");
		detallesolicitud.setBt_habilitado(true);
		listaDetallesolicitud = businessDetallesolicitud.listarDetallesolicitud(detallesolicitud);
    }

    public String ListarDetallesolicitudes() {
        log.debug("Estoy en el Metodo ManagedBeans ListarDetallesolicitudes Page");
		detallesolicitud = new TDetallesolicitud();
		this.ListarDetallesolicitudes(detallesolicitud);
		return "/paginas/detallesolicitud/searchDetallesolicitud";
    }

    public void cargarDatosMaestros() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatosMaestros");
		detallesolicitud=new TDetallesolicitud();
    }

    public void cargarDatos() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos SIN Parametros");
    }

    public void cargarDatos(Integer in_iddetsolicitud) {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos con Parametros");
		
			detallesolicitud = new TDetallesolicitud();
			detallesolicitud.setIn_iddetsolicitud(in_iddetsolicitud);
			detallesolicitud = businessDetallesolicitud.obtenerDetallesolicitud(detallesolicitud);
    }

    public void guardarRegistroDetallesolicitud() {
        log.debug("Estoy en el Metodo ManagedBeans guardarRegistroDetallesolicitud");
		businessDetallesolicitud.insertarDetallesolicitud(detallesolicitud);
		ListarDetallesolicitudes(new TDetallesolicitud());
    }

    public void actualizarRegistroDetallesolicitud() {
        log.debug("Estoy en el Metodo ManagedBeans actualizarRegistroDetallesolicitud");
		businessDetallesolicitud.actualizarDetallesolicitud(detallesolicitud);
		ListarDetallesolicitudes(new TDetallesolicitud());
    }

    public void eliminarRegistroDetallesolicitud() {
        log.debug("Estoy en el Metodo ManagedBeans eliminarRegistroDetallesolicitud");
		businessDetallesolicitud.eliminarDetallesolicitud(detallesolicitud);
		ListarDetallesolicitudes(new TDetallesolicitud());
    }

    public void onRowSelect(SelectEvent event) {
        log.debug("Estoy en el Metodo ManagedBeans onRowSelect");
		detallesolicitud = (TDetallesolicitud) event.getObject();
		Integer in_iddetsolicitud = detallesolicitud.getIn_iddetsolicitud();
		detallesolicitud = new TDetallesolicitud();
		detallesolicitud.setIn_iddetsolicitud(in_iddetsolicitud);
		detallesolicitud = businessDetallesolicitud.obtenerDetallesolicitud(detallesolicitud);
    }

    public TDetallesolicitud getDetallesolicitud() {
        return detallesolicitud;
    }

    public void setDetallesolicitud(TDetallesolicitud detallesolicitud) {
        this.detallesolicitud = detallesolicitud;
    }

    public List<TDetallesolicitud> getListaDetallesolicitud() {
        return listaDetallesolicitud;
    }

    public void setListaDetallesolicitud(List<TDetallesolicitud> listaDetallesolicitud) {
        this.listaDetallesolicitud = listaDetallesolicitud;
    }
}