package com.rtm.compras.managedBean;

import com.rtm.compras.bean.TDetalleordencompra;
import com.rtm.compras.business.BusinessDetalleordencompra;
import com.rtm.compras.business.BusinessDetalleordencompraImpl;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

@ManagedBean(name="detalleordencompraBean")
@SessionScoped
public class DetalleordencompraBean {
    static final Logger log = Logger.getLogger(DetalleordencompraBean.class);

    private BusinessDetalleordencompra businessDetalleordencompra = new BusinessDetalleordencompraImpl();

    private TDetalleordencompra detalleordencompra;

    private List<TDetalleordencompra> listaDetalleordencompra;

    public DetalleordencompraBean() {
        detalleordencompra = new TDetalleordencompra();
		ListarDetalleordencompras(detalleordencompra);
    }

    public void ListarDetalleordencompras(TDetalleordencompra detalleordencompra) {
        log.debug("Estoy en el Metodo VOID ManagedBeans ListarDetalleordencompras");
		detalleordencompra.setBt_habilitado(true);
		listaDetalleordencompra = businessDetalleordencompra.listarDetalleordencompra(detalleordencompra);
    }

    public String ListarDetalleordencompras() {
        log.debug("Estoy en el Metodo ManagedBeans ListarDetalleordencompras Page");
		detalleordencompra = new TDetalleordencompra();
		this.ListarDetalleordencompras(detalleordencompra);
		return "/paginas/detalleordencompra/searchDetalleordencompra";
    }

    public void cargarDatosMaestros() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatosMaestros");
		detalleordencompra=new TDetalleordencompra();
    }

    public void cargarDatos() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos SIN Parametros");
    }

    public void cargarDatos(Integer in_iddetordcompra) {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos con Parametros");
		
			detalleordencompra = new TDetalleordencompra();
			detalleordencompra.setIn_iddetordcompra(in_iddetordcompra);
			detalleordencompra = businessDetalleordencompra.obtenerDetalleordencompra(detalleordencompra);
    }

    public void guardarRegistroDetalleordencompra() {
        log.debug("Estoy en el Metodo ManagedBeans guardarRegistroDetalleordencompra");
		businessDetalleordencompra.insertarDetalleordencompra(detalleordencompra);
		ListarDetalleordencompras(new TDetalleordencompra());
    }

    public void actualizarRegistroDetalleordencompra() {
        log.debug("Estoy en el Metodo ManagedBeans actualizarRegistroDetalleordencompra");
		businessDetalleordencompra.actualizarDetalleordencompra(detalleordencompra);
		ListarDetalleordencompras(new TDetalleordencompra());
    }

    public void eliminarRegistroDetalleordencompra() {
        log.debug("Estoy en el Metodo ManagedBeans eliminarRegistroDetalleordencompra");
		businessDetalleordencompra.eliminarDetalleordencompra(detalleordencompra);
		ListarDetalleordencompras(new TDetalleordencompra());
    }

    public void onRowSelect(SelectEvent event) {
        log.debug("Estoy en el Metodo ManagedBeans onRowSelect");
		detalleordencompra = (TDetalleordencompra) event.getObject();
		Integer in_iddetordcompra = detalleordencompra.getIn_iddetordcompra();
		detalleordencompra = new TDetalleordencompra();
		detalleordencompra.setIn_iddetordcompra(in_iddetordcompra);
		detalleordencompra = businessDetalleordencompra.obtenerDetalleordencompra(detalleordencompra);
    }

    public TDetalleordencompra getDetalleordencompra() {
        return detalleordencompra;
    }

    public void setDetalleordencompra(TDetalleordencompra detalleordencompra) {
        this.detalleordencompra = detalleordencompra;
    }

    public List<TDetalleordencompra> getListaDetalleordencompra() {
        return listaDetalleordencompra;
    }

    public void setListaDetalleordencompra(List<TDetalleordencompra> listaDetalleordencompra) {
        this.listaDetalleordencompra = listaDetalleordencompra;
    }
}