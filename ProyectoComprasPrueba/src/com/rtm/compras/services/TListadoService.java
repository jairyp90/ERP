package com.rtm.compras.services;

import com.rtm.compras.bean.TListado;
import com.rtm.compras.mapper.TListadoMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("listadoService")
public class TListadoService {

	@Autowired
    private TListadoMapper mapper;

    public TListado ObtenerUnRegistro(TListado record) {
        TListado objeto= mapper.ObtenerUnRegistro(record);
        return objeto;
    }

    public List<TListado> ObtenerRegistros(TListado record) {
        List<TListado> lista= mapper.ObtenerRegistros(record);
        return lista;
    }
    

    @Transactional
    public int insert(TListado record) {
         return mapper.insert(record);
    }

    @Transactional
    public int insertSelective(TListado record) {
         return mapper.insertSelective(record);
    }

    public TListado buscar(TListado record) {
        TListado objeto= mapper.buscar(record);
        return objeto;
    }
    
  /*  @Transactional
    public int updateByPrimaryKey(TListado record) {
         return mapper.updateByPrimaryKey(record);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TListado record) {
         return mapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int deleteByPrimaryKey() {
        return mapper.deleteByPrimaryKey();
    }*/
}