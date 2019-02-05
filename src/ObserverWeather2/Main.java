package ObserverWeather2;


public class Main 
{
    public static void main(String[] args) 
    {
        WeatherData WD=new WeatherData();
        
        CurrentConditionDisplay ccd=new CurrentConditionDisplay(WD);
        ForecastDisplay fd = new ForecastDisplay(WD);
        
        WD.setMeasurements(100, 200, 300);
        WD.setMeasurements(300, 200, 100);
        WD.setMeasurements(300, 200, 300);
    }
}
