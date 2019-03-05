package Template4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public final class Coffee extends HotDrink
{

    @Override
    void brew() 
    {
         System.out.println("Варим кофе");
    }

    @Override
    void addIngridients() 
    {
         System.out.println("Добавляем молоко");
    }
    @Override
    boolean cutomerWantsIngridients() 
    {
        String str=GetUserInput();
        if( str.toLowerCase().startsWith("y") ) return true; else  return false;
    }
    
    private String GetUserInput()
    {
        String str=null;
        System.out.println("Хотите добавить молоко? (y/n)");
        
        BufferedReader scn = new BufferedReader( new InputStreamReader(System.in) );
        try
        {
            str=scn.readLine();
        }
        catch(IOException exp)
        {
            System.err.println("Error.....");
        }
        if( str==null) str="no";
        return str;
    }
    
}
