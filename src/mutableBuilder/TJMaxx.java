package mutableBuilder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * represents TJMaxx store class.
 * https://tjmaxx.com/
 */
public class TJMaxx {

    /**
     * Private lists to hold regular Item objects
     * and OnSaleItem objects that represent items that sell in TJMaxx
     */
    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    /**
     * Public no-args constructor - Instantiates regularItems and onSaleItems lists
     * as new ArrayList
     */
    public TJMaxx() {
        //TODO
        this.regularItems = new ArrayList<Item>();
        this.onSaleItems = new ArrayList<OnSaleItem>();
        
    }

    /**
     * adds an item object to regularItems list
     * @param item
     */
    public void addRegularItem(Item item) {
       regularItems.add(item);
       
    }

    /**
     * adds OnSaleItem object to onSaleItems list
     * @param item
     */
    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);        
    }

    /**
     * getter for regularItems
     * @return
     */
    public List<Item> getRegularItems() {
        //TODO change from null 
        return this.regularItems;
    }

    /**
     * getter for onSaleItems
     * @return
     */
    public List<OnSaleItem> getOnSaleItems() {
         //TODO change from null 
        return this.onSaleItems;
    }

    /**
     * return count of regularItem object
     * @return
     */
    public int regularItemsCount() {
         //TODO change from -1 
    	int count = 0;
    	for(int i = 0; i < regularItems.size(); i++) {
    		count++;
    	}
        return count;
    }

    /**
     * returns count of onSaleItems in TJ Maxx
     * @return
     */
    public int onSaleItemsCount() {
        //TODO change from -1 
        return onSaleItems.size();
    }

    /**
     * returns the name of each item in TJ Maxx starting
     * from regular item then onSaleItems
     * @return
     */
    public List<String> getAllItemNames() {
    	
    	String str = "";
    	ArrayList<String> s = new ArrayList<String>();
       for(int i = 0; i < onSaleItems.size(); i++) {
    	   str+=onSaleItems.get(i).getName();
    	   
       }
       s.add(str);
    //   Collections.addAll(s,str);
       
       return s;
    }

    /**
     * gets catalog number and returns price for the item
     * it will search for the item both regularItems and onsaleonSaleItems
     * @param catalogNumber
     * @returns 0.0 if product cannot be found with that catalognumber
     */
    public double getItemPrice(int catalogNumber)
    {
    	String str = "";
    	
      for(int i = 0; i < regularItems.size(); i++ ) {
    	  if(regularItems.get(i).getCatalogNumber() == catalogNumber) {
    		  str+= regularItems.get(i).getPrice();
    	  }
      }
      for(int j = 0; j < onSaleItems.size(); j++) {
    	  if(onSaleItems.get(j).getCatalogNumber() == catalogNumber) {
    		  str+= onSaleItems.get(j).getPrice();
    	  }
      }
      double num = Double.parseDouble(str);
        return num;
    }

    /**
     * accepts a name then searches
     * amoung onSaleItems. Once it finds, the method will return
     * that OnSaleItem object
     * @param name
     * @return
     */
    public OnSaleItem getOnSaleItem(String name)
    {
        
        
        return null;
    }

    /**
     * removes the item with matching catalogNumber
     * from both regularItems and onSaleItems.
     * Does nothing if not found
     * @param catalogNumber
     */
    public void removeItem(int catalogNumber) {
        
    }

    /**
     * - it accepts a catalog number and finds that item
     * among regularItems and onSaleItems
     * - if it finds the item:
     *   - decrease the count of the Item by 1
     *   - if count reaches 0 after decrementing then remove the product(call removeItem method)
     *
     * @param catalogNumber
     */
    public void buyItem(int catalogNumber) {
       
       
       
       
    }


}


