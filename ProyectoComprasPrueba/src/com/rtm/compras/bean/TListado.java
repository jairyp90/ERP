package com.rtm.compras.bean;

import java.util.Date;

public class TListado {
    private Integer in_idlistado;

    private String vc_codlistado;

    private String vc_deslistado;

    private String vc_ref1listado;

    private String vc_ref2listado;

    private String vc_ref3listado;

    private String vc_usuingresa;

    private Date dt_fecingresa;

    private String vc_usumodifica;

    private Date dt_fecmodifica;

    private Boolean bt_habilitado;

    public Integer getIn_idlistado() {
        return in_idlistado;
    }

    public void setIn_idlistado(Integer in_idlistado) {
        this.in_idlistado = in_idlistado;
    }

    public String getVc_codlistado() {
        return vc_codlistado;
    }

    public void setVc_codlistado(String vc_codlistado) {
        this.vc_codlistado = vc_codlistado;
    }

    public String getVc_deslistado() {
        return vc_deslistado;
    }

    public void setVc_deslistado(String vc_deslistado) {
        this.vc_deslistado = vc_deslistado;
    }

    public String getVc_ref1listado() {
        return vc_ref1listado;
    }

    public void setVc_ref1listado(String vc_ref1listado) {
        this.vc_ref1listado = vc_ref1listado;
    }

    public String getVc_ref2listado() {
        return vc_ref2listado;
    }

    public void setVc_ref2listado(String vc_ref2listado) {
        this.vc_ref2listado = vc_ref2listado;
    }

    public String getVc_ref3listado() {
        return vc_ref3listado;
    }

    public void setVc_ref3listado(String vc_ref3listado) {
        this.vc_ref3listado = vc_ref3listado;
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
}