package Exception;


public class Main 
{
    public static void main(String[] args) 
    {
        Exception ex = new Exception("sdfdsf");
        
         //System.out.println( args[0] );
        try
        {
            throw ex;
        //    String AA=args[0];
       //     System.out.println( AA );
        }
        catch(Exception exp)
        {
            System.out.println( exp.getMessage() );
        //    System.out.println( exp.toString() );
        }
        
    }
}
