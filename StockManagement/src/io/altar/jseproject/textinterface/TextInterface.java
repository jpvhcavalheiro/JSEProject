package io.altar.jseproject.textinterface;
import java.util.Scanner;

public class TextInterface {
	public static void main(String[]args) {
	initialMenu();
	
	
		
	/*Scanner sc = new Scanner(System.in);
    String pressedKeybordsButtons = sc.nextInt();
    System.out.println("pressedKeybordsButtons");*/
	}
	public static void initialMenu(){
		System.out.println("Please choose one of the following options:");
		System.out.println("1) Show list of products");
		System.out.println("2) Show list of shelves");
		System.out.println("3) Quit");
		Scanner sc = new Scanner(System.in);
		String pressedKey = sc.nextLine();
		if(pressedKey.length()>1){
			System.out.println("Error! Please insert just one character (number).");
			initialMenu();
		} else {
			switch(pressedKey){
	    	case "1":showProductList(); //definir esta funcao
	    	break;
	    	case "2":showShelfList(); //definir esta funcao
	    	break;
	    	case "3":break;
	    	default:System.out.println("Invalid input! Please choose 1 to show the list of products, choose 2 to show the list of shelves or choose 3 to quit.");
	    	initialMenu();
	    	break;
	    }
	    sc.close();
		}
	}
	
	public static void showProductList(){
		System.out.println("Please choose one of the following options:");
		System.out.println("1) Create a new product");
		System.out.println("2) Edit an existing product");
		System.out.println("3) Consult the details of a certain product");
		System.out.println("4) Remove a product");
		System.out.println("5) Return to previous screen");
		Scanner sc = new Scanner(System.in);
	    String pressedKey = sc.nextLine();
	    if(pressedKey.length()>1){
	    	System.out.println("Error! Please insert just one character (number).");
	    	showProductList();
	    } else {
	    	switch(pressedKey){
	    	case "1"://createNewProduct();
	    	System.out.println("We are sorry,but this application is still under construction. Please choose one of the remaining options.");
	    	showProductList();
	    	break;
	    	case "2"://editProduct();
	    	System.out.println("We are sorry,but this application is still under construction. Please choose one of the remaining options.");
	    	showProductList();
	    	break;
	    	case "3"://consultProduct()
	    	System.out.println("We are sorry,but this application is still under construction. Please choose one of the remaining options.");
	    	showProductList();
	    	break;
	    	case "4"://removeProduct()
	    	System.out.println("We are sorry,but this application is still under construction. Please choose one of the remaining options.");
	    	showProductList();
	    	break;
	    	case "5": initialMenu();
	    	default:System.out.println("Invalid input! Please choose 1 to create a new product, choose 2 to edit an existing product, choose 3 to see the detail of a specific product, choose 4 to remove a product or choose 5 to return to the previous screen.");   	showProductList();
	    	break;
	    }
	    sc.close();
	    }
	    
	}
	public static void showShelfList(){
		System.out.println("Please choose one of the following options:");
		System.out.println("1) Create a new shelf");
		System.out.println("2) Edit an existing shelf");
		System.out.println("3) Consult the details of a certain shelf");
		System.out.println("4) Remove a shelf");
		System.out.println("5) Return to previous screen");
		Scanner sc = new Scanner(System.in);
	    String pressedKey = sc.nextLine();
	    if(pressedKey.length()>1){
	    	System.out.println("Error! Please insert just one character (number).");
	    	showShelfList();
	    } else {
	    	switch(pressedKey){
	    	case "1"://createNewShelf()
	    	System.out.println("We are sorry,but this application is still under construction. Please choose one of the remaining options.");
	    	showShelfList();
	    	break;
	    	case "2"://editShelf()
	    	System.out.println("We are sorry,but this application is still under construction. Please choose one of the remaining options.");
	    	showShelfList();
	    	break;
	    	case "3"://consultShelf()
	    	System.out.println("We are sorry,but this application is still under construction. Please choose one of the remaining options.");
	    	showShelfList();
	    	break;
	    	case "4"://removeShelf()
	    	System.out.println("We are sorry,but this application is still under construction. Please choose one of the remaining options.");
	    	showShelfList();
	    	break;
	    	case "5": initialMenu();
	    	default:System.out.println("Invalid input! Please choose 1 to create a new shelf, choose 2 to edit an existing shelf, choose 3 to see the detail of a specific shelf, choose 4 to remove a shelf or choose 5 to return to the previous screen.");
	    	showShelfList();
	    	break;
	    }
	    sc.close();
	    }
	    
	}
}