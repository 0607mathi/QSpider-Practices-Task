
import java.util.Scanner;
public class SumOfPrimes {
	static Scanner sc = new Scanner(System.in);
	
	static boolean isPrimeOrNot(int value) {
		boolean p=true;
				for(int i=2;i<value;i++) {
					if(value%i==0)
					p=false;
					break;
				 }
				return p;
	}
	public static void main(String[] args) {
		System.out.print("Enter Starting Point    : ");
		int start = sc.nextInt();
		System.out.print("Enter Ending Point      : ");
		int end = sc.nextInt();
		int sum = 0;
		
		if(start<end&&start>0) {
			if(start!=0&&start!=1) {
				
					for(int i=start;i<=end;i++) {
						if(isPrimeOrNot(i))
							sum+=i;
						}
					
					System.out.print("Sum Of Prime Numbers is : "+sum);
			}
			else System.out.println(start+" is Neigther Prime or Composite");
		}
		else System.out.print("Invalid Input");
	}
}
