package Iterator0;

public class ENTRY 
{
    public static void main(String[] args) 
    {
        String[] JavaSkills=new String[]{"Java basic","Spring","Glassfish","maven","PostgreSQL"};
        Developer dvp = new Developer("Dev name", JavaSkills);
        
        Iterator itr=dvp.GetIterator();
        System.out.println( dvp.name );
        System.out.println(" Skills:");
        while(itr.hasNext()) System.out.println(" Skill = "+itr.next());
        
        String[] PHPSkills=new String[]{"PHP basic","PHP 1","PHP 2","PHP 3","PHP 4"};
        Developer dvpPHP = new Developer("Dev name php", PHPSkills);
        itr=dvpPHP.GetIterator();
        System.out.println( dvpPHP.name );
        System.out.println(" Skills:");
        while(itr.hasNext()) System.out.println(" Skill = "+itr.next());
    }
}
