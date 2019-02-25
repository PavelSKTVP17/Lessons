package Adapter0;


public class ENTRY 
{
    public static void main(String[] args) 
    {
        Database DB=new JavaAdapterToDatabase();
        DB.insert();
        DB.update();
        DB.delete();
    }
}
