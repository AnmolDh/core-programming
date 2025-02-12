class EarthVolume{
  public static void main(String[] args){
    final double pi = 3.14;

    int earthRadiusKm = 6378;
    double earthRadiusMiles = 6378 * 0.621;

    double volumeKm = (4/3) * pi * Math.pow(earthRadiusKm, 3);
    double volumeMile = (4/3) * pi * Math.pow(earthRadiusMiles, 3);

    System.out.println(String.format("The volume of earth in cubic kilometers is %,.2f and cubic miles is %,.2f", volumeKm, volumeMile));
  }
}