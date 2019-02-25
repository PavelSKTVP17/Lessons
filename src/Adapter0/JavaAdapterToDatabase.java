package Adapter0;

public class JavaAdapterToDatabase  extends javaApplication implements Database
{
    @Override
    public void insert() 
    {
        saveObject();
    }

    @Override
    public void update() 
    {
        updateObject();
    }
    @Override
    public void delete() 
    {
        deleteObject();
    }
}
