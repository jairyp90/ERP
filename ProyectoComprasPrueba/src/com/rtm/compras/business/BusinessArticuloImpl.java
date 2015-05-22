package com.rtm.compras.business;

import com.rtm.compras.bean.TArticulo;
import com.rtm.compras.business.BusinessArticulo;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

public class BusinessArticuloImpl extends GetServices implements BusinessArticulo {
    static final Logger log = Logger.getLogger(BusinessArticuloImpl.class);

    @Override
    public List<TArticulo> listarArticulo(TArticulo articulo) {
        log.debug("Estoy en el Metodo Business listarArticulo");
		if (articulo != null)
			 return getArticuloService().ObtenerRegistros(articulo);
		 return null;

    }

    public List<TArticulo> listarArticuloLike(TArticulo articulo) {
        log.debug("Estoy en el Metodo Business listarArticulo");
		if (articulo != null)
			 return getArticuloService().ObtenerRegistrosLike(articulo);
		 return null;

    }
    
    @Override
    public TArticulo obtenerArticulo(TArticulo articulo) {
        log.debug("Estoy en el Metodo Business obtenerArticulo");
		if (articulo != null)
			 return getArticuloService().ObtenerUnRegistro(articulo);
		 return null;

    }

    @Override
    public int insertarArticulo(TArticulo articulo) {
        log.debug("Estoy en el Metodo Business insertarArticulo");
		if (articulo != null){
			 articulo.setDt_fecingresa(new Date());
			return getArticuloService().insertSelective(articulo);
		 }
		return -1;
    }

    @Override
    public int actualizarArticulo(TArticulo articulo) {
        log.debug("Estoy en el Metodo Business actualizarArticulo");
		if (articulo != null){
			 articulo.setDt_fecmodifica(new Date());
			return getArticuloService().updateByPrimaryKeySelective(articulo);
		 }
		return -1;
    }

    @Override
    public int eliminarArticulo(TArticulo articulo) {
        log.debug("Estoy en el Metodo Business eliminarArticulo");
		if (articulo != null){
			 articulo.setBt_habilitado(false);
			 articulo.setDt_fecmodifica(new Date());
			return getArticuloService().updateByPrimaryKeySelective(articulo);
		 }
		return -1;
    }
}