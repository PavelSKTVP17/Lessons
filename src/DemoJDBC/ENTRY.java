package DemoJDBC;

import java.sql.*;

public class ENTRY 
{
    public static void main(String[] args)
    {
        String url ="jdbc:mysql://localhost:3306/test?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String username ="root";
        String password ="";
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            Statement statm = conn.createStatement();
            ResultSet ress = statm.executeQuery("SELECT * FROM tasks"); 
            while( ress.next() )   { System.out.println( ress.getString(2) ); }
            
            url ="jdbc:mysql://localhost:3306/mysql?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            conn = DriverManager.getConnection(url, username, password);
            statm = conn.createStatement();
            ress = statm.executeQuery("SELECT Host,User FROM user");
            while( ress.next() )   { System.out.println( ress.getString(1) +"  "+ ress.getString(2) ); }
            ress.close();
            statm.close();
            conn.close();
        }
        catch( SQLException e)
        {
            e.printStackTrace();
        }
        catch( ClassNotFoundException e)
        {
             e.printStackTrace();
        }
    }
}
