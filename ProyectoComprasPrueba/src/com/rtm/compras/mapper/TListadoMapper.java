package com.rtm.compras.mapper;

import com.rtm.compras.bean.TListado;

import java.util.List;

import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

public interface TListadoMapper {
    int insert(TListado listado);

    int insertSelective(TListado listado);

    List<TListado> ObtenerRegistros(TListado listado);

    
    @Select("select * from t_listado where in_idlistado=#{in_idlistado} and vc_codlistado=#{vc_codlistado} and bt_habilitado=#{bt_habilitado} ")
    @ResultMap("BaseResultMap")
    TListado buscar(TListado catalogo);
    
    TListado ObtenerUnRegistro(TListado listado);
}