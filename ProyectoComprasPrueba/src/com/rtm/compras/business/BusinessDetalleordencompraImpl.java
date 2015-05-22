package com.rtm.compras.business;

import com.rtm.compras.bean.TDetalleordencompra;
import com.rtm.compras.business.BusinessDetalleordencompra;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

public class BusinessDetalleordencompraImpl extends GetServices implements BusinessDetalleordencompra {
    static final Logger log = Logger.getLogger(BusinessDetalleordencompraImpl.class);

    @Override
    public List<TDetalleordencompra> listarDetalleordencompra(TDetalleordencompra detalleordencompra) {
        log.debug("Estoy en el Metodo Business listarDetalleordencompra");
		if (detalleordencompra != null)
			 return getDetalleordenService().ObtenerRegistros(detalleordencompra);
		 return null;

    }

    @Override
    public TDetalleordencompra obtenerDetalleordencompra(TDetalleordencompra detalleordencompra) {
        log.debug("Estoy en el Metodo Business obtenerDetalleordencompra");
		if (detalleordencompra != null)
			 return getDetalleordenService().ObtenerUnRegistro(detalleordencompra);
		 return null;

    }

    @Override
    public int insertarDetalleordencompra(TDetalleordencompra detalleordencompra) {
        log.debug("Estoy en el Metodo Business insertarDetalleordencompra");
		if (detalleordencompra != null){
			 detalleordencompra.setDt_fecingresa(new Date());
			return getDetalleordenService().insertSelective(detalleordencompra);
		 }
		return -1;
    }

    @Override
    public int actualizarDetalleordencompra(TDetalleordencompra detalleordencompra) {
        log.debug("Estoy en el Metodo Business actualizarDetalleordencompra");
		if (detalleordencompra != null){
			 detalleordencompra.setDt_fecmodifica(new Date());
			return getDetalleordenService().updateByPrimaryKeySelective(detalleordencompra);
		 }
		return -1;
    }

    @Override
    public int eliminarDetalleordencompra(TDetalleordencompra detalleordencompra) {
        log.debug("Estoy en el Metodo Business eliminarDetalleordencompra");
		if (detalleordencompra != null){
			 detalleordencompra.setBt_habilitado(false);
			 detalleordencompra.setDt_fecmodifica(new Date());
			return getDetalleordenService().updateByPrimaryKeySelective(detalleordencompra);
		 }
		return -1;
    }
}