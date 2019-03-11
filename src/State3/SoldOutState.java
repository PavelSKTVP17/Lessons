package State3;

import java.util.Random;

public class SoldOutState implements State
{
    Random randomNumber = new Random( System.currentTimeMillis() );
    GumballMachine gumbMach;

    public SoldOutState(GumballMachine gumbMach) {
        this.gumbMach = gumbMach;
    }
    
    @Override
    public void insertQuarter() 
    {
        System.out.println("U can't insert a quater, the machine is sold out");
    }

    @Override
    public void turnCrank() 
    {
        System.out.println("U turned, but thera are no gumballs");
    }

    @Override
    public void ejectQuarter() 
    {
       System.out.println("U can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void refill() 
    {
       gumbMach.setState( gumbMach.getNoQuarterState());
    }

    @Override
    public void dispense() 
    {
        System.out.println("No gumball dispensed ");
    }
    
    @Override
    public String toString() 
    {
        return "Sold out";
    }
}
