package week1.assignment;

public class CalCulator {

	
	public void add(int num1,int num2,int num3)
	{
		int sum = num1+num2+num3;
		System.out.println("Addition : " +sum);
		return ;
	}
	
	public int sub(int num1,int num2){
		int substraction= num1-num2;
		System.out.println("Substraction : " +substraction);
		return substraction;
	}
	
	public double multi(double num1, double num2){
		double multi_result = num1 * num2;
		System.out.println("Multiplication : " +multi_result);
		return multi_result;
	}
	
	public float divide(float num1,float num2){
		float div_result = num1/num2;
		System.out.println("Divison : " +div_result);
		return div_result;
		
	}
}
