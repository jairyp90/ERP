package com.rtm.compras.business;

import com.rtm.compras.bean.TPersona;
import com.rtm.compras.business.BusinessPersona;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

public class BusinessPersonaImpl extends GetServices implements BusinessPersona {
    static final Logger log = Logger.getLogger(BusinessPersonaImpl.class);

    @Override
    public List<TPersona> listarPersona(TPersona persona) {
        log.debug("Estoy en el Metodo Business listarPersona");
		if (persona != null)
			 return getPersonaService().ObtenerRegistros(persona);
		 return null;

    }

    @Override
    public TPersona obtenerPersona(TPersona persona) {
        log.debug("Estoy en el Metodo Business obtenerPersona");
		if (persona != null)
			 return getPersonaService().ObtenerUnRegistro(persona);
		 return null;

    }

    @Override
    public int insertarPersona(TPersona persona) {
        log.debug("Estoy en el Metodo Business insertarPersona");
		if (persona != null){
			 persona.setDt_fecingresa(new Date());
			return getPersonaService().insertSelective(persona);
		 }
		return -1;
    }

    @Override
    public int actualizarPersona(TPersona persona) {
        log.debug("Estoy en el Metodo Business actualizarPersona");
		if (persona != null){
			 persona.setDt_fecmodifica(new Date());
			return getPersonaService().updateByPrimaryKeySelective(persona);
		 }
		return -1;
    }

    @Override
    public int eliminarPersona(TPersona persona) {
        log.debug("Estoy en el Metodo Business eliminarPersona");
		if (persona != null){
			 persona.setBt_habilitado(false);
			 persona.setDt_fecmodifica(new Date());
			return getPersonaService().updateByPrimaryKeySelective(persona);
		 }
		return -1;
    }
}