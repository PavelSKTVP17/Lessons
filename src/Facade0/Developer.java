package Facade0;

public class Developer 
{
    public void doJobBeforeDeadline( BugTracker bt )
    {
        if( bt.isActiveSprint() )
        { System.out.println(" Dev is work on proj"); }
        else
        { System.out.println(" Dev is read Oracle doc"); }
    }
            
}
