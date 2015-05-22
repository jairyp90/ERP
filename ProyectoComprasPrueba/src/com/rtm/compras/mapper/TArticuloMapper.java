package com.rtm.compras.mapper;

import com.rtm.compras.bean.TArticulo;
import java.util.List;

public interface TArticuloMapper {
    int deleteByPrimaryKey(Integer in_idarticulo);

    int insert(TArticulo articulo);

    int insertSelective(TArticulo articulo);

    TArticulo selectByPrimaryKey(Integer in_idarticulo);

    int updateByPrimaryKeySelective(TArticulo articulo);

    int updateByPrimaryKeyWithBLOBs(TArticulo articulo);

    int updateByPrimaryKey(TArticulo articulo);

    List<TArticulo> ObtenerRegistros(TArticulo articulo);

    TArticulo ObtenerUnRegistro(TArticulo articulo);

	List<TArticulo> ObtenerRegistrosLike(TArticulo record);
}