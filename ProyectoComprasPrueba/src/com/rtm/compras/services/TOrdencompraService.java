package com.rtm.compras.services;

import com.rtm.compras.bean.TOrdencompra;
import com.rtm.compras.mapper.TOrdencompraMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("ordencompraService")
public class TOrdencompraService {

	@Autowired
    private TOrdencompraMapper mapper;

    public TOrdencompra ObtenerUnRegistro(TOrdencompra record) {
        TOrdencompra objeto= mapper.ObtenerUnRegistro(record);
        return objeto;
    }

    public List<TOrdencompra> ObtenerRegistros(TOrdencompra record) {
        List<TOrdencompra> lista= mapper.ObtenerRegistros(record);
        return lista;
    }

    @Transactional
    public int insert(TOrdencompra record) {
         return mapper.insert(record);
    }

    @Transactional
    public int insertSelective(TOrdencompra record) {
         return mapper.insertSelective(record);
    }

    public TOrdencompra selectByPrimaryKey(Integer in_idordcompra) {
        TOrdencompra objeto= mapper.selectByPrimaryKey(in_idordcompra);
        return objeto;
    }

    @Transactional
    public int updateByPrimaryKey(TOrdencompra record) {
         return mapper.updateByPrimaryKey(record);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TOrdencompra record) {
         return mapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int deleteByPrimaryKey(Integer in_idordcompra) {
        return mapper.deleteByPrimaryKey(in_idordcompra);
    }
}