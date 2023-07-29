package BusReservationSystem;
import java.util.*;

public class BusReservation {

		
		public static void main(String[] args) {

			Scanner sc=new Scanner(System.in);
			
			ArrayList<Bus> buses = new ArrayList<Bus>(); // add list of elements into array without predefining the length
			buses.add(new Bus(1,2,true));
			buses.add(new Bus(2,4,false));
			buses.add(new Bus(3,6,true));
			
			for(Bus b:buses) {
				b.displayBusInfo();
			}
			
			ArrayList<Passenger> passengers = new ArrayList<Passenger>(); // add list of elements into array without predefining the length
			
			
			int userOption=1;
			while(userOption==1) {
				System.out.print("Enter 1 to Book and 2 to Exit : "); 
				userOption=sc.nextInt();	
				
				if(userOption==1) {
					Passenger booking = new Passenger();
					if(booking.isAvailable(passengers,buses)) {
						passengers.add(booking);
						System.out.println("Your Seat is Booked.");
					}else {
						System.out.println("Seats are Occupied! Try Entering another Bus No or Date.");
					}
				}
				
			}System.out.println("Thankyou for Booking!");
	}

}
