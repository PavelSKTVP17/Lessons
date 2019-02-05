package Exception;


public class Main 
{
    public static void main(String[] args) 
    {
        /*
        //Exception ex = new Exception("sdfdsf");
         
         //System.out.println( args[0] );
        try
        {
         //   throw ex;
            throw new Exception("sdfdsf dfgdfg");
        //    String AA=args[0];
       //     System.out.println( AA );
        }
        catch(Exception exp)
        {
            System.out.println( exp.getMessage() );
        //    System.out.println( exp.toString() );
        }
        */
        /*
        try
        {
            MyClass mc = new MyClass();
            mc.method1();
        }
        catch(Exception exp)
        {
           exp.printStackTrace();
        }
        */
        method1();
    }
    public static void method1()
    {
        method2();
    }
    public static void method2()
    {
        method3();
    }
    public static void method3()
    {
        StackTraceElement[] arr1=Thread.currentThread().getStackTrace();
        for (int i = 0; i < arr1.length; i++) 
        {
            System.out.println( arr1[i].getMethodName() ); 
        }
    }
}
class MyClass
{
    public void method1() throws Exception
    {
        Exception ex = new Exception("sdfdsf"); throw ex;
    }
    
}
class StackTR
{
    
}