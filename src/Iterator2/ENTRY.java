package Iterator2;

import java.util.ArrayList;
import java.util.Iterator;


public class ENTRY 
{
    public static void main(String[] args) 
    {
        
        PancakeHouseMenu phm = new PancakeHouseMenu();
        DinerMenu dm = new DinerMenu();
        CafeMenu cm = new CafeMenu();
        ArrayList<Menu> menus = new ArrayList<Menu>();
        menus.add( phm ); menus.add( dm ); menus.add( cm );
        Waitress wtrs = new Waitress( menus );
        wtrs.printMenu();
        /*
        Iterator<MenuItem> iter=phm.menuItems.iterator();
        while( iter.hasNext() )
        {
            MenuItem itm = (MenuItem)iter.next();
            System.out.print( itm.getName()+", " );
            System.out.print( itm.getPrice()+" -- " );
            System.out.println( itm.getDescription() );
        }
        */
    }
}
