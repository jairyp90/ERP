package com.rtm.compras.utils;

import java.util.ArrayList;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.apache.log4j.Logger;

import com.rtm.compras.bean.TArticulo;
import com.rtm.compras.business.BusinessArticulo;
import com.rtm.compras.business.BusinessArticuloImpl;


@FacesConverter(value = "converteArticulo")
public class ConverterArticulo implements Converter {
	List<TArticulo> articuloDS = new ArrayList<TArticulo>();
	static final Logger log = Logger.getLogger(ConverterArticulo.class);
	private BusinessArticulo businessArticulo = new BusinessArticuloImpl();

	public ConverterArticulo() {
	}

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String arg2) {

		log.debug("ARGUMENTO : " + arg2);

		TArticulo articulo = new TArticulo();
		articulo.setVc_desarticulo(arg2);
		articulo.setBt_habilitado(true);

		articuloDS = businessArticulo.listarArticulo(articulo);
		log.debug("personasDS tamaño: " + articuloDS.size());
		int codigo = 0;
		try {
			codigo = (Integer.parseInt(arg2));
		} catch (Exception e) {

		}
		articulo = new TArticulo();
		articulo.setIn_idarticulo(codigo);
		articulo = businessArticulo.obtenerArticulo(articulo);

 
		return articulo;
	}
	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object arg2) {
		if (((TArticulo) arg2).getIn_idarticulo() != null)
			return ((TArticulo) arg2).getIn_idarticulo().toString();
		else
			return "";
	}

}
