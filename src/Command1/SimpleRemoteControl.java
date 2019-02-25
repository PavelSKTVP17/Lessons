package Command1;


public class SimpleRemoteControl 
{
    Command Slot;
    
    public SimpleRemoteControl(){}
    
    public void setCommand( Command cmd )
    {
        Slot=cmd;
    }
    public void buttonWasPressed()
    {
        Slot.execute();
    }
}
