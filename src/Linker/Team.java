
package Linker;

import java.util.ArrayList;


public class Team 
{
    private ArrayList<Developer> devs=new ArrayList<Developer>(8);
    
    public void addDeveloper( Developer d) { devs.add(d);}
    public void removeDeveloper( Developer d) { devs.add(d);}
    public void createproject()
    {
        System.out.println("Team is starting to work ...");
        devs.forEach( (dvlp) ->{
        dvlp.writeCode();
        });
    }
}
