package Exception;


public class Main 
{
    public static void main(String[] args) 
    {
         //System.out.println( args[0] );
        try
        {
            String AA=args[0];
            System.out.println( AA );
        }
        catch(Exception exp)
        {
            System.out.println( exp.toString() );
        }
    }
}
