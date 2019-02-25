
package Facade0;


public class Workflow 
{
    Developer dev= new Developer();
    Job jb=new Job();
    BugTracker bt=new BugTracker();
    public void solveProblem() 
    {
         jb.doJob();
         bt.startSprint();
         dev.doJobBeforeDeadline(bt);
    }
}
