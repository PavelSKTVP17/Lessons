
package State3;

import java.util.Random;


public class NoQuarterState implements State
{
    Random randomNumber = new Random( System.currentTimeMillis() );
    GumballMachine gumbMach;
    
    public NoQuarterState(GumballMachine gumbMach) {
        this.gumbMach = gumbMach;   }
    
    @Override
    public void insertQuarter() 
    {
        System.out.println(" U  inserted a quarter");
        gumbMach.setState( gumbMach.getHasQuarterState() );
    }

    @Override
    public void turnCrank() 
    {
        System.out.println(" U turned, but there is no quarter");
    }

    @Override
    public void ejectQuarter() 
    {
        System.out.println(" U have not inserted a quarter");
    }

    @Override
    public void refill() 
    {
       
    }

    @Override
    public void dispense() 
    {
        System.out.println(" U need to pay first");
    }
}
