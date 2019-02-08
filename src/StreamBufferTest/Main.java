package StreamBufferTest;

import static Decorra.Console.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main 
{
    public static void main(String[] args) throws IOException 
    {
//        while(true)
//        {
//            int bv=System.in.read();
//            OutLn( String.valueOf(bv) );
//        }
        
//        InputStreamReader isr =new InputStreamReader(System.in);
//        for (;;) 
//        {
//            int bv=isr.read();
//            OutLn( String.valueOf( bv ) );
//            OutLn( String.valueOf( (char)bv
//            )  );
//        }
        
        BufferedReader BR= new BufferedReader( new InputStreamReader(System.in) );
        String str=BR.readLine();
        OutLn( "Y E : "+str );
    }
}
