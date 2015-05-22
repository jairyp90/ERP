package com.rtm.compras.business;

import com.rtm.compras.bean.TArticulo;
import java.util.List;

public interface BusinessArticulo {
    List<TArticulo> listarArticulo(TArticulo articulo);

    List<TArticulo> listarArticuloLike(TArticulo articulo);
    
    TArticulo obtenerArticulo(TArticulo articulo);

    int insertarArticulo(TArticulo articulo);

    int actualizarArticulo(TArticulo articulo);

    int eliminarArticulo(TArticulo articulo);
}