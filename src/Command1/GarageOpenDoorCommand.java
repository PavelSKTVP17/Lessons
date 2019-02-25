/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command1;

/**
 *
 * @author user
 */
public class GarageOpenDoorCommand implements Command
{
    GaragaDoor GD; 

    public GarageOpenDoorCommand(GaragaDoor GD) 
    {
        this.GD = GD;
    }
    
    @Override
    public void execute() {
        GD.up();
    }
    
}
