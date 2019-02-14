package Singletone1;


public class EntryPoint 
{
    public static void main(String[] args) 
    {
        Boiler.Instance().Fill();
        Boiler.Instance().Boil();
        Boiler.Instance().Drain();
    }
}
class Boiler
{
    public static Boiler unique;
    private Boiler()   {    }
    public static Boiler Instance()
    {
       if(unique==null)unique=new Boiler();
       return unique;
    }
    public void Fill()
    {
        System.out.println( "  Boiler Fill" );
    }
    public void Boil()
    {
       System.err.println( "  Boiler Boil" );
    }
    public void Drain()
    {
        System.err.println( "  Boiler Drain" );
    }
}