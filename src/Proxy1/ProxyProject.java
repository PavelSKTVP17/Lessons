
package Proxy1;


public class ProxyProject implements Project
{
    String url;
    RealProject realproj;

    public ProxyProject(String url) 
    {
        this.url = url;
    }
    
    @Override
    public void run() 
    {
       if( realproj==null) realproj=new RealProject(url);
       realproj.run();
    }
    
}
