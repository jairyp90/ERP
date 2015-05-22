package com.rtm.compras.managedBean;

import com.rtm.compras.bean.TListado;
import com.rtm.compras.bean.TSolicitud;
import com.rtm.compras.business.BusinessListado;
import com.rtm.compras.business.BusinessListadoImpl;
import com.rtm.compras.business.BusinessSolicitud;
import com.rtm.compras.business.BusinessSolicitudImpl;
import com.rtm.compras.utils.Constantes;
import com.rtm.compras.utils.utilsall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;



import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

@ManagedBean(name="solicitudBean")
@SessionScoped
public class SolicitudBean{
    static final Logger log = Logger.getLogger(SolicitudBean.class);

    private BusinessSolicitud businessSolicitud = new BusinessSolicitudImpl();

    private TSolicitud solicitud;
    private TListado listado;
    private List<TSolicitud> listaSolicitud;
    //hashsmaps
    
    public List<TListado> listaLocales;
	public Map<String, Integer>hlocales = new HashMap<String, Integer>();
	
	public List<TListado> listaAreas;
	public Map<String, Integer> hareas = new HashMap<String, Integer>();
	
	public List<TListado> listaCargos;
	public Map<String, Integer> hcargos = new HashMap<String, Integer>();
    
	//Bussines
	
	public BusinessListado businessListado = new BusinessListadoImpl();
	
    

    public SolicitudBean() {
        solicitud = new TSolicitud();
		ListarSolicitudes(solicitud);
		
    }

    public void CargarhLocales(){
    	log.debug("entro a getHorganizaciones");
    	listado= new TListado();
    	listado.setVc_codlistado(Constantes.codigoComboLocal);
    	listaLocales = businessListado.listarListado(listado);
		log.debug("tamaño: " + listaLocales.size());
		for (int i = 0; i <listaLocales.size(); i++) {
			TListado aux_listado = (TListado) listaLocales.get(i);
			hlocales.put(aux_listado.getVc_deslistado(), aux_listado.getIn_idlistado());	
		}
		log.debug("fin del getHorganizaciones");
    }
    public void ObtenerDesLocales(Integer id){
 		log.debug("Id Locales" + id);
 		for (Entry<String, Integer> locales: hlocales.entrySet()) {
			if(id.intValue() == locales.getValue().intValue()){
				solicitud.setVc_deslocsolicitud(locales.getKey());
			}
		}
	}
    
    public void CargarhAreas(){
    	log.debug("entro a getHAreas");
    	listado= new TListado();
    	listado.setVc_codlistado(Constantes.codigoComboArea);
    	listaAreas = businessListado.listarListado(listado);
		log.debug("tamaño: " + listaAreas.size());
		for (int i = 0; i <listaAreas.size(); i++) {
			TListado aux_listado = (TListado) listaAreas.get(i);
			hareas.put(aux_listado.getVc_deslistado(), aux_listado.getIn_idlistado());	
		}
		log.debug("fin del getHAreas");
    }
    public void ObtenerDesAreas(Integer id){
 		log.debug("Id Locales" + id);
 		for (Entry<String, Integer> areas: hareas.entrySet()) {
			if(id.intValue() == areas.getValue().intValue()){
				solicitud.getObjpersona().setVc_cargopersona(areas.getKey());
			}
		}
	}
    
    public void CargarhCargo(){
    	log.debug("entro a getHcargos");
    	listado= new TListado();
    	listado.setVc_codlistado(Constantes.codigoComboCargo);
    	listaCargos = businessListado.listarListado(listado);
		log.debug("tamaño: " + listaCargos.size());
		for (int i = 0; i <listaCargos.size(); i++) {
			TListado aux_listado = (TListado) listaCargos.get(i);
			hcargos.put(aux_listado.getVc_deslistado(), aux_listado.getIn_idlistado());	
		}
		log.debug("fin del getHcargos");
    }
    public void ObtenerDesCargos(Integer id){
 		log.debug("Id Locales" + id);
 		for (Entry<String, Integer> areas: hcargos.entrySet()) {
			if(id.intValue() == areas.getValue().intValue()){
				solicitud.getObjpersona().setVc_cargopersona(areas.getKey());
			}
		}
	}
    
    public void ListarSolicitudes(TSolicitud solicitud) {
        log.debug("Estoy en el Metodo VOID ManagedBeans ListarSolicitudes");
		solicitud.setBt_habilitado(true);
		listaSolicitud = businessSolicitud.listarSolicitud(solicitud);
    }

    public String ListarSolicitudes() {
        log.debug("Estoy en el Metodo ManagedBeans ListarSolicitudes Page");
		solicitud = new TSolicitud();
		this.ListarSolicitudes(solicitud);
		return "/paginas/solicitud/searchSolicitud";
    }

    public void cargarDatosMaestros() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatosMaestros del boton Nueva Solicitud");
		solicitud=new TSolicitud();
		CargarhLocales();
		CargarhAreas();
		CargarhCargo();
		
    }

    public void cargarDatos() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos SIN Parametros");
    }

    public void cargarDatos(Integer in_idsolicitud) {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos con Parametros");
		
			solicitud = new TSolicitud();
			solicitud.setIn_idsolicitud(in_idsolicitud);
			solicitud = businessSolicitud.obtenerSolicitud(solicitud);
    }

    public void guardarRegistroSolicitud() {
        log.debug("Estoy en el Metodo ManagedBeans guardarRegistroSolicitud");
		businessSolicitud.insertarSolicitud(solicitud);
		ListarSolicitudes(new TSolicitud());
    }

    public void actualizarRegistroSolicitud() {
        log.debug("Estoy en el Metodo ManagedBeans actualizarRegistroSolicitud");
		businessSolicitud.actualizarSolicitud(solicitud);
		ListarSolicitudes(new TSolicitud());
    }

    public void eliminarRegistroSolicitud() {
        log.debug("Estoy en el Metodo ManagedBeans eliminarRegistroSolicitud");
		businessSolicitud.eliminarSolicitud(solicitud);
		ListarSolicitudes(new TSolicitud());
    }

    public void onRowSelect(SelectEvent event) {
        log.debug("Estoy en el Metodo ManagedBeans onRowSelect");
		solicitud = (TSolicitud) event.getObject();
		Integer in_idsolicitud = solicitud.getIn_idsolicitud();
		solicitud = new TSolicitud();
		solicitud.setIn_idsolicitud(in_idsolicitud);
		solicitud = businessSolicitud.obtenerSolicitud(solicitud);
    }

    public TSolicitud getSolicitud() {
        return solicitud;
    }

    public void setSolicitud(TSolicitud solicitud) {
        this.solicitud = solicitud;
    }

    public List<TSolicitud> getListaSolicitud() {
        return listaSolicitud;
    }

    public void setListaSolicitud(List<TSolicitud> listaSolicitud) {
        this.listaSolicitud = listaSolicitud;
    }
 
    public Map<String, Integer> getHlocales() {
			return hlocales;
	}

    public void setHlocales(Map<String, Integer> hlocales) {
			this.hlocales = hlocales;
	}

	public List<TListado> getListaLocales() {
			return listaLocales;
	}

	public void setListaLocales(List<TListado> listaLocales) {
			this.listaLocales = listaLocales;
	}

	public List<TListado> getListaAreas() {
		return listaAreas;
	}

	public void setListaAreas(List<TListado> listaAreas) {
		this.listaAreas = listaAreas;
	}

	public Map<String, Integer> getHareas() {
		return hareas;
	}

	public void setHareas(Map<String, Integer> hareas) {
		this.hareas = hareas;
	}

	public List<TListado> getListaCargos() {
		return listaCargos;
	}

	public void setListaCargos(List<TListado> listaCargos) {
		this.listaCargos = listaCargos;
	}

	public Map<String, Integer> getHcargos() {
		return hcargos;
	}

	public void setHcargos(Map<String, Integer> hcargos) {
		this.hcargos = hcargos;
	}
	
    
}