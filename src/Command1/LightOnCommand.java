package Command1;


public class LightOnCommand implements Command
{
    Light LG;

    public LightOnCommand(Light LG) {
        this.LG = LG;
    }
    
    @Override
    public void execute() 
    {
        LG.on();
    }
    
}
