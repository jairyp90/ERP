package com.rtm.compras.mapper;

import com.rtm.compras.bean.TDetallesolicitud;
import java.util.List;

public interface TDetallesolicitudMapper {
    int deleteByPrimaryKey(Integer in_iddetsolicitud);

    int insert(TDetallesolicitud detallesolicitud);

    int insertSelective(TDetallesolicitud detallesolicitud);

    TDetallesolicitud selectByPrimaryKey(Integer in_iddetsolicitud);

    int updateByPrimaryKeySelective(TDetallesolicitud detallesolicitud);

    int updateByPrimaryKey(TDetallesolicitud detallesolicitud);

    List<TDetallesolicitud> ObtenerRegistros(TDetallesolicitud detallesolicitud);

    TDetallesolicitud ObtenerUnRegistro(TDetallesolicitud detallesolicitud);
}