package com.rtm.compras.services;

import com.rtm.compras.bean.TDetalleordencompra;
import com.rtm.compras.mapper.TDetalleordencompraMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("detalleordencompraService")
public class TDetalleordencompraService {

	@Autowired
    private TDetalleordencompraMapper mapper;

    public TDetalleordencompra ObtenerUnRegistro(TDetalleordencompra record) {
        TDetalleordencompra objeto= mapper.ObtenerUnRegistro(record);
        return objeto;
    }

    public List<TDetalleordencompra> ObtenerRegistros(TDetalleordencompra record) {
        List<TDetalleordencompra> lista= mapper.ObtenerRegistros(record);
        return lista;
    }

    @Transactional
    public int insert(TDetalleordencompra record) {
         return mapper.insert(record);
    }

    @Transactional
    public int insertSelective(TDetalleordencompra record) {
         return mapper.insertSelective(record);
    }

    public TDetalleordencompra selectByPrimaryKey(Integer in_iddetordcompra) {
        TDetalleordencompra objeto= mapper.selectByPrimaryKey(in_iddetordcompra);
        return objeto;
    }

    @Transactional
    public int updateByPrimaryKey(TDetalleordencompra record) {
         return mapper.updateByPrimaryKey(record);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TDetalleordencompra record) {
         return mapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int deleteByPrimaryKey(Integer in_iddetordcompra) {
        return mapper.deleteByPrimaryKey(in_iddetordcompra);
    }
}