package com.rtm.compras.bean;

import java.io.Serializable;
import java.util.Date;

public class TArticulo implements Serializable {
	private static final long serialVersionUID = 1L;

	private TListado artTipo = new TListado();
	
	private TListado artMarca = new  TListado();
	
	private TListado artModelo = new TListado();
	
	private TListado artMedida = new TListado();
	
	private Integer in_idarticulo;

    private String vc_codarticulo;

    private String vc_desarticulo;

    private String vc_tiparticulo;

    private String vc_mararticulo;

    private String vc_modarticulo;

    private String vc_medarticulo;

    private String vc_equarticulo;

    private String vc_usuingresa;

    private Date dt_fecingresa;

    private String vc_usumodifica;

    private Date dt_fecmodifica;

    private Boolean bt_habilitado;

    private byte[] by_imgarticulo;
    
    private boolean error; 

    public Integer getIn_idarticulo() {
        return in_idarticulo;
    }

    public void setIn_idarticulo(Integer in_idarticulo) {
        this.in_idarticulo = in_idarticulo;
    }

    public String getVc_codarticulo() {
        return vc_codarticulo;
    }

    public void setVc_codarticulo(String vc_codarticulo) {
        this.vc_codarticulo = vc_codarticulo;
    }

    public String getVc_desarticulo() {
        return vc_desarticulo;
    }

    public void setVc_desarticulo(String vc_desarticulo) {
        this.vc_desarticulo = vc_desarticulo;
    }

    public String getVc_tiparticulo() {
        return vc_tiparticulo;
    }

    public void setVc_tiparticulo(String vc_tiparticulo) {
        this.vc_tiparticulo = vc_tiparticulo;
    }

    public String getVc_mararticulo() {
        return vc_mararticulo;
    }

    public void setVc_mararticulo(String vc_mararticulo) {
        this.vc_mararticulo = vc_mararticulo;
    }

    public String getVc_modarticulo() {
        return vc_modarticulo;
    }

    public void setVc_modarticulo(String vc_modarticulo) {
        this.vc_modarticulo = vc_modarticulo;
    }

    public String getVc_medarticulo() {
        return vc_medarticulo;
    }

    public void setVc_medarticulo(String vc_medarticulo) {
        this.vc_medarticulo = vc_medarticulo;
    }

    public String getVc_equarticulo() {
        return vc_equarticulo;
    }

    public void setVc_equarticulo(String vc_equarticulo) {
        this.vc_equarticulo = vc_equarticulo;
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

    public byte[] getBy_imgarticulo() {
        return by_imgarticulo;
    }

    public void setBy_imgarticulo(byte[] by_imgarticulo) {
        this.by_imgarticulo = by_imgarticulo;
    }

	public TListado getArtTipo() {
		return artTipo;
	}

	public void setArtTipo(TListado artTipo) {
		this.artTipo = artTipo;
	}

	public TListado getArtMarca() {
		return artMarca;
	}

	public void setArtMarca(TListado artMarca) {
		this.artMarca = artMarca;
	}

	public TListado getArtModelo() {
		return artModelo;
	}

	public void setArtModelo(TListado artModelo) {
		this.artModelo = artModelo;
	}

	public TListado getArtMedida() {
		return artMedida;
	}

	public void setArtMedida(TListado artMedida) {
		this.artMedida = artMedida;
	}

	public boolean isError() {
		return error;
	}

	public void setError(boolean error) {
		this.error = error;
	}

	
}