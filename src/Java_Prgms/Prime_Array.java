package Java_Prgms;

public class Prime_Array {

	public static void main(String[] args) {
	
		int [] a = {13, 10, 15, 19};
		for(int i=0; i<a.length; i++)
		{
			int num = a[i], count=0;
			for(int j=2; j<num/2; j++) 
			{
				if (num%j==0) {
					count++;
					break;
				}
			}
			if (count==0) {
				System.out.println("The Number "+num+" is Prime");
			}else {
				System.out.println("The number "+num+" is not a prime number");
			}
		}
	}
}
