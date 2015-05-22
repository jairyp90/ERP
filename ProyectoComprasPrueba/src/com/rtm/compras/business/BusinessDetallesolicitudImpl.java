package com.rtm.compras.business;

import com.rtm.compras.bean.TDetallesolicitud;
import com.rtm.compras.business.BusinessDetallesolicitud;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

public class BusinessDetallesolicitudImpl extends GetServices implements BusinessDetallesolicitud {
    static final Logger log = Logger.getLogger(BusinessDetallesolicitudImpl.class);

    @Override
    public List<TDetallesolicitud> listarDetallesolicitud(TDetallesolicitud detallesolicitud) {
        log.debug("Estoy en el Metodo Business listarDetallesolicitud");
		if (detallesolicitud != null)
			 return getDetallesolicitudService().ObtenerRegistros(detallesolicitud);
		 return null;

    }

    @Override
    public TDetallesolicitud obtenerDetallesolicitud(TDetallesolicitud detallesolicitud) {
        log.debug("Estoy en el Metodo Business obtenerDetallesolicitud");
		if (detallesolicitud != null)
			 return getDetallesolicitudService().ObtenerUnRegistro(detallesolicitud);
		 return null;

    }

    @Override
    public int insertarDetallesolicitud(TDetallesolicitud detallesolicitud) {
        log.debug("Estoy en el Metodo Business insertarDetallesolicitud");
		if (detallesolicitud != null){
			 detallesolicitud.setDt_fecingresa(new Date());
			return getDetallesolicitudService().insertSelective(detallesolicitud);
		 }
		return -1;
    }

    @Override
    public int actualizarDetallesolicitud(TDetallesolicitud detallesolicitud) {
        log.debug("Estoy en el Metodo Business actualizarDetallesolicitud");
		if (detallesolicitud != null){
			 detallesolicitud.setDt_fecmodifica(new Date());
			return getDetallesolicitudService().updateByPrimaryKeySelective(detallesolicitud);
		 }
		return -1;
    }

    @Override
    public int eliminarDetallesolicitud(TDetallesolicitud detallesolicitud) {
        log.debug("Estoy en el Metodo Business eliminarDetallesolicitud");
		if (detallesolicitud != null){
			 detallesolicitud.setBt_habilitado(false);
			 detallesolicitud.setDt_fecmodifica(new Date());
			return getDetallesolicitudService().updateByPrimaryKeySelective(detallesolicitud);
		 }
		return -1;
    }
}