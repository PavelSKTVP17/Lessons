package Proxy1;


public class RealProject implements Project
{
    String url;

    public RealProject(String url) 
    {
        this.url = url;
        load();
    }
    
    @Override
    public void run() 
    {
        System.out.println("run proj "+url);
    }
    
    private void load()
    {
        System.out.println("load proj "+url);
    }
}
