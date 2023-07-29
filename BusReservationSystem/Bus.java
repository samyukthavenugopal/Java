package BusReservationSystem;

public class Bus {

		private int busNo;
		private int capacity;
		private boolean ac;
	
	Bus(int no,int cap, boolean ac){
		this.busNo=no;
		this.capacity=cap;
		this.ac=ac;
	}
	
	public int getCapacity() { //accessor Method
		return capacity;
	}
	
	public int getBusNo() { //accessor Method
		return busNo;
	}
		
	public boolean isAc() { //accessor Method
		return ac;
	}
	
	public void setCapacity(int cap){
		capacity=cap;
	}
	
	public void setAc(boolean val){
		ac=val;
	}
	
	
	public void displayBusInfo(){
		System.out.println("Bus No : "+busNo+"\nCapacity : "+capacity+"\nAc : "+ac);
		System.out.println("---------------");
	}
	

}
