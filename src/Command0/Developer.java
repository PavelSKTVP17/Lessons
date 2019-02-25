package Command0;

public class Developer 
{
    Command insert;
    Command update;
    Command select;
    Command delete;
    
    public Developer( Command _insert, Command _update )
    {
        insert=_insert; update=_update;
    }
    public void InsertRecord( Database _db )   
    {
        insert.execute();
    }
    public void UpdateRecord( Database _db )   
    {
        update.execute();
    }
}
