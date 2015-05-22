package com.rtm.compras.webservices;

import com.rtm.compras.bean.TOrdencompra;
import com.rtm.compras.business.BusinessOrdencompra;
import com.rtm.compras.business.BusinessOrdencompraImpl;
import java.util.List;
import org.apache.log4j.Logger;

public class OrdencompraWS {
    static final Logger log = Logger.getLogger(OrdencompraWS.class);

    private BusinessOrdencompra businessOrdencompra = new BusinessOrdencompraImpl();

    public TOrdencompra ObtenerUnRegistroWS(TOrdencompra ordencompra) {
        log.debug("Estoy en el Metodo WebService ObtenerUnRegistroWS");
		return businessOrdencompra.obtenerOrdencompra(ordencompra);
    }

    public List<TOrdencompra> ObtenerRegistrosWS(TOrdencompra ordencompra) {
        log.debug("Estoy en el Metodo WebService ObtenerRegistrosWS");
		return businessOrdencompra.listarOrdencompra(ordencompra);
    }

    public int insertWS(TOrdencompra ordencompra) {
        log.debug("Estoy en el Metodo WebService insertWS");
		 return businessOrdencompra.insertarOrdencompra(ordencompra);
    }

    public int updateByPrimaryKeyWS(TOrdencompra ordencompra) {
        log.debug("Estoy en el Metodo WebService updateByPrimaryKeyWS");
		 return businessOrdencompra.actualizarOrdencompra(ordencompra);
    }

    public int deleteByPrimaryKeyWS(TOrdencompra ordencompra) {
        log.debug("Estoy en el Metodo WebService deleteByPrimaryKeyWS");
		return businessOrdencompra.eliminarOrdencompra(ordencompra);
    }
}