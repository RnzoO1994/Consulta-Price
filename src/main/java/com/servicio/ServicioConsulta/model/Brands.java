package com.servicio.ServicioConsulta.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "BRANDS")
public class Brands {
	@Id
	@Column(name="BRAND_ID")
	private Integer id;
	@Column(name = "BRAND_NAME")
	private String nameBrand;
	public Brands() {
		
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNameBrand() {
		return nameBrand;
	}
	public void setNameBrand(String nameBrand) {
		this.nameBrand = nameBrand;
	}
	public Brands(Integer id, String nameBrand) {
	 
		this.id = id;
		this.nameBrand = nameBrand;
	}
	
}
