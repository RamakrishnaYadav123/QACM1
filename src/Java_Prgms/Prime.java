package Java_Prgms;

public class Prime {
	public static void main(String[] args) {
		int num=19, count=0;
		for(int i=2; i<num/2; i++) {
			if (num%i==0) {
				count++;
				break;
			}
		}
		if (count==0) {
			System.out.println("The Number Is Prime");
		}else {
			System.out.println("The Number Is not Prime");
		}
	}
}
