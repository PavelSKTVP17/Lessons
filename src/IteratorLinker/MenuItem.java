package IteratorLinker;

import Iterator2.*;
import java.util.Iterator;

public class MenuItem extends MenuComponent
{
    String name;
    String description;
    boolean vegeterion;
    double price;

    public MenuItem(String name, String description, boolean vegeterion, double price) {
        this.name = name;
        this.description = description;
        this.vegeterion = vegeterion;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isVegeterion() {
        return vegeterion;
    }

    public void setVegeterion(boolean vegeterion) {
        this.vegeterion = vegeterion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void print() 
    {
        System.out.print("  "+getName() );
        if(isVegeterion()) System.out.print( "v" );
        System.out.println(", "+getPrice() );
        System.out.print("   --  "+getDescription() );
        
    }
}
