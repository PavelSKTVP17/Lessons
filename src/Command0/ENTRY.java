
package Command0;


public class ENTRY 
{
    public static void main(String[] args) 
    {
        Database tdb= new Database();
        
        Developer tdvp=new Developer( new InsertCommand(tdb), new UpdateCommand(tdb) );
        tdvp.InsertRecord(tdb);
        tdvp.UpdateRecord(tdb);
    }
}

