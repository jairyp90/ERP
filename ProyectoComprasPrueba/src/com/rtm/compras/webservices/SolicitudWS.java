package com.rtm.compras.webservices;

import com.rtm.compras.bean.TSolicitud;
import com.rtm.compras.business.BusinessSolicitud;
import com.rtm.compras.business.BusinessSolicitudImpl;
import java.util.List;
import org.apache.log4j.Logger;

public class SolicitudWS {
    static final Logger log = Logger.getLogger(SolicitudWS.class);

    private BusinessSolicitud businessSolicitud = new BusinessSolicitudImpl();

    public TSolicitud ObtenerUnRegistroWS(TSolicitud solicitud) {
        log.debug("Estoy en el Metodo WebService ObtenerUnRegistroWS");
		return businessSolicitud.obtenerSolicitud(solicitud);
    }

    public List<TSolicitud> ObtenerRegistrosWS(TSolicitud solicitud) {
        log.debug("Estoy en el Metodo WebService ObtenerRegistrosWS");
		return businessSolicitud.listarSolicitud(solicitud);
    }

    public int insertWS(TSolicitud solicitud) {
        log.debug("Estoy en el Metodo WebService insertWS");
		 return businessSolicitud.insertarSolicitud(solicitud);
    }

    public int updateByPrimaryKeyWS(TSolicitud solicitud) {
        log.debug("Estoy en el Metodo WebService updateByPrimaryKeyWS");
		 return businessSolicitud.actualizarSolicitud(solicitud);
    }

    public int deleteByPrimaryKeyWS(TSolicitud solicitud) {
        log.debug("Estoy en el Metodo WebService deleteByPrimaryKeyWS");
		return businessSolicitud.eliminarSolicitud(solicitud);
    }
}