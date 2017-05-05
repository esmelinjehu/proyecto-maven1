package com.maven1.beans;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tramite")
public class Tramite {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idTramite;
	//colum(name="tipo_tramite")
	private String tipoTramite;
	private Timestamp fechaTramite;

	public Tramite() {

	}

	public int getIdTramite() {
		return idTramite;
	}

	public void setIdTramite(int idTramite) {
		this.idTramite = idTramite;
	}

	public String getTipoTramite() {
		return tipoTramite;
	}

	public void setTipoTramite(String tipoTramite) {
		this.tipoTramite = tipoTramite;
	}

	public Timestamp getFechaTramite() {
		return fechaTramite;
	}

	public void setFechaTramite(Timestamp fechaTramite) {
		this.fechaTramite = fechaTramite;
	}

}
