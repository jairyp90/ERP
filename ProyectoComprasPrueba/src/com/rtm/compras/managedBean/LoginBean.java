package com.rtm.compras.managedBean;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.primefaces.context.RequestContext;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;

import com.rtm.compras.bean.TPersona;
import com.rtm.compras.business.BusinessPersona;
import com.rtm.compras.business.BusinessPersonaImpl;

@ManagedBean(name="loginBean")
@SessionScoped
public class LoginBean {
	
	static final Logger log = Logger.getLogger(LoginBean.class);
	
	private BusinessPersona businessPersona = new BusinessPersonaImpl();
	

	private TPersona usuario;
    private List<String> images;
	private StreamedContent image;
	 
	
	public LoginBean() {
		usuario = new TPersona();
	}
	
	public String login() {  
        RequestContext context = RequestContext.getCurrentInstance();  
        FacesMessage msg = null;  
        boolean loggedIn = false;
        String resp;
        
        log.debug("info usuario: " + usuario.getVc_usuario() + " " + usuario.getVc_contrasena());
        usuario = businessPersona.obtenerPersona(usuario);
        
        if(usuario != null) {  
//            log.debug("Usuario: " + usuario.getVc_rutafoto());
            loggedIn = true;
    		HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(true);
    		session.setAttribute("usuario", usuario);
            msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenido " + usuario.getVc_usuario(), "Acceso Autorizado");
//            resp = "/paginas/persona/searchPersona.xhtml";
            resp = "/paginas/solicitud/searchSolicitud";
        } else {  
            loggedIn = false;  
            msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error", "Credenciales Invalidas"); 
            setUsuario(new TPersona());            
            resp = "/paginas/index.xhtml";
        }  

        log.debug("resp: " + resp);
        
        FacesContext.getCurrentInstance().addMessage(null, msg);  
        context.addCallbackParam("loggedIn", loggedIn); 
        
//        FacesContext.getCurrentInstance().getExternalContext().invalidateSession();        
        return resp;
    }

	public String logout() {
		log.debug("Entro al logout");
//	    HttpSession session = (HttpSession) FacesContext.getCurrentInstance().getExternalContext().getSession(false);
//	    session.invalidate();
//	    return "/paginas/index.xhtml";
	    
//		logeado = false;
		ExternalContext ctx = FacesContext.getCurrentInstance().getExternalContext();
		String ctxPath = ((ServletContext) ctx.getContext()).getContextPath();

		try {
            //Se quitó el objeto del Usuario en Session
			((HttpSession) ctx.getSession(true)).removeAttribute("usuario");
			((HttpSession) ctx.getSession(false)).invalidate();

			ctx.redirect(ctxPath.toString());
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	    return "/paginas/index.xhtml";	    
	    
	}
	
	
	
	public TPersona getUsuario() {
		return usuario;
	}

	public void setUsuario(TPersona usuario) {
		this.usuario = usuario;
	}

	public StreamedContent getImage() throws IOException {
		if(usuario.getBl_foto()!=null){
				image= new DefaultStreamedContent(new ByteArrayInputStream(usuario.getBl_foto()));
	}	else {
		try {
			byte[] b;
			FacesContext ctx = FacesContext.getCurrentInstance();
			ServletContext sc = (ServletContext) ctx.getExternalContext().getContext();
			
			Path path = Paths.get(sc.getRealPath("/resources/img/galeria/fotoperfil.jpg"));
			b = Files.readAllBytes(path);
			image = new DefaultStreamedContent(new ByteArrayInputStream(b));
		} catch (Exception e) {
			log.debug("Se Cayo!!" + e.getMessage());
		}
			
		}		
		return image;
	}

	public void setImage(StreamedContent image) {
		this.image = image;
	}



	public List<String> getImages() {
		return images;
	}

	public void setImages(List<String> images) {
		this.images = images;
	}

}
