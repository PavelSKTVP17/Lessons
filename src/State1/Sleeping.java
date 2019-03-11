
package State1;


public class Sleeping implements Activity
{
    @Override
    public void JustDoIt() {
        System.out.println( getClass().getName()+ " JustDoIt");
    }
    
}