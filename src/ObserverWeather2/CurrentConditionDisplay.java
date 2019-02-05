
package ObserverWeather2;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer,DisplayElement
{
    Observable observ;
    public float temperature,humidty;
    
    public CurrentConditionDisplay(Observable _observ) 
    {
        this.observ = _observ;
        this.observ.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) 
    {
        if(o instanceof WeatherData)
        {
            WeatherData WD=(WeatherData)o;
            this.temperature=WD.getTemperature();
            this.humidty=WD.getHumidty();
            display();
        }
    }

    @Override
    public void display() 
    {
        System.out.println("temperature= "+ temperature +" humidty= "+humidty);
    }
    
}
