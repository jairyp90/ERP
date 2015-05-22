package com.rtm.compras.mapper;

import com.rtm.compras.bean.TPersona;
import java.util.List;

public interface TPersonaMapper {
    int deleteByPrimaryKey(Integer in_idpersona);

    int insert(TPersona persona);

    int insertSelective(TPersona persona);

    TPersona selectByPrimaryKey(Integer in_idpersona);

    int updateByPrimaryKeySelective(TPersona persona);

    int updateByPrimaryKey(TPersona persona);

    List<TPersona> ObtenerRegistros(TPersona persona);

    TPersona ObtenerUnRegistro(TPersona persona);
}