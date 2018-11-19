package io.altar.jseproject.textinterface;

import java.util.Scanner;

import repositories.ProductRepository;

public class TextInterface {
	public static void main(String[] args) {
		initialMenu();
		//ProductRepository pr = ProductRepository.getInstance();
		/*
		 * Scanner sc = new Scanner(System.in); String pressedKeybordsButtons =
		 * sc.nextInt(); System.out.println("pressedKeybordsButtons");
		 */
	}

	public static void initialMenu() {

		Scanner sc = new Scanner(System.in);
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
				System.out.println(newKeys);
				break;
			default:
				System.out.println(
						"ERROR!Please choose 1 to show the list of products, choose 2 to show the list of shelves or choose 3 to quit");
				break;
			}
		} while (newKeys != "1" && newKeys != "2" && newKeys != "3");
		sc.close();
	}

	public static void showProductList() {
		Scanner sc = new Scanner(System.in);
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
			case "1":// createNewProduct();
				System.out.println(
						"We are sorry,but this application is still under construction. Please choose one of the remaining options.");
				break;
			case "2":// editProduct();
				System.out.println(
						"We are sorry,but this application is still under construction. Please choose one of the remaining options.");
				break;
			case "3":// consultProduct()
				System.out.println(
						"We are sorry,but this application is still under construction. Please choose one of the remaining options.");
				break;
			case "4":// removeProduct()
				System.out.println(
						"We are sorry,but this application is still under construction. Please choose one of the remaining options.");
				break;
			case "5":
				initialMenu();
				break;
			default:
				System.out.println(
						"Invalid input! Please choose 1 to create a new product, choose 2 to edit an existing product, choose 3 to see the detail of a specific product, choose 4 to remove a product or choose 5 to return to the previous screen.");
				break;

			}
		} while (newKeys != "5");
		sc.close();
	}

	public static void showShelfList() {
		Scanner sc = new Scanner(System.in);
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
				case "1":// createNewShelf()
					System.out.println(
							"We are sorry,but this application is still under construction. Please choose one of the remaining options.");
					break;
				case "2":// editShelf()
					System.out.println(
							"We are sorry,but this application is still under construction. Please choose one of the remaining options.");
					break;
				case "3":// consultShelf()
					System.out.println(
							"We are sorry,but this application is still under construction. Please choose one of the remaining options.");
					break;
				case "4":// removeShelf()
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
		} while (newKeys != "5");
		sc.close();

	}
}