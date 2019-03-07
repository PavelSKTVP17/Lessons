package IteratorLinker;

import Iterator2.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Waitress 
{
    MenuComponent allmenus;

    public Waitress( MenuComponent menus) 
    {
        this.allmenus = menus;
    }
    
    public void printMenu()
    {
        allmenus.print();
    }
    
}
