package ObserverJavaJobs;


public class JobSearch 
{
    public static void main(String[] args) 
    {
        JavaDevelopersJobSite ST=new JavaDevelopersJobSite();
        ST.addObserver( new Subscriber("nam1") );
        ST.addObserver( new Subscriber("nam2") );
        ST.addObserver( new Subscriber("nam3") );
        
        ST.addVacancy("coder");
        ST.addVacancy("tester");
        ST.addVacancy("senior tester");
        ST.addVacancy("test manager");
        ST.removeVacancy("test manager");
    }
}
