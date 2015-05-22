package com.rtm.compras.managedBean;


import com.rtm.compras.bean.TListado;
import com.rtm.compras.bean.TPersona;

import com.rtm.compras.business.BusinessPersona;
import com.rtm.compras.business.BusinessPersonaImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

@ManagedBean(name="personaBean")
@SessionScoped
public class PersonaBean {
    static final Logger log = Logger.getLogger(PersonaBean.class);

    private BusinessPersona businessPersona = new BusinessPersonaImpl();

    private TPersona persona;

    private List<TPersona> listaPersona;
    
    

    public PersonaBean() {
        persona = new TPersona();
		ListarPersonas(persona);
    }
    
   
    
    

    public void ListarPersonas(TPersona persona) {
        log.debug("Estoy en el Metodo VOID ManagedBeans ListarPersonas");
		persona.setBt_habilitado(true);
		listaPersona = businessPersona.listarPersona(persona);
    }

    public String ListarPersonas() {
        log.debug("Estoy en el Metodo ManagedBeans ListarPersonas Page");
		persona = new TPersona();
		this.ListarPersonas(persona);
		return "/paginas/persona/searchPersona";
    }

    public void cargarDatosMaestros() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatosMaestros");
		persona=new TPersona();
    }

    public void cargarDatos() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos SIN Parametros");
    }

    public void cargarDatos(Integer in_idpersona) {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos con Parametros");
		
			persona = new TPersona();
			persona.setIn_idpersona(in_idpersona);
			persona = businessPersona.obtenerPersona(persona);
    }

    public void guardarRegistroPersona() {
        log.debug("Estoy en el Metodo ManagedBeans guardarRegistroPersona");
		businessPersona.insertarPersona(persona);
		ListarPersonas(new TPersona());
    }

    public void actualizarRegistroPersona() {
        log.debug("Estoy en el Metodo ManagedBeans actualizarRegistroPersona");
		businessPersona.actualizarPersona(persona);
		ListarPersonas(new TPersona());
    }

    public void eliminarRegistroPersona() {
        log.debug("Estoy en el Metodo ManagedBeans eliminarRegistroPersona");
		businessPersona.eliminarPersona(persona);
		ListarPersonas(new TPersona());
    }

    public void onRowSelect(SelectEvent event) {
        log.debug("Estoy en el Metodo ManagedBeans onRowSelect");
		persona = (TPersona) event.getObject();
		Integer in_idpersona = persona.getIn_idpersona();
		persona = new TPersona();
		persona.setIn_idpersona(in_idpersona);
		persona = businessPersona.obtenerPersona(persona);
    }

    public TPersona getPersona() {
        return persona;
    }

    public void setPersona(TPersona persona) {
        this.persona = persona;
    }

    public List<TPersona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(List<TPersona> listaPersona) {
        this.listaPersona = listaPersona;
    }

	
}