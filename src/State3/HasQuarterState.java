
package State3;

import java.util.Random;


public class HasQuarterState implements State
{
    Random randomNumber = new Random( System.currentTimeMillis() );
    GumballMachine gumbMach;
    
    public HasQuarterState(GumballMachine gumbMach) {
        this.gumbMach = gumbMach;
    }
    
    @Override
    public void insertQuarter() 
    {
        System.out.println(" U cnt insert anothe quarter");
    }

    @Override
    public void turnCrank() 
    {
        System.out.println("You turned...");
        int winner=randomNumber.nextInt(10);
        if( (winner==0) && (gumbMach.getCount())>1) 
            gumbMach.setState( gumbMach.getWinnerState() );
        else
            gumbMach.setState( gumbMach.getSoldState() );
        
    }

    @Override
    public void ejectQuarter() 
    {
       System.out.println("Quarter ejected");
       gumbMach.setState( gumbMach.getNoQuarterState() );
    }

    @Override
    public void refill() 
    {
       
    }

    @Override
    public void dispense() 
    {
        System.out.println("No gumball dispensed ");
    }
    
    @Override
    public String toString() 
    {
        return "Waiting for turn of crank";
    }
}
