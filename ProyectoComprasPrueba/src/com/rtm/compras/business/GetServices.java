package com.rtm.compras.business;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.ContextLoader;

import com.rtm.compras.services.TArticuloService;
import com.rtm.compras.services.TDetalleordencompraService;
import com.rtm.compras.services.TDetallesolicitudService;
import com.rtm.compras.services.TListadoService;
import com.rtm.compras.services.TOrdencompraService;
import com.rtm.compras.services.TPersonaService;
import com.rtm.compras.services.TProveedorService;
import com.rtm.compras.services.TSolicitudService;

public class GetServices {
	private ApplicationContext cntx = ContextLoader.getCurrentWebApplicationContext();
	

	public GetServices(){
	}
	
	private TArticuloService articuloService = (TArticuloService)cntx.getBean("articuloService");
	private TDetalleordencompraService detalleordenService = (TDetalleordencompraService)cntx.getBean("detalleordencompraService");
	private TDetallesolicitudService detallesolicitudService = (TDetallesolicitudService)cntx.getBean("detallesolicitudService");
	private TListadoService listadoService = (TListadoService)cntx.getBean("listadoService");
	private TOrdencompraService ordencompraService = (TOrdencompraService)cntx.getBean("ordencompraService");
	private TPersonaService personaService = (TPersonaService)cntx.getBean("personaService");
	private TProveedorService proveedorService = (TProveedorService)cntx.getBean("proveedorService");
	private TSolicitudService solicitudService = (TSolicitudService)cntx.getBean("solicitudService");
	
	
	public ApplicationContext getCntx() {
		return cntx;
	}
	public void setCntx(ApplicationContext cntx) {
		this.cntx = cntx;
	}
	public TArticuloService getArticuloService() {
		return articuloService;
	}
	public TDetalleordencompraService getDetalleordenService() {
		return detalleordenService;
	}
	public TDetallesolicitudService getDetallesolicitudService() {
		return detallesolicitudService;
	}
	public TListadoService getListadoService() {
		return listadoService;
	}
	public TOrdencompraService getOrdencompraService() {
		return ordencompraService;
	}
	public TPersonaService getPersonaService() {
		return personaService;
	}
	public TProveedorService getProveedorService() {
		return proveedorService;
	}
	public TSolicitudService getSolicitudService() {
		return solicitudService;
	}
	

	
	
}
