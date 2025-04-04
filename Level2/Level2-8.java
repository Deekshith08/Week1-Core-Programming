//8

// Create TravelComputation Class to compute the Distance and Travel Time
import java.util.Scanner;
class TravelComputation {
   
   public static void main(String[] args) {
	   
      String name;
      String fromCity , viaCity, toCity;
	  
	  Scanner input = new Scanner(System.in);
	  
	  System.out.print("Enter name of the person : ");
	  name = input.nextLine();
	  
	  System.out.print("Enter starting city : ");
	  fromCity = input.nextLine();
	  
	  System.out.print("Enter the via city : ");
	  viaCity = input.nextLine();
	  
	  System.out.print("Enter destination city : ");
	  toCity = input.nextLine();

      double distanceFromToVia;

      int timeFromToVia;

      double distanceViaToFinalCity;

      int timeViaToFinalCity;
	  
	  System.out.print("Enter distance from starting to via city : ");
	  distanceFromToVia = input.nextDouble();
	  
	  System.out.print("Enter distance from  via to destination city : ");
	  distanceViaToFinalCity = input.nextDouble();
	  
	   System.out.print("Enter time taken for travel starting to via city : ");
	  timeFromToVia = input.nextInt();
	  
	  System.out.print("Enter time taken for travel via to destination city : ");
	  timeViaToFinalCity = input.nextInt();
	  

      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      int totalTime = timeFromToVia + timeViaToFinalCity;


      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}
