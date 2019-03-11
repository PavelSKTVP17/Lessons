
package State3;

import java.util.Random;


public class SoldState implements State
{
    GumballMachine gumbMach;
    
    public SoldState(GumballMachine gumbMach) {
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
    public void refill()    {      }

    @Override
    public void dispense() 
    {
        gumbMach.releaseBall();
        if(gumbMach.getCount()>0)
        {
            gumbMach.setState(gumbMach.getNoQuarterState());
        } else
        {
            System.out.println( "Oops, out of gumballs!" );
            gumbMach.setState( gumbMach.getSoldOutState() );
        }
    }
    
    @Override
    public String toString() 
    {
        return "Dispensing a gumball";
    }
}
