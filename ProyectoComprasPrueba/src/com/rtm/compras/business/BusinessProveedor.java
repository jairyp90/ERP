package com.rtm.compras.business;

import com.rtm.compras.bean.TProveedor;
import java.util.List;

public interface BusinessProveedor {
    List<TProveedor> listarProveedor(TProveedor proveedor);

    TProveedor obtenerProveedor(TProveedor proveedor);

    int insertarProveedor(TProveedor proveedor);

    int actualizarProveedor(TProveedor proveedor);

    int eliminarProveedor(TProveedor proveedor);
}