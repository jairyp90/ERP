package com.rtm.compras.business;

import com.rtm.compras.bean.TPersona;
import java.util.List;

public interface BusinessPersona {
    List<TPersona> listarPersona(TPersona persona);

    TPersona obtenerPersona(TPersona persona);

    int insertarPersona(TPersona persona);

    int actualizarPersona(TPersona persona);

    int eliminarPersona(TPersona persona);
}