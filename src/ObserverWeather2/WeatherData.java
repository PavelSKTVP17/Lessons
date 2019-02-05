package ObserverWeather2;

import java.util.Observable;




public class WeatherData extends Observable
{
    public float temperature,humidty,presssure;
    public WeatherData() { }

    public void measurementsChanged()
    {
        setChanged();
        notifyObservers();
    }
    
    public void setMeasurements( float _temp, float _hum, float _pres )
    {
        temperature = _temp;
        humidty = _hum;
        presssure = _pres;
        measurementsChanged();
    }
    public float getTemperature() { return temperature; }
    public float getHumidty() { return humidty; }
    public float getPresssure() { return presssure; }
}
