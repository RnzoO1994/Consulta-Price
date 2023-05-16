package com.servicio.ServicioConsulta.model;

import java.time.LocalDateTime;

public class ConsultaPrecioResponse {
	private Integer productId;
	private Integer brandId;
	private Double price;
	private LocalDateTime applicationDate;
	private Double finalPrice;
	 
	public ConsultaPrecioResponse(Integer productId, Integer brandId, Double price, LocalDateTime applicationDate,
			Double finalPrice) {
		super();
		this.productId = productId;
		this.brandId = brandId;
		this.price = price;
		this.applicationDate = applicationDate;
		this.finalPrice = finalPrice;
	}

	public ConsultaPrecioResponse() {
		
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public LocalDateTime getApplicationDate() {
		return applicationDate;
	}

	public void setApplicationDate(LocalDateTime applicationDate) {
		this.applicationDate = applicationDate;
	}

	public Double getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(Double finalPrice) {
		this.finalPrice = finalPrice;
	}
 
	
}
