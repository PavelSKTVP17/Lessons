package Decorra;


public class ManagerPhpDeveloper extends DeveloperDecorator
{
     public ManagerPhpDeveloper(Developer dv)    {      super(dv);   }
    public String ImplForClient() { return " ... implements into client ... "; }

    @Override
    public String MakeJob() {
        return super.MakeJob() + ImplForClient() ; 
    }
}
