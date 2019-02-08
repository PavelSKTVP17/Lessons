package Decorra;

import static Decorra.Console.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Developer mdev1=new PhpDeveloper();     OutLn( mdev1.MakeJob() );
        Developer mdev2 = new TesterPhpDeveloper( mdev1 ); OutLn( mdev2.MakeJob() );
        Developer mdev3 = new ManagerPhpDeveloper( mdev2 ); OutLn( mdev3.MakeJob() );
        Developer mdev4 = new SupportPhpDeveloper( mdev3 ); OutLn( mdev4.MakeJob() );
    //    Developer devv = new TesterPhpDeveloper( new PhpDeveloper() );
    //    OutLn( "" );
    }
}
