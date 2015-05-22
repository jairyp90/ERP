package com.rtm.compras.business;

import com.rtm.compras.bean.TDetallesolicitud;
import java.util.List;

public interface BusinessDetallesolicitud {
    List<TDetallesolicitud> listarDetallesolicitud(TDetallesolicitud detallesolicitud);

    TDetallesolicitud obtenerDetallesolicitud(TDetallesolicitud detallesolicitud);

    int insertarDetallesolicitud(TDetallesolicitud detallesolicitud);

    int actualizarDetallesolicitud(TDetallesolicitud detallesolicitud);

    int eliminarDetallesolicitud(TDetallesolicitud detallesolicitud);
}