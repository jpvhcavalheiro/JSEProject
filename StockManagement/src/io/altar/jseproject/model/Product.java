package io.altar.jseproject.model;

public class Product {
	private int productId;
	private Shelf[] shelvesList ;
	private int discount;
	private int iva;
	private int pvp;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public Shelf[] getShelvesList() {
		return shelvesList;
	}
	public void setShelvesList(Shelf[] shelvesList) {
		this.shelvesList = shelvesList;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public int getIva() {
		return iva;
	}
	public void setIva(int iva) {
		this.iva = iva;
	}
	public int getPvp() {
		return pvp;
	}
	public void setPvp(int pvp) {
		this.pvp = pvp;
	}
	
}