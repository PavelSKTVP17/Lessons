
package Command1;


public class ENTRY 
{
    public static void main(String[] args) {
        SimpleRemoteControl remote= new SimpleRemoteControl();
        Light lg=new Light();
        GaragaDoor gd= new GaragaDoor();
        LightOnCommand loncm=new LightOnCommand(lg);
        GarageOpenDoorCommand gdocm=new GarageOpenDoorCommand(gd);
        
        remote.setCommand(loncm); remote.buttonWasPressed();
        remote.setCommand(gdocm); remote.buttonWasPressed();
    }
}
