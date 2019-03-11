
package State3;

public class ENTRY 
{
    public static void main(String[] args) 
    {
        GumballMachine machine = new GumballMachine(10);
        
        System.out.println( machine );
        
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        
        System.out.println( machine );
        
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        
        System.out.println( machine );
        
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
         
        System.out.println( machine );
        
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        
        System.out.println( machine );
        
        machine.insertQuarter();
        machine.turnCrank();
        machine.insertQuarter();
        machine.turnCrank();
        
        System.out.println( machine );
    }
}
