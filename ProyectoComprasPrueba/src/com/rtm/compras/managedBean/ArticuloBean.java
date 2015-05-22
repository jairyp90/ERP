package com.rtm.compras.managedBean;

import com.rtm.compras.bean.TArticulo;
import com.rtm.compras.bean.TListado;
import com.rtm.compras.business.BusinessArticulo;
import com.rtm.compras.business.BusinessArticuloImpl;
import com.rtm.compras.business.BusinessListado;
import com.rtm.compras.business.BusinessListadoImpl;
import com.rtm.compras.utils.Constantes;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.apache.commons.io.IOUtils;
import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

@ManagedBean(name="articuloBean")
@SessionScoped
public class ArticuloBean {
    static final Logger log = Logger.getLogger(ArticuloBean.class);

    private BusinessArticulo businessArticulo = new BusinessArticuloImpl();
    private BusinessListado businessListado = new BusinessListadoImpl();
    
    private TArticulo articulo;
    private TArticulo articuloaux;

    private List<TArticulo> articulos;
    private List<TArticulo> listaArticulo;
    private List<TArticulo> listaCompleteArticulo;
    
    //Imagen
    private StreamedContent imagen;

    public ArticuloBean() {
        articulo = new TArticulo();
		ListarArticulos(articulo);
    }

    public void ListarArticulos(TArticulo articulo) {
        log.debug("Estoy en el Metodo VOID ManagedBeans ListarArticulos");
		articulo.setBt_habilitado(true);
		listaArticulo = businessArticulo.listarArticulo(articulo);
    }

    public String ListarArticulos() {
        log.debug("Estoy en el Metodo ManagedBeans ListarArticulos Page");
		articulo = new TArticulo();
		this.ListarArticulos(articulo);
		return "/paginas/articulo/searchArticulo";
    }

    public void cargarDatosMaestros() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatosMaestros");
		articulo=new TArticulo();
    }

    public void cargarDatos() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos SIN Parametros");
    }

    public void cargarDatos(Integer in_idarticulo) {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos con Parametros");
		
			articulo = new TArticulo();
			articulo.setIn_idarticulo(in_idarticulo);
			articulo = businessArticulo.obtenerArticulo(articulo);
    }

    public void guardarRegistroArticulo() {
        log.debug("Estoy en el Metodo ManagedBeans guardarRegistroArticulo");
		businessArticulo.insertarArticulo(articulo);
		ListarArticulos(new TArticulo());
    }

    public void actualizarRegistroArticulo() {
        log.debug("Estoy en el Metodo ManagedBeans actualizarRegistroArticulo");
		businessArticulo.actualizarArticulo(articulo);
		ListarArticulos(new TArticulo());
    }

    public void eliminarRegistroArticulo() {
        log.debug("Estoy en el Metodo ManagedBeans eliminarRegistroArticulo");
		businessArticulo.eliminarArticulo(articulo);
		ListarArticulos(new TArticulo());
    }

    public void onRowSelect(SelectEvent event) {
        log.debug("Estoy en el Metodo ManagedBeans onRowSelect");
		articulo = (TArticulo) event.getObject();
		Integer in_idarticulo = articulo.getIn_idarticulo();
		articulo = new TArticulo();
		articulo.setIn_idarticulo(in_idarticulo);
		articulo = businessArticulo.obtenerArticulo(articulo);
    }

    public List<TArticulo> autocompleteArticulo(String query) {

    	TArticulo articulo = new TArticulo();
    	articulo.setVc_desarticulo(query);
    	articulo.setBt_habilitado(true);
		
    	listaCompleteArticulo = businessArticulo.listarArticuloLike(articulo);		
		return listaCompleteArticulo;
	}

    public void handleArticuloBusqueda(SelectEvent event) {

		if (event.getObject() instanceof TArticulo) {
			articuloaux = (TArticulo) event.getObject();
			articulo.setVc_desarticulo(articuloaux.getVc_desarticulo());
			
		}

	}
    
    public void buscarArticulo(){
    	log.debug("INGRESE A BUSCAR ARTICULO METODO");
    		if(articuloaux!=null){	
    			log.debug("INGRESE A BUSCAR ARTICULO METODO 2" + articuloaux.getVc_desarticulo());
    			this.ListarArticulos(articuloaux);
    		}
    		
    		
    }
    
    public void handleReturn(SelectEvent event) {
		if (event.getObject() != null) {
			TListado obj = (TListado) event.getObject();
			if (obj.getVc_codlistado().trim().equals(Constantes.codigoArticuloTipo)) {
				articulo.setArtTipo(obj);
			} else if (obj.getVc_codlistado().trim().equals(Constantes.codigoArticuloMedida)) {
				articulo.setArtMedida(obj);
			} else if (obj.getVc_codlistado().trim().equals(Constantes.codigoArticuloMarca)) {
				articulo.setArtMarca(obj);
			} else if (obj.getVc_codlistado().trim().equals(Constantes.codigoArticuloModelo)) {
				articulo.setArtModelo(obj);
			}
		}
	}
    
    public void showBuscar(String pagina) {
		articulos.clear();
		articulo = new TArticulo();
	//	barticulo = new TARTI();

		Map<String, Object> options = new HashMap<String, Object>();
		options.put("modal", true);
		options.put("draggable", true);
		options.put("resizable", false);
		options.put("contentHeight", 480);
		options.put("contentWidth", 550);
		RequestContext.getCurrentInstance().openDialog(pagina, options, null);
	}
    
    public void limpiarFiltro(){
    	articulo = new TArticulo();
    	listaArticulo = businessArticulo.listarArticulo(articulo);
    	
    }
    
    public void buscarTipo() {
		System.out.println("buscando tipo");
		if (articulo.getArtTipo().getIn_idlistado() != null) {
			articulo.getArtTipo().setVc_codlistado(Constantes.codigoArticuloTipo);
			TListado catalogo = businessListado.buscar(articulo.getArtTipo());
			if (catalogo != null) {
				articulo.setArtTipo(catalogo);
			} else {
				articulo.getArtTipo().setVc_deslistado("Código no existe");
			}
		} else {
			System.out.println(" aa " + articulo.getArtTipo().getVc_codlistado());
		}
	}
    
    public void buscarMedida() {
  		System.out.println("buscando medida");
  		if (articulo.getArtMedida().getIn_idlistado() != null) {
  			articulo.getArtMedida().setVc_codlistado(Constantes.codigoArticuloMedida);
  			TListado catalogo = businessListado.buscar(articulo.getArtMedida());
  			if (catalogo != null) {
  				articulo.setArtMedida(catalogo);
  			} else {
  				articulo.getArtMedida().setVc_deslistado("Código no existe");
  			}
  		} else {
  			System.out.println(" aa " + articulo.getArtMedida().getVc_codlistado());
  		}
  	}
    
    public void buscarMarca() {
		System.out.println("buscando marca");
		if (articulo.getArtMarca().getIn_idlistado() != null) {
			articulo.getArtMarca().setVc_codlistado(Constantes.codigoArticuloMarca);
			TListado catalogo = businessListado.buscar(articulo.getArtMarca());
			if (catalogo != null) {
				articulo.setArtMarca(catalogo);
			} else {
				articulo.getArtMarca().setVc_deslistado("Código no existe");
			}
		} else {
			System.out.println(" aa " + articulo.getArtMarca().getVc_codlistado());
		}
	}

	public void buscarModelo() {
		System.out.println("buscando modelo");
		if (articulo.getArtModelo().getIn_idlistado() != null) {
			articulo.getArtModelo().setVc_codlistado(Constantes.codigoArticuloModelo);
			TListado catalogo = businessListado.buscar(articulo.getArtMarca());
			if (catalogo != null) {
				articulo.setArtModelo(catalogo);
			} else {
				articulo.getArtModelo().setVc_deslistado("Código no existe");
			}
		} else {
			System.out.println(" aa " + articulo.getArtModelo().getVc_codlistado());
		}
	}
	
	public void upload(FileUploadEvent event) {
		try {
			articulo.setBy_imgarticulo(IOUtils.toByteArray(event.getFile()
					.getInputstream()));
			imagen = new DefaultStreamedContent(event.getFile()
					.getInputstream());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
    
    public TArticulo getArticulo() {
        return articulo;
    }

    public void setArticulo(TArticulo articulo) {
        this.articulo = articulo;
    }

    public List<TArticulo> getListaArticulo() {
        return listaArticulo;
    }

    public void setListaArticulo(List<TArticulo> listaArticulo) {
        this.listaArticulo = listaArticulo;
    }

	public List<TArticulo> getListaCompleteArticulo() {
		return listaCompleteArticulo;
	}

	public void setListaCompleteArticulo(List<TArticulo> listaCompleteArticulo) {
		this.listaCompleteArticulo = listaCompleteArticulo;
	}

	public TArticulo getArticuloaux() {
		return articuloaux;
	}

	public void setArticuloaux(TArticulo articuloaux) {
		this.articuloaux = articuloaux;
	}

	public BusinessArticulo getBusinessArticulo() {
		return businessArticulo;
	}

	public void setBusinessArticulo(BusinessArticulo businessArticulo) {
		this.businessArticulo = businessArticulo;
	}

	public BusinessListado getBusinessListado() {
		return businessListado;
	}

	public void setBusinessListado(BusinessListado businessListado) {
		this.businessListado = businessListado;
	}

	public StreamedContent getImagen() {
		return imagen;
	}

	public void setImagen(StreamedContent imagen) {
		this.imagen = imagen;
	}
}