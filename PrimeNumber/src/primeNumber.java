import java.util.Scanner;

public class primeNumber {
	public void getPrimeNumber(int num) {
		int count=0;
		for(int i=num; i>0;i--) {
			
		
			if(num%i==0) {
				count++;
			}
		}
		if(count>2) {
			System.out.println("num is not prime");
		}
		else {
			System.out.println("num is  prime");
		}
	}
	public static void main (String args[]) {
		System.out.println("enter the number");
		Scanner scanner=new Scanner(System.in);
		int num=scanner.nextInt();
		primeNumber primeNumber =new primeNumber();
		primeNumber .getPrimeNumber(num);
		
	}

}
