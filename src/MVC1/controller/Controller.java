
package MVC1.controller;

import MVC1.model.Model;
import MVC1.view.View;


public interface Controller 
{
    void addAction( String text );
    void removeAction( String text );
    
    void setModel(Model model);
    void setView( View view);
    
    void start();
}
