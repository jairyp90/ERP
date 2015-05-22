package com.rtm.compras.services;

import com.rtm.compras.bean.TDetallesolicitud;
import com.rtm.compras.mapper.TDetallesolicitudMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("detallesolicitudService")
public class TDetallesolicitudService {

	@Autowired
    private TDetallesolicitudMapper mapper;

    public TDetallesolicitud ObtenerUnRegistro(TDetallesolicitud record) {
        TDetallesolicitud objeto= mapper.ObtenerUnRegistro(record);
        return objeto;
    }

    public List<TDetallesolicitud> ObtenerRegistros(TDetallesolicitud record) {
        List<TDetallesolicitud> lista= mapper.ObtenerRegistros(record);
        return lista;
    }

    @Transactional
    public int insert(TDetallesolicitud record) {
         return mapper.insert(record);
    }

    @Transactional
    public int insertSelective(TDetallesolicitud record) {
         return mapper.insertSelective(record);
    }

    public TDetallesolicitud selectByPrimaryKey(Integer in_iddetsolicitud) {
        TDetallesolicitud objeto= mapper.selectByPrimaryKey(in_iddetsolicitud);
        return objeto;
    }

    @Transactional
    public int updateByPrimaryKey(TDetallesolicitud record) {
         return mapper.updateByPrimaryKey(record);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TDetallesolicitud record) {
         return mapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int deleteByPrimaryKey(Integer in_iddetsolicitud) {
        return mapper.deleteByPrimaryKey(in_iddetsolicitud);
    }
}