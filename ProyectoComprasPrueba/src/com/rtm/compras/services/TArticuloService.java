package com.rtm.compras.services;

import com.rtm.compras.bean.TArticulo;
import com.rtm.compras.mapper.TArticuloMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("articuloService")
public class TArticuloService {

	@Autowired
    private TArticuloMapper mapper;

    public TArticulo ObtenerUnRegistro(TArticulo record) {
        TArticulo objeto= mapper.ObtenerUnRegistro(record);
        return objeto;
    }

    public List<TArticulo> ObtenerRegistros(TArticulo record) {
        List<TArticulo> lista= mapper.ObtenerRegistros(record);
        return lista;
    }

    public List<TArticulo> ObtenerRegistrosLike(TArticulo record) {
        List<TArticulo> lista= mapper.ObtenerRegistrosLike(record);
        return lista;
    }
    @Transactional
    public int insert(TArticulo record) {
         return mapper.insert(record);
    }

    @Transactional
    public int insertSelective(TArticulo record) {
         return mapper.insertSelective(record);
    }

    public TArticulo selectByPrimaryKey(Integer in_idarticulo) {
        TArticulo objeto= mapper.selectByPrimaryKey(in_idarticulo);
        return objeto;
    }

    @Transactional
    public int updateByPrimaryKey(TArticulo record) {
         return mapper.updateByPrimaryKey(record);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TArticulo record) {
         return mapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int deleteByPrimaryKey(Integer in_idarticulo) {
        return mapper.deleteByPrimaryKey(in_idarticulo);
    }
}