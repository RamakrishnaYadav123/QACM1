package Java_Prgms;

public class Fibonaci {
	public static void main(String[] args) 
	{
		int sum=0, num1=0, num2=1;
		System.out.print(num1+ " "+ num2+" ");
		for (int i=0; i<=10; i++) 
		{
			sum=num1+num2;
			System.out.print(sum+" ");
			num1=num2;
			num2=sum;
		}
	}
}
