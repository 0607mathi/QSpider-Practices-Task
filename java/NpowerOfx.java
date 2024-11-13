
import java.util.Scanner;
public class NpowerOfx {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter Base Number : ");
		int Base =  in.nextInt(),temp=Base;
		System.out.print("Enter Power Number: ");
		int Power = in.nextInt();
		for(int i=2; i<=Power;i++) {
			Base*=temp;
		}
		System.out.println(temp+" power of "+Power+" = "+Base);
	}
}
