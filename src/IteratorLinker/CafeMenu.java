package IteratorLinker;

import Iterator2.*;
import java.util.HashMap;
import java.util.Iterator;

public class CafeMenu implements Menu
{
    HashMap<String, MenuItem> items = new HashMap<>(8);
    
    public CafeMenu()
    {
        addItem("CafeMenu menu position 1", 	" Description 1", 	true,	2.99);
        addItem("CafeMenu menu position 2", 	" Description 2", 		false,	2.99);
        addItem("CafeMenu menu position 3",	" Description 3",true,	3.49);
        addItem("CafeMenu menu position 4", "Description 4",	true,	3.59);
    }

    public HashMap<String, MenuItem> getItems() {
        return items;
    }

    public void setItems(HashMap<String, MenuItem> items) {
        this.items = items;
    }
    
    
    
    
    public void addItem(String name, String description,     boolean vegetarian, double price) 
    {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        items.put( menuItem.getName() ,menuItem);
    }
    
    @Override
    public Iterator<?> createIterator() 
    {
        return items.values().iterator();
    }
    
}
