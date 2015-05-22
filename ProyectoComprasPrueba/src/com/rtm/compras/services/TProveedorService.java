package com.rtm.compras.services;

import com.rtm.compras.bean.TProveedor;
import com.rtm.compras.mapper.TProveedorMapper;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("proveedorService")
public class TProveedorService {

	@Autowired
    private TProveedorMapper mapper;

    public TProveedor ObtenerUnRegistro(TProveedor record) {
        TProveedor objeto= mapper.ObtenerUnRegistro(record);
        return objeto;
    }

    public List<TProveedor> ObtenerRegistros(TProveedor record) {
        List<TProveedor> lista= mapper.ObtenerRegistros(record);
        return lista;
    }

    @Transactional
    public int insert(TProveedor record) {
         return mapper.insert(record);
    }

    @Transactional
    public int insertSelective(TProveedor record) {
         return mapper.insertSelective(record);
    }

    public TProveedor selectByPrimaryKey(Integer in_idproveedor) {
        TProveedor objeto= mapper.selectByPrimaryKey(in_idproveedor);
        return objeto;
    }

    @Transactional
    public int updateByPrimaryKey(TProveedor record) {
         return mapper.updateByPrimaryKey(record);
    }

    @Transactional
    public int updateByPrimaryKeySelective(TProveedor record) {
         return mapper.updateByPrimaryKeySelective(record);
    }

    @Transactional
    public int deleteByPrimaryKey(Integer in_idproveedor) {
        return mapper.deleteByPrimaryKey(in_idproveedor);
    }
}