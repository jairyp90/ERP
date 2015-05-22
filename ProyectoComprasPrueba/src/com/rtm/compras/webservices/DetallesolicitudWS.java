package com.rtm.compras.webservices;

import com.rtm.compras.bean.TDetallesolicitud;
import com.rtm.compras.business.BusinessDetallesolicitud;
import com.rtm.compras.business.BusinessDetallesolicitudImpl;
import java.util.List;
import org.apache.log4j.Logger;

public class DetallesolicitudWS {
    static final Logger log = Logger.getLogger(DetallesolicitudWS.class);

    private BusinessDetallesolicitud businessDetallesolicitud = new BusinessDetallesolicitudImpl();

    public TDetallesolicitud ObtenerUnRegistroWS(TDetallesolicitud detallesolicitud) {
        log.debug("Estoy en el Metodo WebService ObtenerUnRegistroWS");
		return businessDetallesolicitud.obtenerDetallesolicitud(detallesolicitud);
    }

    public List<TDetallesolicitud> ObtenerRegistrosWS(TDetallesolicitud detallesolicitud) {
        log.debug("Estoy en el Metodo WebService ObtenerRegistrosWS");
		return businessDetallesolicitud.listarDetallesolicitud(detallesolicitud);
    }

    public int insertWS(TDetallesolicitud detallesolicitud) {
        log.debug("Estoy en el Metodo WebService insertWS");
		 return businessDetallesolicitud.insertarDetallesolicitud(detallesolicitud);
    }

    public int updateByPrimaryKeyWS(TDetallesolicitud detallesolicitud) {
        log.debug("Estoy en el Metodo WebService updateByPrimaryKeyWS");
		 return businessDetallesolicitud.actualizarDetallesolicitud(detallesolicitud);
    }

    public int deleteByPrimaryKeyWS(TDetallesolicitud detallesolicitud) {
        log.debug("Estoy en el Metodo WebService deleteByPrimaryKeyWS");
		return businessDetallesolicitud.eliminarDetallesolicitud(detallesolicitud);
    }
}