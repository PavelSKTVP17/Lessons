package Linker;

public class ENTRY 
{
    public static void main(String[] args) 
    {
        Team tm = new Team();
    
        JavaDeveloper jdv = new JavaDeveloper();
        PhpDeveloper pdv = new PhpDeveloper();
        CppDeveloper cdv = new CppDeveloper();
        tm.addDeveloper(jdv); tm.addDeveloper(pdv); tm.addDeveloper(cdv);
        tm.createproject();
        
    }
    
    
}
