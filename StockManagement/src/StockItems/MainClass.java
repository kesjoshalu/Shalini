package StockItems;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
	
	private static Scanner sc;
	static ArrayList<ShopItems> shopList = new ArrayList<ShopItems>();
	static ArrayList<Customer> custList = new ArrayList<Customer>();

	static void menu() {
		System.out.println("1. Add New Items ");
		System.out.println("2. Display All Item");
		System.out.println("3. Add Customer Details");
		System.out.println("0. Exit");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opt;
		sc = new Scanner(System.in);
		
		do {
			ShopItems s = new ShopItems();
			menu();
			opt = sc.nextInt();
			switch (opt) {
			case 1:
				System.out.println("Enter Item No :");
				s.setNo(sc.nextInt());
				System.out.println("Enter Item_Name ");
				sc = new Scanner(System.in);
				sc.next();
				s.setName(sc.toString());
				System.out.println("Enter Item_Price");
				s.setPrice(sc.nextInt());
				s.addNewItem();
				shopList.add(s);
				break;
				
			case 2:
				s.displayItems(shopList);
				break;
			case 3:
				sellOutDetails();
				break;

			default:
				break;
			}
		}
		while (opt !=0);

	}

	private static void sellOutDetails() {
		sc = new Scanner(System.in);
		Customer c = new Customer();
		String cus_name = "";
		
		System.out.println("Enter Item No: ");
		c.setItem_no(sc.nextInt());
		System.out.println("Enter Customer Name:");
		c.setCustomer_name(sc.next());
		System.out.println("Enter the purchased quantity");
		c.setPurchase_qty(sc.nextInt());
		
//		if(cus_name == "") {
//			System.out.println("Enter Customer Name: ");
//			c.setCustomer_name(sc.nextLine());
//			cus_name = c.getCustomer_name();
//			}
//			else
//				c.setCustomer_name(cus_name);
		
		c.AddCustomerDetails(c);
		custList.add(c);
		
		
		System.out.println("Do You Have More Items? (Yes/No) ");
		String choice = " ";
		
		sc.next();
		if(choice.contains("Yes") == true) {
			//again input and update data of customer
			sellOutDetails();
		}
		else
		{
			c.DisplayCustomerBill(custList , c.getCustomer_name(), shopList);
		}
	
		
		
		
	}

}

