
package State3;

import java.util.Random;


public class WinnerState implements State
{
    GumballMachine gumbMach;
    
    public WinnerState(GumballMachine gumbMach) {
        this.gumbMach = gumbMach;
    }
    
    @Override
    public void insertQuarter() 
    {
        
    }

    @Override
    public void turnCrank() 
    {
        
    }

    @Override
    public void ejectQuarter() 
    {
       
    }

    @Override
    public void refill()   {    }

    @Override
    public void dispense() 
    {
        gumbMach.releaseBall();
        if(gumbMach.getCount()==0)
        {
            gumbMach.setState(gumbMach.getSoldOutState());
        } else
        {
            gumbMach.releaseBall();
            System.out.println("YOU'RE WINNER! You got two gumballs for your quarter");
            if(gumbMach.getCount()>0)
            {
                gumbMach.setState(gumbMach.getNoQuarterState());
            }
            else
            {
                System.out.println("Oops, Out of gumballs");
                gumbMach.setState(gumbMach.getSoldOutState());
            }
        }
    }
    
    @Override
    public String toString() 
    {
        return "Dispensing two gumballs, because you are winner!";
    }
}
