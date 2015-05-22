package com.rtm.compras.mapper;

import com.rtm.compras.bean.TOrdencompra;
import java.util.List;

public interface TOrdencompraMapper {
    int deleteByPrimaryKey(Integer in_idordcompra);

    int insert(TOrdencompra ordencompra);

    int insertSelective(TOrdencompra ordencompra);

    TOrdencompra selectByPrimaryKey(Integer in_idordcompra);

    int updateByPrimaryKeySelective(TOrdencompra ordencompra);

    int updateByPrimaryKey(TOrdencompra ordencompra);

    List<TOrdencompra> ObtenerRegistros(TOrdencompra ordencompra);

    TOrdencompra ObtenerUnRegistro(TOrdencompra ordencompra);
}