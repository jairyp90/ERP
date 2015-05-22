package com.rtm.compras.business;

import com.rtm.compras.bean.TSolicitud;
import com.rtm.compras.business.BusinessSolicitud;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

public class BusinessSolicitudImpl extends GetServices implements BusinessSolicitud {
    static final Logger log = Logger.getLogger(BusinessSolicitudImpl.class);

    @Override
    public List<TSolicitud> listarSolicitud(TSolicitud solicitud) {
        log.debug("Estoy en el Metodo Business listarSolicitud");
		if (solicitud != null)
			 return getSolicitudService().ObtenerRegistros(solicitud);
		 return null;

    }

    @Override
    public TSolicitud obtenerSolicitud(TSolicitud solicitud) {
        log.debug("Estoy en el Metodo Business obtenerSolicitud");
		if (solicitud != null)
			 return getSolicitudService().ObtenerUnRegistro(solicitud);
		 return null;

    }

    @Override
    public int insertarSolicitud(TSolicitud solicitud) {
        log.debug("Estoy en el Metodo Business insertarSolicitud");
		if (solicitud != null){
			 solicitud.setDt_fecingresa(new Date());
			return getSolicitudService().insertSelective(solicitud);
		 }
		return -1;
    }

    @Override
    public int actualizarSolicitud(TSolicitud solicitud) {
        log.debug("Estoy en el Metodo Business actualizarSolicitud");
		if (solicitud != null){
			 solicitud.setDt_fecmodifica(new Date());
			return getSolicitudService().updateByPrimaryKeySelective(solicitud);
		 }
		return -1;
    }

    @Override
    public int eliminarSolicitud(TSolicitud solicitud) {
        log.debug("Estoy en el Metodo Business eliminarSolicitud");
		if (solicitud != null){
			 solicitud.setBt_habilitado(false);
			 solicitud.setDt_fecmodifica(new Date());
			return getSolicitudService().updateByPrimaryKeySelective(solicitud);
		 }
		return -1;
    }
}