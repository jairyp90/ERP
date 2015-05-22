package com.rtm.compras.business;

import com.rtm.compras.bean.TSolicitud;
import java.util.List;

public interface BusinessSolicitud {
    List<TSolicitud> listarSolicitud(TSolicitud solicitud);

    TSolicitud obtenerSolicitud(TSolicitud solicitud);

    int insertarSolicitud(TSolicitud solicitud);

    int actualizarSolicitud(TSolicitud solicitud);

    int eliminarSolicitud(TSolicitud solicitud);
}