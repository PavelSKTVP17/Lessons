package ObserverWeather2;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer,DisplayElement
{
    public float CurPres,LastPress;

    public ForecastDisplay(Observable obsrvble) 
    {
        obsrvble.addObserver(this);
    }
    
    @Override
    public void update(Observable o, Object arg) 
    {
        if(o instanceof WeatherData)
        {
            WeatherData WD=(WeatherData)o;
            LastPress = CurPres;
            CurPres=WD.getPresssure();
            display();
        }
    }

    @Override
    public void display() 
    {
        System.out.println("Forec");
        if( CurPres > LastPress) System.out.println(" good");
        else if(CurPres == LastPress) System.out.println(" so so");
        if( CurPres < LastPress) System.out.println(" bad");
    }
    
}
