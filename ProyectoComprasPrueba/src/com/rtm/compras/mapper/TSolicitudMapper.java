package com.rtm.compras.mapper;

import com.rtm.compras.bean.TSolicitud;
import java.util.List;

public interface TSolicitudMapper {
    int deleteByPrimaryKey(Integer in_idsolicitud);

    int insert(TSolicitud solicitud);

    int insertSelective(TSolicitud solicitud);

    TSolicitud selectByPrimaryKey(Integer in_idsolicitud);

    int updateByPrimaryKeySelective(TSolicitud solicitud);

    int updateByPrimaryKey(TSolicitud solicitud);

    List<TSolicitud> ObtenerRegistros(TSolicitud solicitud);

    TSolicitud ObtenerUnRegistro(TSolicitud solicitud);
}