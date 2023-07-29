package BusReservationSystem;
import java.util.*; 
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;  // package utility(scanner,array,date...) nested package or hierarchical package

public class Passenger {

	String name;
	int busNo;
	Date date;
	
	Passenger(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter you Name : ");
		String name=sc.nextLine();
		System.out.print("Enter your Bus No : ");
		busNo=sc.nextInt();
		System.out.print("Enter the Date(dd-mm-yyyy) to be Reserved: ");
		String dateInput=sc.next();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		try {
			date=dateFormat.parse(dateInput);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean isAvailable(ArrayList<Passenger> passengers, ArrayList<Bus> buses) {
		int capacity=0;
		for(Bus bus:buses) {
			if(bus.getBusNo()==busNo) 
				capacity=bus.getCapacity();
			}
			
			int booked=0;
			for(Passenger b:passengers) {
				if (b.busNo==busNo && b.date.equals(date)) {
					booked++;
			}
		}
			return booked<capacity?true:false;
		}

}


