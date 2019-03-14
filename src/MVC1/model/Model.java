
package MVC1.model;

import java.util.ArrayList;
import java.util.Observable;


public class Model extends Observable
{
    public ArrayList<String> data;

    public Model() {    data=new ArrayList<String>(8);   }
    
    public String get( int index)    {    return data.get(index);   }
    
    public void addDatum( String text)   
    {       
        data.add(text); setChanged(); notifyObservers();
    }
    
    public void removeDatum( String text)   
    {
        int indRem=data.indexOf(text);
        if(indRem>-1)
        {
            data.remove(indRem); setChanged(); notifyObservers();
        }
          
    }
    
    public int size()
    {
        return data.size();
    }
}
