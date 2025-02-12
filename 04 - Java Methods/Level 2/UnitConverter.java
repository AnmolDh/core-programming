class UnitConverter {
    public static double KmToMiles(double km) {
        return km * 0.621371;
    }

    public static double MilesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double MetersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double FeetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static void main(String[] args) {
        System.out.println("5 kilometers in miles: " + KmToMiles(5));
        System.out.println("3 miles in kilometers: " + MilesToKm(3));
        System.out.println("10 meters in feet: " + MetersToFeet(10));
        System.out.println("30 feet in meters: " + FeetToMeters(30));
    }
}
