package com.servicio.ServicioConsulta.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PRICES")
public class Prices {
	/*
	 * Se agrega la columna PRICE_ID, como llave primaria asi mismo es una referencia de negocio.
	 */
	@Id
	@Column(name = "PRICE_ID")
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "BRAND_ID")
	private Brands brands;
	@Column(name = "START_DATE")
	private LocalDateTime startDate;
	@Column(name = "END_DATE")
	private LocalDateTime endDate;
	@Column(name = "PRICE_LIST")
	private Double priceList;
	@Column(name = "PRODUCT_ID")
	private Integer productId;
	@Column(name = "PRIORITY")
	private Integer priority;
	@Column(name = "PRICE")
	private Double price;
	@Column(name = "CURR")
	private String curr;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Brands getBrands() {
		return brands;
	}
	public void setBrands(Brands brands) {
		this.brands = brands;
	}
	public LocalDateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDateTime startDate) {
		this.startDate = startDate;
	}
	public LocalDateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(LocalDateTime endDate) {
		this.endDate = endDate;
	}
	public Double getPriceList() {
		return priceList;
	}
	public void setPriceList(Double priceList) {
		this.priceList = priceList;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getCurr() {
		return curr;
	}
	public void setCurr(String curr) {
		this.curr = curr;
	}
	public Prices(Integer id, Brands brands, LocalDateTime startDate, LocalDateTime endDate, Double priceList,
			Integer productId, Integer priority, Double price, String curr) {
		super();
		this.id = id;
		this.brands = brands;
		this.startDate = startDate;
		this.endDate = endDate;
		this.priceList = priceList;
		this.productId = productId;
		this.priority = priority;
		this.price = price;
		this.curr = curr;
	}
	public Prices() {
		
	}
	 
}
