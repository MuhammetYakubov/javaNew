package ArraysList;



public class Mall {
	public static void main(String[] args) {

		Store myStore = new Store("Cool Books", "600 N Michigan ave,Chigaco Il");

		Item book1 = new Item("Start up", 32.33);
		
		myStore.addItem(book1);
		
		Item mouse = new Item("Computer", 321.2);
		Item pen = new Item("daweds", 233.12);
		
		myStore.addItem(mouse);
		myStore.addItem(book1);
		myStore.addItem(pen);
		
		myStore.seeInventory();
		
		System.out.println(myStore.numberOfItem);
	}
}
