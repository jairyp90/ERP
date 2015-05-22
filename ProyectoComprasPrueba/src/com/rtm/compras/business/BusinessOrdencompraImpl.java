package com.rtm.compras.business;

import com.rtm.compras.bean.TOrdencompra;
import com.rtm.compras.business.BusinessOrdencompra;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

public class BusinessOrdencompraImpl extends GetServices implements BusinessOrdencompra {
    static final Logger log = Logger.getLogger(BusinessOrdencompraImpl.class);

    @Override
    public List<TOrdencompra> listarOrdencompra(TOrdencompra ordencompra) {
        log.debug("Estoy en el Metodo Business listarOrdencompra");
		if (ordencompra != null)
			 return getOrdencompraService().ObtenerRegistros(ordencompra);
		 return null;

    }

    @Override
    public TOrdencompra obtenerOrdencompra(TOrdencompra ordencompra) {
        log.debug("Estoy en el Metodo Business obtenerOrdencompra");
		if (ordencompra != null)
			 return getOrdencompraService().ObtenerUnRegistro(ordencompra);
		 return null;

    }

    @Override
    public int insertarOrdencompra(TOrdencompra ordencompra) {
        log.debug("Estoy en el Metodo Business insertarOrdencompra");
		if (ordencompra != null){
			 ordencompra.setDt_fecingresa(new Date());
			return getOrdencompraService().insertSelective(ordencompra);
		 }
		return -1;
    }

    @Override
    public int actualizarOrdencompra(TOrdencompra ordencompra) {
        log.debug("Estoy en el Metodo Business actualizarOrdencompra");
		if (ordencompra != null){
			 ordencompra.setDt_fecmodifica(new Date());
			return getOrdencompraService().updateByPrimaryKeySelective(ordencompra);
		 }
		return -1;
    }

    @Override
    public int eliminarOrdencompra(TOrdencompra ordencompra) {
        log.debug("Estoy en el Metodo Business eliminarOrdencompra");
		if (ordencompra != null){
			 ordencompra.setBt_habilitado(false);
			 ordencompra.setDt_fecmodifica(new Date());
			return getOrdencompraService().updateByPrimaryKeySelective(ordencompra);
		 }
		return -1;
    }
}