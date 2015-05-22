package com.rtm.compras.business;

import com.rtm.compras.bean.TListado;
import com.rtm.compras.business.BusinessListado;

import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;

public class BusinessListadoImpl extends GetServices implements BusinessListado {
    static final Logger log = Logger.getLogger(BusinessListadoImpl.class);

    @Override
    public List<TListado> listarListado(TListado listado) {
        log.debug("Estoy en el Metodo Business listarListado");
		if (listado != null)
			 return getListadoService().ObtenerRegistros(listado);
		 return null;

    }

    @Override
    public TListado obtenerListado(TListado listado) {
        log.debug("Estoy en el Metodo Business obtenerListado");
		if (listado != null)
			 return getListadoService().ObtenerUnRegistro(listado);
		 return null;

    }

    @Override
    public int insertarListado(TListado listado) {
        log.debug("Estoy en el Metodo Business insertarListado");
		if (listado != null){
			 listado.setDt_fecingresa(new Date());
			return getListadoService().insertSelective(listado);
		 }
		return -1;
    }

	@Override
	public TListado buscar(TListado catalogo) {
		if(catalogo !=null){
			
			return getListadoService().buscar(catalogo);
		}
		return null;
	}

	

  /*  @Override
    public int actualizarListado(TListado listado) {
        log.debug("Estoy en el Metodo Business actualizarListado");
		if (listado != null){
			 listado.setDt_fecmodifica(new Date());
			return getListadoService().updateByPrimaryKeySelective(listado);
		 }
		return -1;
    }

    @Override
    public int eliminarListado(TListado listado) {
        log.debug("Estoy en el Metodo Business eliminarListado");
		if (listado != null){
			 listado.setBt_habilitado(false);
			 listado.setDt_fecmodifica(new Date());
			return getListadoService().updateByPrimaryKeySelective(listado);
		 }
		return -1;
    }*/
}