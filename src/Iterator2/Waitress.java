package Iterator2;

import java.util.ArrayList;
import java.util.Iterator;

public class Waitress 
{
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus) {
        this.menus = menus;
    }
    
    public void printMenu()
    {
        Iterator<?> iter = menus.iterator();
        while( iter.hasNext() )
        {
            Menu mn = (Menu)iter.next();
            printMenu( mn.createIterator() );
        }
    }
    void printMenu(Iterator<?> iter)
    {
        while( iter.hasNext() )
        {
            MenuItem itm = (MenuItem)iter.next();
            System.out.print( itm.getName()+", " );
            System.out.print( itm.getPrice()+" -- " );
            System.out.println( itm.getDescription() );
        }
    }
}
