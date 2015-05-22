package com.rtm.compras.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;




import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.apache.log4j.Logger;

import com.rtm.compras.bean.TListado;
import com.rtm.compras.bean.TSolicitud;
import com.rtm.compras.business.BusinessListado;
import com.rtm.compras.business.BusinessListadoImpl;

@ManagedBean(name="utilBean")
@RequestScoped
public class  utilsall {
	 static final Logger log = Logger.getLogger(utilsall.class);
	 //Bean
	 public TSolicitud solicitud;
	 public TListado listado;
	 //hashsmaps
    
    public List<TListado> listaLocales;
	public Map<String, Integer>hlocales = new HashMap<String, Integer>();
    
	//Bussines
	
	public BusinessListado businessListado = new BusinessListadoImpl();
	
	
	
	
	  public void CargarhLocales(){
	    	log.debug("entro a getHorganizaciones");
	    	listado= new TListado();
	    	listado.setVc_codlistado(Constantes.codigoComboLocal);
	    	listaLocales = businessListado.listarListado(listado);
			log.debug("tamaño: " + listaLocales.size());
			for (int i = 0; i <listaLocales.size(); i++) {
				TListado aux_listado = (TListado) listaLocales.get(i);
				hlocales.put(aux_listado.getVc_deslistado(), aux_listado.getIn_idlistado());	
			}
			log.debug("fin del gethListado");
	    }
	    public void ObtenerDesLocales(Integer id){
	 		log.debug("Id Locales" + id);
	 		for (Entry<String, Integer> locales: hlocales.entrySet()) {
				if(id.intValue() == locales.getValue().intValue()){
					solicitud.setVc_deslocsolicitud(locales.getKey());
				}
			}
		}
	    
	    
	    public Map<String, Integer> getHlocales() {
	 			return hlocales;
	 		}

	 		public void setHlocales(Map<String, Integer> hlocales) {
	 			this.hlocales = hlocales;
	 		}

	 		public List<TListado> getListaLocales() {
	 			return listaLocales;
	 		}

	 		public void setListaLocales(List<TListado> listaLocales) {
	 			this.listaLocales = listaLocales;
	 		}
			public TSolicitud getSolicitud() {
				return solicitud;
			}
			public void setSolicitud(TSolicitud solicitud) {
				this.solicitud = solicitud;
			}
		
		
		

}
