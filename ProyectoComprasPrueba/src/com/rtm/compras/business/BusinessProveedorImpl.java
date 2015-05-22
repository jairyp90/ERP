package com.rtm.compras.business;

import com.rtm.compras.bean.TProveedor;
import com.rtm.compras.business.BusinessProveedor;
import java.util.Date;
import java.util.List;
import org.apache.log4j.Logger;

public class BusinessProveedorImpl extends GetServices implements BusinessProveedor {
    static final Logger log = Logger.getLogger(BusinessProveedorImpl.class);

    @Override
    public List<TProveedor> listarProveedor(TProveedor proveedor) {
        log.debug("Estoy en el Metodo Business listarProveedor");
		if (proveedor != null)
			 return getProveedorService().ObtenerRegistros(proveedor);
		 return null;

    }

    @Override
    public TProveedor obtenerProveedor(TProveedor proveedor) {
        log.debug("Estoy en el Metodo Business obtenerProveedor");
		if (proveedor != null)
			 return getProveedorService().ObtenerUnRegistro(proveedor);
		 return null;

    }

    @Override
    public int insertarProveedor(TProveedor proveedor) {
        log.debug("Estoy en el Metodo Business insertarProveedor");
		if (proveedor != null){
			 proveedor.setDt_fecingresa(new Date());
			return getProveedorService().insertSelective(proveedor);
		 }
		return -1;
    }

    @Override
    public int actualizarProveedor(TProveedor proveedor) {
        log.debug("Estoy en el Metodo Business actualizarProveedor");
		if (proveedor != null){
			 proveedor.setDt_fecmodifica(new Date());
			return getProveedorService().updateByPrimaryKeySelective(proveedor);
		 }
		return -1;
    }

    @Override
    public int eliminarProveedor(TProveedor proveedor) {
        log.debug("Estoy en el Metodo Business eliminarProveedor");
		if (proveedor != null){
			 proveedor.setBt_habilitado(false);
			 proveedor.setDt_fecmodifica(new Date());
			return getProveedorService().updateByPrimaryKeySelective(proveedor);
		 }
		return -1;
    }
}