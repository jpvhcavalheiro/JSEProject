package io.altar.jseproject.model;
import java.util.ArrayList;

public class Product extends Entity {
	private ArrayList <Shelf> shelvesList;
	private int discount;
	private int iva;
	private int pvp;
	public Product(ArrayList<Shelf> shelvesList, int discount, int iva, int pvp) {
		super();
		this.shelvesList = shelvesList;
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
	}
	public ArrayList<Shelf> getShelvesList() {
		return shelvesList;
	}
	public void setShelvesList(ArrayList<Shelf> shelvesList) {
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
	@Override
	public String toString() {
		return "Product"+getId()+" [shelvesList=" + shelvesList + ", discount=" + discount + ", iva=" + iva + ", pvp=" + pvp + "]";
	}

	
}
