package week1.day1;

public class Mobile {
	
	public static void makeCall() {
		System.out.println("Calling");
	}
	void sendMsg() {
		System.out.println("Sending Messages");	
	}
	public static void main(String[] args) {
		System.out.println("This is my Mobile");
		
		makeCall();// calling static method of class
		
		Mobile obj = new Mobile();
		obj.sendMsg();// calling Instance method of class
		
		makeCall();
	}

}
