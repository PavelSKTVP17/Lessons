package Singleton0;

public class Main 
{
    public static void main(String[] args) 
    {
        MyObject o=new MyObject();
        MyObject o1=new MyObject();
        MyObject o2=new MyObject();
        
        //MyObjectClosed1 oc1=new MyObjectClosed1();
        MyObjectClosed1 oc1=MyObjectClosed1.getInst();
        MyObjectClosed1 oc2=MyObjectClosed1.getInst();
        
        Singletone s1=Singletone.getInst();
        Singletone s2=Singletone.getInst();
    }
}
class MyObject
{
    
}
class MyObjectClosed0
{
    private MyObjectClosed0()
    {

    }
}
class MyObjectClosed1
{
    private MyObjectClosed1()
    {

    }
    public static MyObjectClosed1 getInst()
    {
        return new MyObjectClosed1();
    }
}
class Singletone
{
    public static Singletone unique;
    private Singletone()
    {

    }
    public static Singletone getInst()
    {
       if(unique==null)unique=new Singletone();
       return unique;
    }
}