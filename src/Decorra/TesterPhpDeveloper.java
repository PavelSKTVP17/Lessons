
package Decorra;


public class TesterPhpDeveloper extends DeveloperDecorator
{
    public TesterPhpDeveloper(Developer dv)    {      super(dv);   }
    public String makeCodeTesting() { return " ... testing code ... "; }

    @Override
    public String MakeJob() {
        return super.MakeJob() + makeCodeTesting() ; 
    }
    
}
