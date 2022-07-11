package week1.assignment;

public class MyMobile {
	String mob_name = "Apple";
	String model_name ="iphone11";
	int memory_capacity = 64;
	boolean ischarge;
	
	public void sendMsg(){
		System.out.println("Sending Message...");
	}
	
	public void makeCall(){
		System.out.println("Calling .....");
	}
	
	private void payBills() {
		
		System.out.println("payBills Method...");

	}

	public static void main(String[] args) {
		
		MyMobile mobile = new MyMobile();
		
		System.out.println("Mobile Name :" +mobile.mob_name);
		System.out.println("Mobile model Name :" +mobile.model_name);
		System.out.println("Mobile Memory Capacity :" +mobile.memory_capacity);
		System.out.println("is Mobile charged :" +mobile.ischarge);
		
		mobile.sendMsg();
		mobile.makeCall();
		mobile.payBills();
		
	}

}
