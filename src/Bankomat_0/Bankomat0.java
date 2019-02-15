package Bankomat_0;

import Threads_1.Main;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bankomat0 
{
    static int money = 100;
    static Object obj = new Object();
    static Object obj1 = new Object();
    static void GetMoney( int amount )
    {
      //  synchronized(obj1)
      //  {
      //      System.err.println( "curr "+ money);
      //  }
        synchronized(obj)
        {
            if( amount<=money)
            {
                try
                {
                    sleep(1000);
                }
                catch( InterruptedException e )
                {
                    Logger.getLogger( Main.class.getName()).log(Level.SEVERE,null, e);
                }
               money-=amount;
               System.err.println( "congrats "+ money);

            }
            else
            {         System.err.println( "no money ");       }
            System.err.println( "...done... ");
        }
        
    }
    public static void main(String[] args) 
    {
        new Thread(  ()->
        {
            System.err.println( "Vasya ");
            Bankomat0.GetMoney(50);
        } ).start();
        new Thread(  ()->
        {
            System.err.println( "Petya ");
            Bankomat0.GetMoney(50);
        } ).start();
        new Thread(  ()->
        {
            System.err.println( "Gavrilla ");
            Bankomat0.GetMoney(50);
        } ).start();
        new Thread(  ()->
        {
            System.err.println( "Lola ");
            Bankomat0.GetMoney(50);
        } ).start();
    }
}
