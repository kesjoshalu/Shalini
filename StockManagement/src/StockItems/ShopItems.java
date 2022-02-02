package StockItems;

import java.util.ArrayList;

public class ShopItems {
	
	private int item_no;
	private String item_name;
	private int item_price;
	
	// getter setter 
	
	public int getNo() {
		return this.item_no;
	}

	public void setNo(int no) {
		this.item_no = no;
	}

	public String getName() {
		return this.item_name;
	}

	public void setName(String name) {
		this.item_name = name;
	}

	public int getPrice() {
		return this.item_price;
	}

	public void setPrice(int price) {
		this.item_price = price;
	}
// functions
	public void addNewItem() {
		this.item_no = item_no;
		this.item_name = item_name;
		this.item_price = item_price;
		}
	
	public void displayItems(ArrayList<ShopItems> arr) {
		System.out.println("\n\n");
		if(arr.isEmpty()) {
			System.out.println("No Item...");
			return;
		}
		System.out.println("Item No\t\t Item Name\t\t ItemPrice");
		System.out.println("-------------------------------------------------");
		for (ShopItems shopItems : arr) {
			System.out.println(shopItems.item_no+"\t\t\t\t"+shopItems.item_name+"\t\t\t\t"+shopItems.item_price);
			}
		System.out.println("-------------------------------------------------");
		
		System.out.println("\n\n");
	}

}
