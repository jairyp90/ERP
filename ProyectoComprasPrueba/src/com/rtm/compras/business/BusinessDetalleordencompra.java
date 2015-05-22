package com.rtm.compras.business;

import com.rtm.compras.bean.TDetalleordencompra;
import java.util.List;

public interface BusinessDetalleordencompra {
    List<TDetalleordencompra> listarDetalleordencompra(TDetalleordencompra detalleordencompra);

    TDetalleordencompra obtenerDetalleordencompra(TDetalleordencompra detalleordencompra);

    int insertarDetalleordencompra(TDetalleordencompra detalleordencompra);

    int actualizarDetalleordencompra(TDetalleordencompra detalleordencompra);

    int eliminarDetalleordencompra(TDetalleordencompra detalleordencompra);
}