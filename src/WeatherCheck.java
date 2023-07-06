public class WeatherCheck {
    public static void main(String[] args) {
        // temperature is done in degrees celsius
        int temperature = 3;
        boolean currentlyRaining = false;
        if (currentlyRaining && temperature<20){
            System.out.println("Wear a waterproof coat");
        } else if(!currentlyRaining && temperature>=20){
            System.out.println("Wear shorts and sunscreen");
        } else if(currentlyRaining && temperature>20){
            System.out.println("Take an umbrella");
        } else {
            System.out.println("Wear a jacket");
        }
    }
}
