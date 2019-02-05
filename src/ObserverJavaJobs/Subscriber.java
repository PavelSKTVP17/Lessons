
package ObserverJavaJobs;

import java.util.List;


public class Subscriber implements Observer
{
    public String Name;

    public Subscriber(String Name) 
    {
        this.Name = Name;
    }
    
    @Override
    public void HandleEvent(List<String> lst) 
    {
        System.out.println(Name+": I've recieved the list of jobs. size="+lst.size() );  
    }
    
}
