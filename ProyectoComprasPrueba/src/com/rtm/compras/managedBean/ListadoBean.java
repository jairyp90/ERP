package com.rtm.compras.managedBean;

import com.rtm.compras.bean.TListado;
import com.rtm.compras.business.BusinessListado;
import com.rtm.compras.business.BusinessListadoImpl;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

@ManagedBean(name="listadoBean")
@SessionScoped
public class ListadoBean {
    static final Logger log = Logger.getLogger(ListadoBean.class);

    private BusinessListado businessListado = new BusinessListadoImpl();

    private TListado listado;

    private List<TListado> listaListado;

    public ListadoBean() {
        listado = new TListado();
		ListarListados(listado);
    }

    public void ListarListados(TListado listado) {
        log.debug("Estoy en el Metodo VOID ManagedBeans ListarListados");
		listado.setBt_habilitado(true);
		listaListado = businessListado.listarListado(listado);
    }

    public String ListarListados() {
        log.debug("Estoy en el Metodo ManagedBeans ListarListados Page");
		listado = new TListado();
		this.ListarListados(listado);
		return "/paginas/listado/searchListado";
    }

    public void cargarDatosMaestros() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatosMaestros");
		listado=new TListado();
    }

    public void cargarDatos() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos SIN Parametros");
    }

    public void cargarDatos(Integer in_idlistado) {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos con Parametros");
		
			listado = businessListado.obtenerListado(listado);
    }

    public void guardarRegistroListado() {
        log.debug("Estoy en el Metodo ManagedBeans guardarRegistroListado");
		businessListado.insertarListado(listado);
		ListarListados(new TListado());
    }
/*
    public void actualizarRegistroListado() {
        log.debug("Estoy en el Metodo ManagedBeans actualizarRegistroListado");
		businessListado.actualizarListado(listado);
		ListarListados(new TListado());
    }

    public void eliminarRegistroListado() {
        log.debug("Estoy en el Metodo ManagedBeans eliminarRegistroListado");
		businessListado.eliminarListado(listado);
		ListarListados(new TListado());
    }*/

    public void onRowSelect(SelectEvent event) {
        log.debug("Estoy en el Metodo ManagedBeans onRowSelect");
		listado = (TListado) event.getObject();
		listado = businessListado.obtenerListado(listado);
    }

    public TListado getListado() {
        return listado;
    }

    public void setListado(TListado listado) {
        this.listado = listado;
    }

    public List<TListado> getListaListado() {
        return listaListado;
    }

    public void setListaListado(List<TListado> listaListado) {
        this.listaListado = listaListado;
    }
}