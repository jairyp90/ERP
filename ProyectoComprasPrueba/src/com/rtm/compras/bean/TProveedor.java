package com.rtm.compras.bean;

import java.util.Date;

public class TProveedor {
    private Integer in_idproveedor;

    private String vc_nomproveedor;

    private String vc_rucproveedor;

    private String vc_dirproveedor;

    private String vc_tel1proveedor;

    private String vc_tel2proveedor;

    private String vc_corrproveedor;

    private String vc_usuingresa;

    private Date dt_fecingresa;

    private String vc_usumodifica;

    private Date dt_fecmodifica;

    private Boolean bt_habilitado;

    public Integer getIn_idproveedor() {
        return in_idproveedor;
    }

    public void setIn_idproveedor(Integer in_idproveedor) {
        this.in_idproveedor = in_idproveedor;
    }

    public String getVc_nomproveedor() {
        return vc_nomproveedor;
    }

    public void setVc_nomproveedor(String vc_nomproveedor) {
        this.vc_nomproveedor = vc_nomproveedor;
    }

    public String getVc_rucproveedor() {
        return vc_rucproveedor;
    }

    public void setVc_rucproveedor(String vc_rucproveedor) {
        this.vc_rucproveedor = vc_rucproveedor;
    }

    public String getVc_dirproveedor() {
        return vc_dirproveedor;
    }

    public void setVc_dirproveedor(String vc_dirproveedor) {
        this.vc_dirproveedor = vc_dirproveedor;
    }

    public String getVc_tel1proveedor() {
        return vc_tel1proveedor;
    }

    public void setVc_tel1proveedor(String vc_tel1proveedor) {
        this.vc_tel1proveedor = vc_tel1proveedor;
    }

    public String getVc_tel2proveedor() {
        return vc_tel2proveedor;
    }

    public void setVc_tel2proveedor(String vc_tel2proveedor) {
        this.vc_tel2proveedor = vc_tel2proveedor;
    }

    public String getVc_corrproveedor() {
        return vc_corrproveedor;
    }

    public void setVc_corrproveedor(String vc_corrproveedor) {
        this.vc_corrproveedor = vc_corrproveedor;
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