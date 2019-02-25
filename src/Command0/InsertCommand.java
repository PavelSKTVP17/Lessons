package Command0;


public class InsertCommand implements Command
{
    Database DB;
    public InsertCommand( Database _db )   
    {
        DB=_db;
    }
    
    @Override
    public void execute() 
    {
        DB.insert();
    }
}
