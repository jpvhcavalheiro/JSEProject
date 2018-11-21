package io.altar.jseproject.textinterface;

import java.util.Scanner;
import repositories.ProductRepository;
import repositories.ShelfRepository;
import repositories.EntityRepository;
import io.altar.jseproject.model.Product;
import io.altar.jseproject.model.Shelf;
import java.util.ArrayList;
import java.util.Iterator;

public class TextInterface {
	static ProductRepository productRepository1 = ProductRepository.getInstance();
	static ShelfRepository shelfRepository1 = ShelfRepository.getInstance();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		initialMenu();
	}

	public static void initialMenu() {
		String newKeys = "";
		do {
			System.out.println("Please choose one of the following options:");
			System.out.println("1) Show list of products");
			System.out.println("2) Show list of shelves");
			System.out.println("3) Quit");
			newKeys = sc.nextLine();

			switch (newKeys) {
			case "1":
				showProductList();
				break;
			case "2":
				showShelfList();
				break;
			case "3":
				System.out.println("Application out.");
				break;
			default:
				System.out.println(
						"ERROR!Please choose 1 to show the list of products, choose 2 to show the list of shelves or choose 3 to quit");
				break;
			}
		} while (!newKeys.equals("1") && !newKeys.equals("2") && !newKeys.equals("3"));

	}

	public static void showProductList() {
		String newKeys = "";
		do {
			System.out.println("Please choose one of the following options:");
			System.out.println("1) Create a new product");
			System.out.println("2) Edit an existing product");
			System.out.println("3) Consult the details of a certain product");
			System.out.println("4) Remove a product");
			System.out.println("5) Return to previous screen");
			newKeys = sc.nextLine();
			switch (newKeys) {
			case "1":
				createProduct();
				break;
			case "2": // editProduct();
				System.out.println(
						"We are sorry,but this application is still under construction. Please choose one of the remaining options.");
				break;
			case "3":
				consultProduct();
				break;
			case "4":
				removeProduct();
				/*
				 * System.out.println(
				 * "We are sorry,but this application is still under construction. Please choose one of the remaining options."
				 * );
				 */
				break;
			case "5":
				initialMenu();
				break;
			default:
				System.out.println(
						"Invalid input! Please choose 1 to create a new product, choose 2 to edit an existing product, choose 3 to see the detail of a specific product, choose 4 to remove a product or choose 5 to return to the previous screen.");
				break;
			}
		} while (!newKeys.equals("5"));
	}

	public static void showShelfList() {
		String newKeys = "";
		do {
			System.out.println("Please choose one of the following options:");
			System.out.println("1) Create a new shelf");
			System.out.println("2) Edit an existing shelf");
			System.out.println("3) Consult the details of a certain shelf");
			System.out.println("4) Remove a shelf");
			System.out.println("5) Return to previous screen");
			newKeys = sc.nextLine();
			switch (newKeys) {
			case "1":
				createShelf();
				break;
			case "2":// editShelf();
				System.out.println(
						"We are sorry,but this application is still under construction. Please choose one of the remaining options.");
				break;
			case "3":
				consultShelf();
				break;
			case "4":// removeShelf();
				System.out.println(
						"We are sorry,but this application is still under construction. Please choose one of the remaining options.");
				break;
			case "5":
				initialMenu();
			default:
				System.out.println(
						"Invalid input! Please choose 1 to create a new shelf, choose 2 to edit an existing shelf, choose 3 to see the detail of a specific shelf, choose 4 to remove a shelf or choose 5 to return to the previous screen.");
				break;
			}
		} while (!newKeys.equals("5"));

	}

	/**
	 * createProduct is a function which receives in the console a price, a
	 * discount and a iva of a product and inserts a product with these features
	 * in the product hashmap.
	 * 
	 */
	public static void createProduct() {
		System.out.println("Please insert price:");
		int price = sc.nextInt();
		System.out.println("Please insert discount:");
		int discount = sc.nextInt();
		System.out.println("Please insert iva:");
		int iva = sc.nextInt();
		sc.nextLine();
		ArrayList<Long> shelvesListAssociatedWithProduct = new ArrayList<Long>();
		Product product1 = new Product(shelvesListAssociatedWithProduct, discount, iva, price);
		productRepository1.createEntity(product1);
		Iterator<Product> it = productRepository1.showAll();
		while (it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}

	/**
	 * createShelf is a method which receives input from console, including
	 * shelf capacity, rent price and the product id which is to be put in shelf
	 * and insert it in the shelf hash map.
	 */

	public static void createShelf() {
		System.out.println("Please insert shelf capacity:");
		String capacity1 = sc.nextLine();
		System.out.println("Please insert a rent price:");
		int rentPrice1 = sc.nextInt();
		System.out.println(
				"Please insert the product id you want to insert in this shelf(if you dont want to insert anything please press just enter:");
		long productIdInShelf1 = sc.nextLong();
		sc.nextLine();
		Shelf shelf1 = new Shelf(capacity1, productIdInShelf1, rentPrice1);
		shelfRepository1.createEntity(shelf1);
		Iterator<Shelf> it = shelfRepository1.showAll();
		while (it.hasNext()) {
			System.out.println(it.next().shelfToString());
		}
		long shelf1Id = shelf1.getId();
		productRepository1.fetchEntityById(productIdInShelf1).addNewShelfToShelvesList(shelf1Id);
	}

	/**
	 * consultProduct receives a specific id of a product and shows its features
	 * or shows all products should all be chosen
	 */
	public static void consultProduct() {
		System.out.println("Insert a specific product id to show its features or insert all to show all products:");
		String productIdSearch = sc.nextLine();
		if (productIdSearch.equals("all")) {
			Iterator<Product> it = productRepository1.showAll();
			while (it.hasNext()) {
				System.out.println(it.next().toString());
			}
		} else {
			System.out.println(productRepository1.fetchEntityById(Long.parseLong(productIdSearch)).toString());
		}
	}

	/**
	 * consultShelf receives a specific id of a shelf and shows its features or
	 * shows all shelves should all be chosen
	 */
	public static void consultShelf() {
		System.out.println("Insert a specific shelf id to show its features or insert all to show all shelves:");
		String shelfIdSearch = sc.nextLine();
		if (shelfIdSearch.equals("all")) {
			Iterator<Shelf> it = shelfRepository1.showAll();
			while (it.hasNext()) {
				System.out.println(it.next().shelfToString());
			}
		} else {
			System.out.println(shelfRepository1.fetchEntityById(Long.parseLong(shelfIdSearch)).shelfToString());
		}
	}

	/**
	 * 
	 */
	public static void removeProduct() {
		System.out.println("Please insert the product id you want to remove:");
		String productIdToRemove = sc.nextLine();
		System.out.println("Are you sure you want to remove the product whose id is " + productIdToRemove + "?");
		String confirmationOfProductIdToRemove = sc.nextLine();
		if (confirmationOfProductIdToRemove.equals("yes")) {
			productRepository1.deleteEntityById(Long.parseLong(productIdToRemove));
		}
	}

	/**
	 * 
	 */
	public static void removeShelf() {
		System.out.println("Please insert the shelf id you want to remove:");
		String shelfIdToRemove=sc.nextLine();
	}
}
