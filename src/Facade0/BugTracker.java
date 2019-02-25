
package Facade0;


public class BugTracker 
{
    private boolean activeSprint;
    
    public boolean isActiveSprint() { return activeSprint; }
    public void startSprint() { activeSprint=true; System.out.println("BugTracker.startSprint"); }
    public void finishSprint() { activeSprint=false; System.out.println("BugTracker.finishSprint"); }
}
