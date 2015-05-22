package com.rtm.compras.business;

import com.rtm.compras.bean.TOrdencompra;
import java.util.List;

public interface BusinessOrdencompra {
    List<TOrdencompra> listarOrdencompra(TOrdencompra ordencompra);

    TOrdencompra obtenerOrdencompra(TOrdencompra ordencompra);

    int insertarOrdencompra(TOrdencompra ordencompra);

    int actualizarOrdencompra(TOrdencompra ordencompra);

    int eliminarOrdencompra(TOrdencompra ordencompra);
}