package StartTest;

import java.util.HashMap;
import java.util.Map;


public class Test1 
{
    public static void main(String[] args) 
    {
//        String nam1="sss"; String lasnam1="dfssf";
//        System.out.println( nam1 +" "+lasnam1 );
//        System.out.println( nam1 +" "+lasnam1 );
//        System.out.println( nam1 +" "+lasnam1 );
        
//        String[] ar1=new String[3];
//        ar1[0]="nam 0";
//        ar1[1]="nam 1";
//        ar1[2]="nam 2";
//        String[] ar12=new String[3];
//        ar12[0]="lastnam 0";
//        ar12[1]="lastnam 1";
//        ar12[2]="lastnam 2";
//        for (int i = 0; i < 3; i++) 
//        {
//            System.out.println( ar1[i] +" "+ ar12[i] );
//            System.out.println( "tere" );
//            System.out.println( "head aega" );
//        }
        
//        Person[] ar1=new Person[3];
//        ar1[0]=new Person( "N1" , "L1" );
//        ar1[1]=new Person( "N2" , "L2" );
//        ar1[2]=new Person( "N3" , "L3" );
//        for (int i = 0; i < 3; i++) 
//        {
//            System.out.println( ar1[i].toString() );
//            ar1[i].Tere() ;
//            ar1[i].HeadAega() ;
//        }
        
        Map<Person,String> mp1=new HashMap<>();
        mp1.put( new Person( "N1" , "L1" ) , "1");
        mp1.put( new Person( "N2" , "L2" ) , "2");
        mp1.put( new Person( "N3" , "L3" ) , "3");
        for(Map.Entry<Person, String> item : mp1.entrySet())
        {
            
           System.out.println( item.getValue() );
           System.out.println( item );
           item.getKey().Tere() ;
           
         
       }
    } 
}
class Person 
{

    @Override
    public String toString() {
        return "Person{ Name=" + Name + ", LastName=" + LastName + '}';
    }
    public Person(String Name, String LastName) 
    {
        this.Name = Name;
        this.LastName = LastName;
    }
    public String Name;
    public String LastName;

    public void Tere() {  System.out.println( "tere" ); }
    public void HeadAega() {  System.out.println( "head aega" ); }
}

