
package javaapplication152;

import java.util.ArrayList;
import org.magicwerk.brownies.collections.GapList;


public class JavaApplication152 
{
    public static void main(String[] args) 
    {
        /*
        long bef=System.currentTimeMillis(); long aft=0;
        GapList<Integer> gl=new GapList<Integer>(100000);
        //ArrayList<Integer> gl=new ArrayList<Integer>();
        for (int i = 0; i < 1000000; i++) 
        {
            gl.add(i);
        }
        aft=System.currentTimeMillis();
        System.out.println(" add= "+ (aft-bef) );
        //
        //
        bef=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++)  gl.get(i);
        aft=System.currentTimeMillis();
        System.out.println(" get1= "+ (aft-bef) );
        //
        bef=System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++)  gl.get(i);
        aft=System.currentTimeMillis();
        System.out.println(" get2= "+ (aft-bef) );
        //
        bef=System.currentTimeMillis();
        for (Integer i = 0; i < 10000; i++)  gl.remove(i);
        aft=System.currentTimeMillis();
        System.out.println(" rem1= "+ (aft-bef) );
        */
        Integer[] ARR1=new Integer[10000000];
        for (int i = 0; i < 10000000; i++) 
        {
            ARR1[i]= i;
        }
        long aft=0,bef=System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) 
        {
           if(  ARR1[i]==null) {}
        }
        aft=System.currentTimeMillis();
        System.out.println(" rem1= "+ (aft-bef) );
    }
}
