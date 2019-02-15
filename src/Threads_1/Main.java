package Threads_1;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main 
{
    public static volatile boolean flag=true;
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
        /*
        Thread thrd = new Thread( new Recipe() );
        thrd.start();
        System.err.println( Thread.currentThread().getName() );
        new Thread( new Recipe() ).start();
        new Thread( new Recipe() ).start();
        new Thread( new Recipe() ).start();
        */
        new ThreadClassReader().start();
        new ThreadClassSetter().start();
        
    }
    static class ThreadClassReader extends Thread
    {
        @Override
        public void run() 
        {
            while(flag)
            {
                
            }
            System.err.println( "Reader "+flag );
        }
    }
    static class ThreadClassSetter extends Thread
    {

        @Override
        public void run() 
        {
            try
            {
                sleep(2000);
            }
            catch( InterruptedException e )
            {
                Logger.getLogger( Main.class.getName()).log(Level.SEVERE,null, e);
            }
            flag=false;
            System.err.println( "SET FLAG "+flag );
        }
        
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
