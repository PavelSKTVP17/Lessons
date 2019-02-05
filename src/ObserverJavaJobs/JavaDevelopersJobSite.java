
package ObserverJavaJobs;

import java.util.ArrayList;
import java.util.List;


public class JavaDevelopersJobSite implements Observed
{

    List<String> vacancies = new ArrayList<>();
    List<Observer> subscribers = new ArrayList<>();
    @Override
    public void addObserver(Observer o) 
    {
        subscribers.add(o);
    }

    @Override
    public void removeObserver(Observer o) 
    {
        subscribers.remove(o);
    }

    @Override
    public void notifyObservers() 
    {
        for( Observer obs : subscribers) obs.HandleEvent(vacancies);
    }
    
    public void addVacancy(String str ) 
    {
        vacancies.add( str );
        notifyObservers();
    }
    public void removeVacancy(String str ) 
    {
        vacancies.remove( str );
        notifyObservers();
    }
}
