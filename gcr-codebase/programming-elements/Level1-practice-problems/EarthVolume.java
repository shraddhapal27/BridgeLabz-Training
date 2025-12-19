public class EarthVolume{
 public static void main(String args[]){
 
 double radiusKm = 6378;
 double pi = Math.PI;
 
 double volumeKm = (4.0 / 3) * pi * radiusKm * radiusKm * radiusKm;
 double volumeMiles = volumeKm / 1.6 * 1.6 * 1.6;
 
 System.out.println(
  "The volume of earth in cubic kilometres is " + volumeKm + 
  " and cubic miles is " + volumeMiles
 );
   
 
   }
}