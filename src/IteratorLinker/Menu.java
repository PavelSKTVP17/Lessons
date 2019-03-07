
package IteratorLinker;

import Iterator2.*;
import java.util.ArrayList;
import java.util.Iterator;



public class Menu extends MenuComponent
{
    ArrayList<MenuComponent> menucomponents = new ArrayList<MenuComponent>();
    String name;
    String description;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void print() 
    {
        System.out.print("\n"+getName() );
        System.out.println(", "+getDescription() );
        System.out.println(" ----------------- " );
        
        Iterator<MenuComponent> iter=menucomponents.iterator();
        while( iter.hasNext() )
        {
            MenuComponent itm = (MenuComponent)iter.next();
            itm.print();
        }
    }
    public String getDescription() { return description;         }
    public String getName() { return name;       }
    public MenuComponent getChild(int i) { return menucomponents.get(i); }
    public void remove(MenuComponent mc) { menucomponents.remove(mc);  }
    public void add(MenuComponent mc) { menucomponents.add(mc);  }
    
    
}
