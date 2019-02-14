package Threads_1;

import java.util.logging.Logger;


public class Main 
{
    public static void main(String[] args) 
    {
        /*
        System.out.println( Thread.currentThread().getName() );
        Thread thrd = new Thread();
        thrd.start();
        System.out.println( thrd.getName() ); 
        */
        /*
        Thread thrd = new Thread( new Recipe() );
        thrd.start();
        thrd.setName("cooking1");
        System.err.println( thrd.getName() );
        System.err.println( Thread.currentThread().getName() );
        */
        Thread thrd = new Thread( new Recipe() );
        thrd.start();
        System.err.println( Thread.currentThread().getName() );
        new Thread( new Recipe() ).start();
        new Thread( new Recipe() ).start();
        new Thread( new Recipe() ).start();
    }
    public static class Recipe implements Runnable
    {
        @Override public void run() 
        {
            /*
            try
            {
                Thread.sleep(2000);
            }
            catch( InterruptedException e)
            {
                //Logger.getLogger(name)
            }
            System.out.println( "AASSDD" );
            */
            
            for (int i = 0; i < 10; i++) 
            {
                System.err.println( Thread.currentThread().getName()+"  AASSDD" );
            }
        }
    }
}
