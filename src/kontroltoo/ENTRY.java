package kontroltoo;


public class ENTRY 
{
    public static void main(String[] args) 
    {
        Engine E=new Engine();
        E.Start();
        //
        Thread thrdStop=new Thread( ()->{     
            try
            {
                Thread.sleep(1); 
                E.Stop();
            }
            catch( Exception e )
            {
                e.printStackTrace();
            }
        });
        thrdStop.start();
    }
    
}
