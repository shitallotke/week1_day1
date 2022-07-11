package week1.assignment;

public class ConvertNegativenumToPositivenum {

	public static void main(String[] args) {
		int number = -40;
		int positivenum;
		if(number < 0)
		{
			positivenum = number * -1;
			System.out.println("Converted negative number to positive Number :" +positivenum);
		}
	}

}
