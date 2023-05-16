package com.servicio.ServicioConsulta.model;

import java.time.LocalDateTime;

public class ConsultaPrecioRequest {
	
	private Integer productId;
	private Integer brandId;
	private LocalDateTime dateApplication;
	
	
	public ConsultaPrecioRequest(Integer productId, Integer brandId, LocalDateTime dateApplication) {
		super();
		this.productId = productId;
		this.brandId = brandId;
		this.dateApplication = dateApplication;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getBrandId() {
		return brandId;
	}
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}
	public LocalDateTime getDateApplication() {
		return dateApplication;
	}
	public void setDateApplication(LocalDateTime dateApplication) {
		this.dateApplication = dateApplication;
	}
	
}
