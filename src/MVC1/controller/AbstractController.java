
package MVC1.controller;

import MVC1.model.Model;
import MVC1.view.View;


public abstract class AbstractController implements Controller
{
    protected Model model;
    protected View view;
    
    
    @Override
    public void setModel(Model model) {       this.model=model;  }

    @Override
    public void setView(View view) {      this.view=view;   }

    @Override
    public void start() { view.show();   }
    
}
