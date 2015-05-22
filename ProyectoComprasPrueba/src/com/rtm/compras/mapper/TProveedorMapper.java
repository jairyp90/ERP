package com.rtm.compras.mapper;

import com.rtm.compras.bean.TProveedor;
import java.util.List;

public interface TProveedorMapper {
    int deleteByPrimaryKey(Integer in_idproveedor);

    int insert(TProveedor proveedor);

    int insertSelective(TProveedor proveedor);

    TProveedor selectByPrimaryKey(Integer in_idproveedor);

    int updateByPrimaryKeySelective(TProveedor proveedor);

    int updateByPrimaryKey(TProveedor proveedor);

    List<TProveedor> ObtenerRegistros(TProveedor proveedor);

    TProveedor ObtenerUnRegistro(TProveedor proveedor);
}