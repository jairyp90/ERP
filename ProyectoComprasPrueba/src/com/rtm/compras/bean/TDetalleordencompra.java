package com.rtm.compras.bean;

import java.util.Date;

public class TDetalleordencompra {
    private Integer in_iddetordcompra;

    private Long db_cantdetordcompra;

    private Integer id_idunidetordcompra;

    private String vc_desunidetordcompra;

    private String vc_desdetordcompra;

    private Long vc_desprecuordcompra;

    private Long vc_destotalordcompra;

    private String vc_usuingresa;

    private Date dt_fecingresa;

    private String vc_usumodifica;

    private Date dt_fecmodifica;

    private Boolean bt_habilitado;

    public Integer getIn_iddetordcompra() {
        return in_iddetordcompra;
    }

    public void setIn_iddetordcompra(Integer in_iddetordcompra) {
        this.in_iddetordcompra = in_iddetordcompra;
    }

    public Long getDb_cantdetordcompra() {
        return db_cantdetordcompra;
    }

    public void setDb_cantdetordcompra(Long db_cantdetordcompra) {
        this.db_cantdetordcompra = db_cantdetordcompra;
    }

    public Integer getId_idunidetordcompra() {
        return id_idunidetordcompra;
    }

    public void setId_idunidetordcompra(Integer id_idunidetordcompra) {
        this.id_idunidetordcompra = id_idunidetordcompra;
    }

    public String getVc_desunidetordcompra() {
        return vc_desunidetordcompra;
    }

    public void setVc_desunidetordcompra(String vc_desunidetordcompra) {
        this.vc_desunidetordcompra = vc_desunidetordcompra;
    }

    public String getVc_desdetordcompra() {
        return vc_desdetordcompra;
    }

    public void setVc_desdetordcompra(String vc_desdetordcompra) {
        this.vc_desdetordcompra = vc_desdetordcompra;
    }

    public Long getVc_desprecuordcompra() {
        return vc_desprecuordcompra;
    }

    public void setVc_desprecuordcompra(Long vc_desprecuordcompra) {
        this.vc_desprecuordcompra = vc_desprecuordcompra;
    }

    public Long getVc_destotalordcompra() {
        return vc_destotalordcompra;
    }

    public void setVc_destotalordcompra(Long vc_destotalordcompra) {
        this.vc_destotalordcompra = vc_destotalordcompra;
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