package com.rtm.compras.webservices;

import com.rtm.compras.bean.TDetalleordencompra;
import com.rtm.compras.business.BusinessDetalleordencompra;
import com.rtm.compras.business.BusinessDetalleordencompraImpl;
import java.util.List;
import org.apache.log4j.Logger;

public class DetalleordencompraWS {
    static final Logger log = Logger.getLogger(DetalleordencompraWS.class);

    private BusinessDetalleordencompra businessDetalleordencompra = new BusinessDetalleordencompraImpl();

    public TDetalleordencompra ObtenerUnRegistroWS(TDetalleordencompra detalleordencompra) {
        log.debug("Estoy en el Metodo WebService ObtenerUnRegistroWS");
		return businessDetalleordencompra.obtenerDetalleordencompra(detalleordencompra);
    }

    public List<TDetalleordencompra> ObtenerRegistrosWS(TDetalleordencompra detalleordencompra) {
        log.debug("Estoy en el Metodo WebService ObtenerRegistrosWS");
		return businessDetalleordencompra.listarDetalleordencompra(detalleordencompra);
    }

    public int insertWS(TDetalleordencompra detalleordencompra) {
        log.debug("Estoy en el Metodo WebService insertWS");
		 return businessDetalleordencompra.insertarDetalleordencompra(detalleordencompra);
    }

    public int updateByPrimaryKeyWS(TDetalleordencompra detalleordencompra) {
        log.debug("Estoy en el Metodo WebService updateByPrimaryKeyWS");
		 return businessDetalleordencompra.actualizarDetalleordencompra(detalleordencompra);
    }

    public int deleteByPrimaryKeyWS(TDetalleordencompra detalleordencompra) {
        log.debug("Estoy en el Metodo WebService deleteByPrimaryKeyWS");
		return businessDetalleordencompra.eliminarDetalleordencompra(detalleordencompra);
    }
}