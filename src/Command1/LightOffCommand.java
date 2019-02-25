package Command1;


public class LightOffCommand implements Command
{
    Light LG;

    public LightOffCommand(Light LG) 
    {
        this.LG = LG;
    }
    
    @Override
    public void execute() 
    {
        LG.off();
    }
    
}
