package MVC1;

import MVC1.controller.Controller;
import MVC1.controller.DefaultController;
import MVC1.controller.DoNothingController;
import MVC1.model.Model;
import MVC1.view.SwingView;
import MVC1.view.View;
import java.util.Objects;

public class ENTRY 
{
    private Model model;
    private View view;
    private Controller controller;

    public ENTRY(Model model, View view, Controller controller) 
    {
        this.model = model;
        this.view = view;
        this.controller = controller;
        init();
    }
    
    private void init()
    {
        view.setModel(model);
        view.setController(controller);
        controller.setView(view);
        controller.setModel(model);
    }
    
     void start() { controller.start();}
    
     static Controller makeController(String... args)
     {
        Controller cntr= new DefaultController();
        for(String str: args)
        {
           if(Objects.equals(str, "-nothing"))    cntr= new DoNothingController();  
        }
        return cntr;
     }
     
    public static void main(String[] args) 
    {
       Controller cntr = makeController( args );
       ENTRY main= new ENTRY( new Model(), new SwingView(), cntr);
       main.start();
    }
    
   
}
