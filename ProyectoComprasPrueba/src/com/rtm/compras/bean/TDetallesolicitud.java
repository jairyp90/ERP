package com.rtm.compras.bean;

import java.util.Date;

public class TDetallesolicitud {
    private Integer in_iddetsolicitud;

    private String vc_artidetsolicitud;

    private Integer in_cantdetsolicitud;

    private String vc_obsdetsolicitud;

    private String vc_provdetsolicitud;

    private String vc_usuingresa;

    private Date dt_fecingresa;

    private String vc_usumodifica;

    private Date dt_fecmodifica;

    private Boolean bt_habilitado;

    public Integer getIn_iddetsolicitud() {
        return in_iddetsolicitud;
    }

    public void setIn_iddetsolicitud(Integer in_iddetsolicitud) {
        this.in_iddetsolicitud = in_iddetsolicitud;
    }

    public String getVc_artidetsolicitud() {
        return vc_artidetsolicitud;
    }

    public void setVc_artidetsolicitud(String vc_artidetsolicitud) {
        this.vc_artidetsolicitud = vc_artidetsolicitud;
    }

    public Integer getIn_cantdetsolicitud() {
        return in_cantdetsolicitud;
    }

    public void setIn_cantdetsolicitud(Integer in_cantdetsolicitud) {
        this.in_cantdetsolicitud = in_cantdetsolicitud;
    }

    public String getVc_obsdetsolicitud() {
        return vc_obsdetsolicitud;
    }

    public void setVc_obsdetsolicitud(String vc_obsdetsolicitud) {
        this.vc_obsdetsolicitud = vc_obsdetsolicitud;
    }

    public String getVc_provdetsolicitud() {
        return vc_provdetsolicitud;
    }

    public void setVc_provdetsolicitud(String vc_provdetsolicitud) {
        this.vc_provdetsolicitud = vc_provdetsolicitud;
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