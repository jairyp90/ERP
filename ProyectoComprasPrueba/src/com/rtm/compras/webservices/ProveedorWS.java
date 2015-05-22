package com.rtm.compras.webservices;

import com.rtm.compras.bean.TProveedor;
import com.rtm.compras.business.BusinessProveedor;
import com.rtm.compras.business.BusinessProveedorImpl;
import java.util.List;
import org.apache.log4j.Logger;

public class ProveedorWS {
    static final Logger log = Logger.getLogger(ProveedorWS.class);

    private BusinessProveedor businessProveedor = new BusinessProveedorImpl();

    public TProveedor ObtenerUnRegistroWS(TProveedor proveedor) {
        log.debug("Estoy en el Metodo WebService ObtenerUnRegistroWS");
		return businessProveedor.obtenerProveedor(proveedor);
    }

    public List<TProveedor> ObtenerRegistrosWS(TProveedor proveedor) {
        log.debug("Estoy en el Metodo WebService ObtenerRegistrosWS");
		return businessProveedor.listarProveedor(proveedor);
    }

    public int insertWS(TProveedor proveedor) {
        log.debug("Estoy en el Metodo WebService insertWS");
		 return businessProveedor.insertarProveedor(proveedor);
    }

    public int updateByPrimaryKeyWS(TProveedor proveedor) {
        log.debug("Estoy en el Metodo WebService updateByPrimaryKeyWS");
		 return businessProveedor.actualizarProveedor(proveedor);
    }

    public int deleteByPrimaryKeyWS(TProveedor proveedor) {
        log.debug("Estoy en el Metodo WebService deleteByPrimaryKeyWS");
		return businessProveedor.eliminarProveedor(proveedor);
    }
}