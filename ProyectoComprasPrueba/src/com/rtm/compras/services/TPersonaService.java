package com.rtm.compras.services;

import com.rtm.compras.bean.TPersona;
import com.rtm.compras.mapper.TPersonaMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("personaService")
public class TPersonaService {

	@Autowired
    private TPersonaMapper mapper;

    public TPersona ObtenerUnRegistro(TPersona record) {
        TPersona objeto= mapper.ObtenerUnRegistro(record);
        return objeto;
    }

    public List<TPersona> ObtenerRegistros(TPersona record) {
        List<TPersona> lista= mapper.ObtenerRegistros(record);
        return lista;
    }

    @Transactional
    public int insert(TPersona record) {
         return mapper.insert(record);
    }

    @Transactional
    public int insertSelective(TPersona record) {
         return mapper.insertSelective(record);
    }

    public TPersona selectByPrimaryKey(Integer in_idpersona) {
        TPersona objeto= mapper.selectByPrimaryKey(in_idpersona);
        return objeto;
    }

    @Transactional
    public int updateByPrimaryKey(TPersona record) {
         return mapper.updateByPrimaryKey(record);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TPersona record) {
         return mapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int deleteByPrimaryKey(Integer in_idpersona) {
        return mapper.deleteByPrimaryKey(in_idpersona);
    }
}