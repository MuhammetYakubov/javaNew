package ArraysList;

import java.util.ArrayList;

public class Store {

	String name;
	String adress;
	ArrayList <Item> storeItems = new ArrayList<>();
	int numberOfItem;
	
	
	public Store (String name, String adress) {
		
		this.name = name;
		this.adress = adress;
		
	}

	public void addItem(Item itemm) {
		storeItems.add(itemm);
		numberOfItem++;
		
	}
	

	public void seeInventory() {
//		for(int i = 0 ; i < storeItems.size(); i++) {
//			
//			storeItems.get(i).info();
//			
//		}
		for(Item i:storeItems) {
			i.info();
		}
	}
}
