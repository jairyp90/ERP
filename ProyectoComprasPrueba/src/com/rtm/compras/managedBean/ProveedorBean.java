package com.rtm.compras.managedBean;

import com.rtm.compras.bean.TProveedor;
import com.rtm.compras.business.BusinessProveedor;
import com.rtm.compras.business.BusinessProveedorImpl;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;

import org.apache.log4j.Logger;
import org.primefaces.event.SelectEvent;

@ManagedBean(name="proveedorBean")
@SessionScoped
public class ProveedorBean {
    static final Logger log = Logger.getLogger(ProveedorBean.class);

    private BusinessProveedor businessProveedor = new BusinessProveedorImpl();

    private TProveedor proveedor;

    private List<TProveedor> listaProveedor;

    public ProveedorBean() {
        proveedor = new TProveedor();
		ListarProveedores(proveedor);
    }

    public void ListarProveedores(TProveedor proveedor) {
        log.debug("Estoy en el Metodo VOID ManagedBeans ListarProveedores");
		proveedor.setBt_habilitado(true);
		listaProveedor = businessProveedor.listarProveedor(proveedor);
    }

    public String ListarProveedores() {
        log.debug("Estoy en el Metodo ManagedBeans ListarProveedores Page");
		proveedor = new TProveedor();
		this.ListarProveedores(proveedor);
		return "/paginas/proveedor/searchProveedor";
    }

    public void cargarDatosMaestros() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatosMaestros");
		proveedor=new TProveedor();
    }

    public void cargarDatos() {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos SIN Parametros");
    }

    public void cargarDatos(Integer in_idproveedor) {
        log.debug("Estoy en el Metodo ManagedBeans cargarDatos con Parametros");
		
			proveedor = new TProveedor();
			proveedor.setIn_idproveedor(in_idproveedor);
			proveedor = businessProveedor.obtenerProveedor(proveedor);
    }

    public void guardarRegistroProveedor() {
        log.debug("Estoy en el Metodo ManagedBeans guardarRegistroProveedor");
		businessProveedor.insertarProveedor(proveedor);
		ListarProveedores(new TProveedor());
    }

    public void actualizarRegistroProveedor() {
        log.debug("Estoy en el Metodo ManagedBeans actualizarRegistroProveedor");
		businessProveedor.actualizarProveedor(proveedor);
		ListarProveedores(new TProveedor());
    }

    public void eliminarRegistroProveedor() {
        log.debug("Estoy en el Metodo ManagedBeans eliminarRegistroProveedor");
		businessProveedor.eliminarProveedor(proveedor);
		ListarProveedores(new TProveedor());
    }

    public void onRowSelect(SelectEvent event) {
        log.debug("Estoy en el Metodo ManagedBeans onRowSelect");
		proveedor = (TProveedor) event.getObject();
		Integer in_idproveedor = proveedor.getIn_idproveedor();
		proveedor = new TProveedor();
		proveedor.setIn_idproveedor(in_idproveedor);
		proveedor = businessProveedor.obtenerProveedor(proveedor);
    }

    public TProveedor getProveedor() {
        return proveedor;
    }

    public void setProveedor(TProveedor proveedor) {
        this.proveedor = proveedor;
    }

    public List<TProveedor> getListaProveedor() {
        return listaProveedor;
    }

    public void setListaProveedor(List<TProveedor> listaProveedor) {
        this.listaProveedor = listaProveedor;
    }
}