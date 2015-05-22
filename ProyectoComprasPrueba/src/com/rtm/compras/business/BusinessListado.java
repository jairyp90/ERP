package com.rtm.compras.business;

import com.rtm.compras.bean.TListado;


import java.util.List;

public interface BusinessListado {
    List<TListado> listarListado(TListado listado);
    

    TListado obtenerListado(TListado listado);

    int insertarListado(TListado listado);
    
    public TListado buscar(TListado catalogo);

 /*   int actualizarListado(TListado listado);

    int eliminarListado(TListado listado);*/
}