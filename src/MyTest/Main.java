package MyTest;

import java.util.ArrayList;


public class Main 
{
    public static void main(String[] args) 
    {
        int LEN1=1000000;
        MyCollection mcl = new MyCollection(LEN1);
        long aft=0; long bef=0; 
        for (int i = 0; i < LEN1/2; i++) 
        {
            mcl.Add( new ObjectUnit() );
        }
    //    aft=System.currentTimeMillis(); 
    //    System.out.println( "my1= "+(aft-bef) );
        //
        //
        ArrayList<ObjectUnit> arl=new ArrayList<>(LEN1);
        bef=System.currentTimeMillis(); 
        for (int i = 0; i < LEN1/2; i++) 
        {
            arl.add( new ObjectUnit() );
        }
        aft=System.currentTimeMillis(); 
        System.out.println( "arl add= "+(aft-bef) );
        //
        //
        MyCollection mc2 = new MyCollection(LEN1);
        bef=System.currentTimeMillis(); 
        for (int i = 0; i < LEN1/2; i++) 
        {
            mc2.Add( new ObjectUnit() );
        }
        aft=System.currentTimeMillis(); 
        System.out.println( "my add= "+(aft-bef) );
        //
        //
        //
        //
        ObjectUnit oob;
        bef=System.currentTimeMillis(); 
        for (int i = 0; i < LEN1/2; i++) 
        {
            oob=arl.get(i);
        }
        aft=System.currentTimeMillis(); 
        System.out.println( "arl get= "+(aft-bef) );
        //
        //
        bef=System.currentTimeMillis(); 
        for (int i = 0; i < LEN1/2; i++) 
        {
           oob=mc2.Get(i);
        }
        aft=System.currentTimeMillis(); 
        System.out.println( "my get= "+(aft-bef) );
    }
    
}
class MyCollection
{
    private ObjectUnit[] ARR;
    private int[] IND;
    private int I1=0;
    public MyCollection( int len)
    {
        this.ARR=new ObjectUnit[len];
        IND=new int[len];
    }
    public void Add( ObjectUnit OU )
    {
        ARR[I1]=OU;
        IND[I1]=I1;
        I1++;
    }
    public void Remove( ObjectUnit OU )
    {
        int indexOf = -1;
        for (int i = 0; i < ARR.length; i++) 
        {
            if(ARR[i]==OU) { indexOf=i; break; }
        }
    }
    
    public ObjectUnit Get(int index )
    {
        return ARR[ IND[index] ];
    }
}
class ObjectUnit
{
    public float[] position;
    public ObjectUnit()
    {
        position=new float[4];
    }
}