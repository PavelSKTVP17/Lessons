package kontroltoo;

public class Engine 
{
    private  volatile boolean bRunning;
    IManager[] managers;
    Thread thrdMain;
    int time=0;
    public Engine()
    {
        
    }
    public void Start()
    {
        System.out.println(" Engine is starting...");
        bRunning=true;
        //
        managers=new IManager[3];
        managers[0]=PicturesManager.Instance();
        managers[1]=MusicManager.Instance();
        managers[2]=InputManager.Instance();
        //
        for( IManager mng: managers) { mng.Run(); }
        thrdMain=new Thread( ()->Step() );
        thrdMain.start();
        System.out.println(" Engine is started \n");
    }
    public void Step()
    {
        while(bRunning)
        {
            System.out.println(" Engine Step ( T="+time+"):");
            for( IManager mng: managers)     { System.out.println( mng.SomeFunction() ); }
            time++;
            System.out.println("---------------------------");
         //   if(time>3) Stop();
        }
    }
    synchronized public void Stop()
    {
        try
        {
            bRunning=false;
            thrdMain.join();
            System.out.println("\n Engine is stopping...");
            //
            for( IManager mng: managers) { mng.Finish(); }
            System.out.println(" Engine is stopped");
        }
        catch(Exception e)    {e.printStackTrace();}
    }
}
