package com.rtm.compras.bean;

import java.util.Date;

public class TSolicitud {
	
	private TPersona objpersona = new TPersona();
	
    private Integer in_idsolicitud;

    private String vc_nomsolicitud;

    private String vc_motsolicitud;

    private Integer in_idlocsolicitud;

    private String vc_deslocsolicitud;

    private Date vc_plazsolicitud;

    private String vc_obssolicitud;

    private String vc_usuingresa;

    private Date dt_fecingresa;

    private String vc_usumodifica;

    private Date dt_fecmodifica;

    private Boolean bt_habilitado;

    public Integer getIn_idsolicitud() {
        return in_idsolicitud;
    }

    public void setIn_idsolicitud(Integer in_idsolicitud) {
        this.in_idsolicitud = in_idsolicitud;
    }

    public String getVc_nomsolicitud() {
        return vc_nomsolicitud;
    }

    public void setVc_nomsolicitud(String vc_nomsolicitud) {
        this.vc_nomsolicitud = vc_nomsolicitud;
    }

    public String getVc_motsolicitud() {
        return vc_motsolicitud;
    }

    public void setVc_motsolicitud(String vc_motsolicitud) {
        this.vc_motsolicitud = vc_motsolicitud;
    }

    public Integer getIn_idlocsolicitud() {
        return in_idlocsolicitud;
    }

    public void setIn_idlocsolicitud(Integer in_idlocsolicitud) {
        this.in_idlocsolicitud = in_idlocsolicitud;
    }

    public String getVc_deslocsolicitud() {
        return vc_deslocsolicitud;
    }

    public void setVc_deslocsolicitud(String vc_deslocsolicitud) {
        this.vc_deslocsolicitud = vc_deslocsolicitud;
    }

    public Date getVc_plazsolicitud() {
        return vc_plazsolicitud;
    }

    public void setVc_plazsolicitud(Date vc_plazsolicitud) {
        this.vc_plazsolicitud = vc_plazsolicitud;
    }

    public String getVc_obssolicitud() {
        return vc_obssolicitud;
    }

    public void setVc_obssolicitud(String vc_obssolicitud) {
        this.vc_obssolicitud = vc_obssolicitud;
    }

    public String getVc_usuingresa() {
        return vc_usuingresa;
    }

    public void setVc_usuingresa(String vc_usuingresa) {
        this.vc_usuingresa = vc_usuingresa;
    }

    public Date getDt_fecingresa() {
        return dt_fecingresa;
    }

    public void setDt_fecingresa(Date dt_fecingresa) {
        this.dt_fecingresa = dt_fecingresa;
    }

    public String getVc_usumodifica() {
        return vc_usumodifica;
    }

    public void setVc_usumodifica(String vc_usumodifica) {
        this.vc_usumodifica = vc_usumodifica;
    }

    public Date getDt_fecmodifica() {
        return dt_fecmodifica;
    }

    public void setDt_fecmodifica(Date dt_fecmodifica) {
        this.dt_fecmodifica = dt_fecmodifica;
    }

    public Boolean getBt_habilitado() {
        return bt_habilitado;
    }

    public void setBt_habilitado(Boolean bt_habilitado) {
        this.bt_habilitado = bt_habilitado;
    }

	public TPersona getObjpersona() {
		return objpersona;
	}

	public void setObjpersona(TPersona objpersona) {
		this.objpersona = objpersona;
	}
}