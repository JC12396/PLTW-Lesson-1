public class WeatherConditionals
{
    public static String getWeatherAdvice(int temperature, String description)
    {
        boolean windy = false;
        boolean sunny = false;
        boolean snow = false;
        boolean warm = false;
        boolean cold = false;
        if (description.indexOf("snow") >= 0 && temperature > 100)
        {
            snow = true;
            warm = true;
        }
//        else if(description.indexOf("snow") >= 0 && temperature > 30)
//        {
//            snow = true;
//            warm = true;
//        }
//        else if(description.indexOf("sunny") >= 0 && temperature > 30)
//        {
//            sunny = true;
//            warm = true;
//        }
//        if (description.indexOf("windy") >= 0 && temperature < 30)
//        {
//            windy = true;
//            cold = true;
//        }
//        else if(description.indexOf("snow") >= 0 && temperature < 30)
//        {
//            snow = true;
//            cold = true;
//        }
//        else if(description.indexOf("sunny") >= 0 && temperature < 30)
//        {
//            sunny = true;
//            cold = true;
//        }
        return "sunny";
    }
}
