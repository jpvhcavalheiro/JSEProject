package io.altar.jseproject.model;
import java.util.ArrayList;

public class Product extends Entity {
	private ArrayList <Long> shelvesIdList;
	private int discount;
	private int iva;
	private int pvp;
	
	

	
	
	public Product(ArrayList<Long> shelvesIdList, int discount, int iva, int pvp) {
		super();
		this.shelvesIdList = shelvesIdList;
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
	}
	/**
	 * addNewShelfToShelvesList receives an id of a shelf where the product will be inserted and insert it
	 * to the list of shelves which contain this product
	 * @param newShelfId the id of a new shelf which will contain this product
	 */
	//esta funcao esta errada
	//em nenhuma parte do codigo se inicializa o shelfidlist como estando vazio
	public void addNewShelfToShelvesList(long newShelfId) {
		shelvesIdList.add(newShelfId);
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
		return "Product"+getId()+" [shelvesList=" + shelvesIdList + ", discount=" + discount + ", iva=" + iva + ", pvp=" + pvp + "]";
	}
}
