package com.rtm.compras.webservices;

import com.rtm.compras.bean.TArticulo;
import com.rtm.compras.business.BusinessArticulo;
import com.rtm.compras.business.BusinessArticuloImpl;
import java.util.List;
import org.apache.log4j.Logger;

public class ArticuloWS {
    static final Logger log = Logger.getLogger(ArticuloWS.class);

    private BusinessArticulo businessArticulo = new BusinessArticuloImpl();

    public TArticulo ObtenerUnRegistroWS(TArticulo articulo) {
        log.debug("Estoy en el Metodo WebService ObtenerUnRegistroWS");
		return businessArticulo.obtenerArticulo(articulo);
    }

    public List<TArticulo> ObtenerRegistrosWS(TArticulo articulo) {
        log.debug("Estoy en el Metodo WebService ObtenerRegistrosWS");
		return businessArticulo.listarArticulo(articulo);
    }

    public int insertWS(TArticulo articulo) {
        log.debug("Estoy en el Metodo WebService insertWS");
		 return businessArticulo.insertarArticulo(articulo);
    }

    public int updateByPrimaryKeyWS(TArticulo articulo) {
        log.debug("Estoy en el Metodo WebService updateByPrimaryKeyWS");
		 return businessArticulo.actualizarArticulo(articulo);
    }

    public int deleteByPrimaryKeyWS(TArticulo articulo) {
        log.debug("Estoy en el Metodo WebService deleteByPrimaryKeyWS");
		return businessArticulo.eliminarArticulo(articulo);
    }
}