class ExtendedUnitConverter {

    public static double YardsToFeet(double yards) {
        return yards * 3;
    }

    public static double FeetToYards(double feet) {
        return feet * 0.333333;
    }

    public static double MetersToInches(double meters) {
        return meters * 39.3701;
    }

    public static double InchesToMeters(double inches) {
        return inches * 0.0254;
    }

    public static double InchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static double FahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double CelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double PoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double KilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double GallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double LitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args){
      System.out.println(LitersToGallons(1.0));
    }
}
