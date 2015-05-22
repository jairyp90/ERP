package com.rtm.compras.mapper;

import com.rtm.compras.bean.TDetalleordencompra;
import java.util.List;

public interface TDetalleordencompraMapper {
    int deleteByPrimaryKey(Integer in_iddetordcompra);

    int insert(TDetalleordencompra detalleordencompra);

    int insertSelective(TDetalleordencompra detalleordencompra);

    TDetalleordencompra selectByPrimaryKey(Integer in_iddetordcompra);

    int updateByPrimaryKeySelective(TDetalleordencompra detalleordencompra);

    int updateByPrimaryKey(TDetalleordencompra detalleordencompra);

    List<TDetalleordencompra> ObtenerRegistros(TDetalleordencompra detalleordencompra);

    TDetalleordencompra ObtenerUnRegistro(TDetalleordencompra detalleordencompra);
}