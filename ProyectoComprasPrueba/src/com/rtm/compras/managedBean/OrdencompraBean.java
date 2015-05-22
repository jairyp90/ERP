package com.rtm.compras.managedBean;

import com.rtm.compras.bean.TOrdencompra;
import com.rtm.compras.business.BusinessOrdencompra;
import com.rtm.compras.business.BusinessOrdencompraImpl;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

@ManagedBean(name="ordencompraBean")
@SessionScoped
public class OrdencompraBean {
    static final Logger log = Logger.getLogger(OrdencompraBean.class);

    private BusinessOrdencompra businessOrdencompra = new BusinessOrdencompraImpl();

    private TOrdencompra ordencompra;

    private List<TOrdencompra> listaOrdencompra;

    public OrdencompraBean() {
        ordencompra = new TOrdencompra();
		ListarOrdencompras(ordencompra);
    }

    public void ListarOrdencompras(TOrdencompra ordencompra) {
        log.debug("Estoy en el Metodo VOID ManagedBeans ListarOrdencompras");
		ordencompra.setBt_habilitado(true);
		listaOrdencompra = businessOrdencompra.listarOrdencompra(ordencompra);
    }

    public String ListarOrdencompras() {
        log.debug("Estoy en el Metodo ManagedBeans ListarOrdencompras Page");
		ordencompra = new TOrdencompra();
		this.ListarOrdencompras(ordencompra);
		return "/paginas/ordencompra/searchOrdencompra";
    }

    public void cargarDatosMaestros() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatosMaestros");
		ordencompra=new TOrdencompra();
    }

    public void cargarDatos() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos SIN Parametros");
    }

    public void cargarDatos(Integer in_idordcompra) {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos con Parametros");
		
			ordencompra = new TOrdencompra();
			ordencompra.setIn_idordcompra(in_idordcompra);
			ordencompra = businessOrdencompra.obtenerOrdencompra(ordencompra);
    }

    public void guardarRegistroOrdencompra() {
        log.debug("Estoy en el Metodo ManagedBeans guardarRegistroOrdencompra");
		businessOrdencompra.insertarOrdencompra(ordencompra);
		ListarOrdencompras(new TOrdencompra());
    }

    public void actualizarRegistroOrdencompra() {
        log.debug("Estoy en el Metodo ManagedBeans actualizarRegistroOrdencompra");
		businessOrdencompra.actualizarOrdencompra(ordencompra);
		ListarOrdencompras(new TOrdencompra());
    }

    public void eliminarRegistroOrdencompra() {
        log.debug("Estoy en el Metodo ManagedBeans eliminarRegistroOrdencompra");
		businessOrdencompra.eliminarOrdencompra(ordencompra);
		ListarOrdencompras(new TOrdencompra());
    }

    public void onRowSelect(SelectEvent event) {
        log.debug("Estoy en el Metodo ManagedBeans onRowSelect");
		ordencompra = (TOrdencompra) event.getObject();
		Integer in_idordcompra = ordencompra.getIn_idordcompra();
		ordencompra = new TOrdencompra();
		ordencompra.setIn_idordcompra(in_idordcompra);
		ordencompra = businessOrdencompra.obtenerOrdencompra(ordencompra);
    }

    public TOrdencompra getOrdencompra() {
        return ordencompra;
    }

    public void setOrdencompra(TOrdencompra ordencompra) {
        this.ordencompra = ordencompra;
    }

    public List<TOrdencompra> getListaOrdencompra() {
        return listaOrdencompra;
    }

    public void setListaOrdencompra(List<TOrdencompra> listaOrdencompra) {
        this.listaOrdencompra = listaOrdencompra;
    }
}