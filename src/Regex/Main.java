package Regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;



public class Main 
{
    public static void main(String[] args) throws IOException 
    {
        /*
        BufferedReader BR=new BufferedReader( new InputStreamReader(System.in) );
        boolean reslt=false;
        while(!reslt)
        {
            System.out.println("Password is: ");
            String psw=BR.readLine();
            reslt=MyRegEx.checkPass(psw);
            if(!reslt)
            System.out.println( "fail" );
            else
            System.out.println( "pass" );
        }
        */
        /*
        String text="Lorem ipsum dolor sit amet, consectetur adipiscing elit. Fusce dapibus tellus nec nulla gravida, sed congue nunc hendrerit. Integer interdum elementum lorem id rutrum. Ut sit amet interdum mauris. Phasellus mollis ex eleifend lacus molestie dictum. Fusce blandit, ligula non condimentum maximus, massa nisi ullamcorper odio, et vehicula nisl nunc nec orci. Sed neque diam, gravida eu blandit ullamcorper, porttitor non lorem. Etiam sagittis diam a dolor feugiat placerat. Suspendisse enim turpis, imperdiet in tellus sit amet, consectetur porta magna. Suspendisse odio nulla, imperdiet eget augue in, pulvinar hendrerit nunc. Aenean ut cursus tellus, nec vehicula ante. Vestibulum ornare erat non ante tempus, eu aliquet felis dapibus. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia Curae; Mauris eget arcu imperdiet, laoreet erat non, imperdiet leo. Sed arcu mi, ornare non leo sed, faucibus semper nunc.";
        String[]  lines=MyRegEx.SplitText(text);
        System.out.println( "" );
        System.out.println( lines.length );
        for (int i = 0; i < lines.length; i++) 
        {
            System.out.println( lines[i] );
        }
        */
    //    /*
        System.out.println( MyRegEx.checkInterval("g..  hj655fghf56 4") );
    //    */
        /*
        String text="D:\\GamesMailRu\\Distrib\\torrents\\dsgdfg.txt";
        String[]  lines=MyRegEx.SplitText2(text);
        System.out.println( "" );
        System.out.println( lines.length );
        for (int i = 0; i < lines.length; i++) 
        {
            System.out.println( lines[i] );
        }
        */
        /*
        System.out.println( MyRegEx.checkIP("255.255.255.255") );
        */
    }
}
