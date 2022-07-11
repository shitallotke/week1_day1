package week1.assignment;

public class FindOddNumbers {
	public static void main(String[] args) {
		System.out.println("Printing only the Odd Numbers from 1 to 20 : ");
		for(int num =1;num<=20;num++){
			if( num%2 !=0 ) {
				System.out.print(num +" "); }
		}
	}
}
