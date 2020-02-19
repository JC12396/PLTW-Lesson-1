public class Weather
{
    public static void main(String[] args)
    {
        String weatherCondition = "not available";

        System.out.println(weatherCondition.length());

        System.out.println(WeatherConditionals.getWeatherAdvice(34, "sunny"));
        System.out.println(WeatherConditionals.getWeatherAdvice(32, "windy"));
        System.out.println(WeatherConditionals.getWeatherAdvice(33, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "windy"));

//        if(warm = true){
//            System.out.print("NOOOOOOOOOOO");
//        }
//























    }
}
