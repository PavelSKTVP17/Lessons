package Facade0;

public class ENTRY 
{
    public static void main(String[] args) 
    {
        /*
        Job jb = new Job();
        jb.doJob();
        
        BugTracker bt = new BugTracker();
        bt.startSprint();
        
        Developer dv = new Developer();
        dv.doJobBeforeDeadline(bt);
        
        bt.finishSprint();
        dv.doJobBeforeDeadline(bt);
        */
        Workflow wrfl=new Workflow();
        wrfl.solveProblem();
        wrfl.solveProblem();
    }
    
}
