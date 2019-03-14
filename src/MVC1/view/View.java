package MVC1.view;

import MVC1.controller.Controller;
import MVC1.model.Model;


public interface View 
{
    void dispose();
    
    void setController( Controller controller);
    void setModel( Model model );
    
    void show();
}
