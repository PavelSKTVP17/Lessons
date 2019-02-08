package Decorra;


public class SupportPhpDeveloper extends DeveloperDecorator
{
     public SupportPhpDeveloper(Developer dv)    {      super(dv);   }
    public String SupportProject() { return " ... supports the project ... "; }

    @Override
    public String MakeJob() {
        return super.MakeJob() + SupportProject() ; 
    }
}
