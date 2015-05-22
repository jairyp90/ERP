package com.rtm.compras.webservices;

import com.rtm.compras.bean.TPersona;
import com.rtm.compras.business.BusinessPersona;
import com.rtm.compras.business.BusinessPersonaImpl;
import java.util.List;
import org.apache.log4j.Logger;

public class PersonaWS {
    static final Logger log = Logger.getLogger(PersonaWS.class);

    private BusinessPersona businessPersona = new BusinessPersonaImpl();

    public TPersona ObtenerUnRegistroWS(TPersona persona) {
        log.debug("Estoy en el Metodo WebService ObtenerUnRegistroWS");
		return businessPersona.obtenerPersona(persona);
    }

    public List<TPersona> ObtenerRegistrosWS(TPersona persona) {
        log.debug("Estoy en el Metodo WebService ObtenerRegistrosWS");
		return businessPersona.listarPersona(persona);
    }

    public int insertWS(TPersona persona) {
        log.debug("Estoy en el Metodo WebService insertWS");
		 return businessPersona.insertarPersona(persona);
    }

    public int updateByPrimaryKeyWS(TPersona persona) {
        log.debug("Estoy en el Metodo WebService updateByPrimaryKeyWS");
		 return businessPersona.actualizarPersona(persona);
    }

    public int deleteByPrimaryKeyWS(TPersona persona) {
        log.debug("Estoy en el Metodo WebService deleteByPrimaryKeyWS");
		return businessPersona.eliminarPersona(persona);
    }
}