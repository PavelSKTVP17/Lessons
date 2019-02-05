package ObserverJavaJobs;


public interface Observed 
{
    public void addObserver( Observer o);
    public void removeObserver( Observer o);
    public void notifyObservers();
}
