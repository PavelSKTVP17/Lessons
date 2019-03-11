package State1;


public class ENTRY 
{
    public static void main(String[] args) 
    {
        Activity act = new Sleeping();
        Developer dev = new Developer();
        dev.setActivity(act);
        for (int i = 0; i < 10; i++) 
        {
            dev.justDoIt();
            dev.changeActivity();
        }
    }
}
