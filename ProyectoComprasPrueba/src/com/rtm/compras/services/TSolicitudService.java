package com.rtm.compras.services;

import com.rtm.compras.bean.TSolicitud;
import com.rtm.compras.mapper.TSolicitudMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("solicitudService")
public class TSolicitudService {

	@Autowired
    private TSolicitudMapper mapper;

    public TSolicitud ObtenerUnRegistro(TSolicitud record) {
        TSolicitud objeto= mapper.ObtenerUnRegistro(record);
        return objeto;
    }

    public List<TSolicitud> ObtenerRegistros(TSolicitud record) {
        List<TSolicitud> lista= mapper.ObtenerRegistros(record);
        return lista;
    }

    @Transactional
    public int insert(TSolicitud record) {
         return mapper.insert(record);
    }

    @Transactional
    public int insertSelective(TSolicitud record) {
         return mapper.insertSelective(record);
    }

    public TSolicitud selectByPrimaryKey(Integer in_idsolicitud) {
        TSolicitud objeto= mapper.selectByPrimaryKey(in_idsolicitud);
        return objeto;
    }

    @Transactional
    public int updateByPrimaryKey(TSolicitud record) {
         return mapper.updateByPrimaryKey(record);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TSolicitud record) {
         return mapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int deleteByPrimaryKey(Integer in_idsolicitud) {
        return mapper.deleteByPrimaryKey(in_idsolicitud);
    }
}