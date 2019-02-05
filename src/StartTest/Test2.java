
package StartTest;


public class Test2 
{

    static{ System.out.println("3");}
    
    public Test2()
    {
        System.out.println("1");
        Test2.register();
    }
    
    public static void main(String[] args) 
    {
        
        System.out.println("2");
        new Test2();
        
        
    }
    public static synchronized void register() 
    {
        System.out.println("4");
    }
}
