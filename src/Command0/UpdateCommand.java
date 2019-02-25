
package Command0;


public class UpdateCommand implements Command
{
    Database DB;
    public UpdateCommand( Database _db )   
    {
        DB=_db;
    }
    
    @Override
    public void execute() 
    {
        DB.update();
    }
}