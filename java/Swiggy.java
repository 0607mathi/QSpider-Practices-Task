import java.util.Scanner;
class Swiggy {
	static Scanner in = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
		System.out.println("\t\t\tSwiggy Food Order Application");
		System.out.println("\t\t\t-----------------------------");
		System.out.println("Available Holtes\n----------------");
		System.out.println("1. HM Briyani\n2. Saravana Bavan\n3. A2B\n4. Amma Canteen");
		System.out.print("\nSelect your hotel : ");
		int input = in.nextInt();
		int billAmount = 1;
		int otp = (int)(Math.random()*9999+9999);
		switch(input) {
		case 1:{
			System.out.println("\nHM Briyani Menu Card:");
			System.out.println("---------------------");
			System.out.println("1. Chicken Briyani  - 130rs\n2. Mutton Briyani   - 350rs\n3. Chicken Kuskka   - 100rs\n4. Mutton Kuskka    - 300rs\n5. Chicken Shavorma - 150rs\n6. Grill Chicken    - 200rs");
			System.out.print("\nSelect your Favourit food : ");
			input = in.nextByte();
			switch(input) {
			case 1:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Chicken Briyani      : 130rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=130;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt(); 
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 2:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Mutton Briyani       : 350rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=350;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 3:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Chicken Kuskka       : 100rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=100;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt(); 
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 4:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Mutton Kuskka        : 300rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=300;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 5:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Chicken Shavorma     : 150rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=150;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 6:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Grill Chicken        : 200rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=200;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
						
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			default : {
				System.out.println("\nProcessing...");
				Thread.sleep(3000); 
				System.out.println("\nInvalid Food Selection");
			}
			}
			break;
			}
		
//		hotel Saravanaban
		
		case 2:{
		System.out.println("\nSaravanabavan Menu Card:");
		System.out.println("---------------------");
		System.out.println("1. Idly     - 15rs\n2. Dosa     - 20rs\n3. Puri     - 20rs\n4. Chapathi - 300rs\n5. Pongal   - 50rs\n6. Vada     - 15rs");
		System.out.print("\nSelect your Favourit food : ");
		input = in.nextByte();
		switch(input) {
		case 1:{
			System.out.println("\nOrder Detail");
			System.out.println("------------");
			System.out.print("Idly                 : 15rs\nEnter Food Quantity  : ");
			billAmount = in.nextByte();
			billAmount*=15;
			System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
			System.out.println("Payments Methods");
			System.out.println("----------------");
			System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
			System.out.print("\nSelect Your Payment Methods : ");
			input = in.nextByte();
			switch(input) {
			case 1:
			case 2:
			case 3:
			case 4:{
				System.out.print("Enter your Total Bill       : ");
				input = in.nextInt(); 
				System.out.println("\nProcessing...");
				Thread.sleep(3000);
				if (billAmount == input) 
				{
					System.out.println("\nYour OTP is : "+otp);
					System.out.print("Enter OTP   : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if(otp == input) System.out.println("\nYour Order Placed...! :)");
					else System.out.println("\nPayment Failed Invalid Otp.");
				}
				else {
					System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
				}
				break;
			}
			default: {
				System.out.println("\nProcessing...");
				Thread.sleep(3000);
				System.out.println("\nInvalid Payments Method Selection.");
			}
			}
			break;
		}
		case 2:{
			System.out.println("\nOrder Detail");
			System.out.println("------------");
			System.out.print("Dosa                 : 20rs\nEnter Food Quantity  : ");
			billAmount = in.nextByte(); 
			billAmount*=20;
			System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
			System.out.println("Payments Methods");
			System.out.println("----------------");
			System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
			System.out.print("\nSelect Your Payment Methods : ");
			input = in.nextByte();
			switch(input) {
			case 1:
			case 2:
			case 3:
			case 4:{
				System.out.print("Enter your Total Bill       : ");
				input = in.nextInt();
				System.out.println("\nProcessing...");
				Thread.sleep(3000);
				if (billAmount == input) 
				{
					System.out.println("\nYour OTP is : "+otp);
					System.out.print("Enter OTP   : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if(otp == input) System.out.println("\nYour Order Placed...! :)");
					else System.out.println("\nPayment Failed Invalid Otp.");
				}
				else {
					System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
				}
				break;
			}
			default: {
				System.out.println("\nProcessing...");
				Thread.sleep(3000);
				System.out.println("\nInvalid Payments Method Selection.");
			}
			}
			break;
		}
		case 3:{
			System.out.println("\nOrder Detail");
			System.out.println("------------");
			System.out.print("Puri                 : 20rs\nEnter Food Quantity  : ");
			billAmount = in.nextByte();
			billAmount*=20;
			System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
			System.out.println("Payments Methods");
			System.out.println("----------------");
			System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
			System.out.print("\nSelect Your Payment Methods : ");
			input = in.nextByte();
			switch(input) {
			case 1:
			case 2:
			case 3:
			case 4:{
				System.out.print("Enter your Total Bill       : ");
				input = in.nextInt(); 
				System.out.println("\nProcessing...");
				Thread.sleep(3000);
				if (billAmount == input) 
				{
					System.out.println("\nYour OTP is : "+otp);
					System.out.print("Enter OTP   : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if(otp == input) System.out.println("\nYour Order Placed...! :)");
					else System.out.println("\nPayment Failed Invalid Otp.");
				}
				else {
					System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
				}
				break;
			}
			default: {
				System.out.println("\nProcessing...");
				Thread.sleep(3000);
				System.out.println("\nInvalid Payments Method Selection.");
			}
			}
			break;
		}
		case 4:{
			System.out.println("\nOrder Detail");
			System.out.println("------------");
			System.out.print("Chappati             : 20rs\nEnter Food Quantity  : ");
			billAmount = in.nextByte();
			billAmount*=20;
			System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
			System.out.println("Payments Methods");
			System.out.println("----------------");
			System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
			System.out.print("\nSelect Your Payment Methods : ");
			input = in.nextByte();
			switch(input) {
			case 1:
			case 2:
			case 3:
			case 4:{
				System.out.print("Enter your Total Bill       : ");
				input = in.nextInt();
				System.out.println("\nProcessing...");
				Thread.sleep(3000);
				if (billAmount == input) 
				{
					System.out.println("\nYour OTP is : "+otp);
					System.out.print("Enter OTP   : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if(otp == input) System.out.println("\nYour Order Placed...! :)");
					else System.out.println("\nPayment Failed Invalid Otp.");
				}
				else {
					System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
				}
				break;
			}
			default: {
				System.out.println("\nProcessing...");
				Thread.sleep(3000);
				System.out.println("\nInvalid Payments Method Selection.");
			}
			}
			break;
		}
		case 5:{
			System.out.println("\nOrder Detail");
			System.out.println("------------");
			System.out.print("Pongal               : 50rs\nEnter Food Quantity  : ");
			billAmount = in.nextByte();
			billAmount*=50;
			System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
			System.out.println("Payments Methods");
			System.out.println("----------------");
			System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
			System.out.print("\nSelect Your Payment Methods : ");
			input = in.nextByte();
			switch(input) {
			case 1:
			case 2:
			case 3:
			case 4:{
				System.out.print("Enter your Total Bill       : ");
				input = in.nextInt();
				System.out.println("\nProcessing...");
				Thread.sleep(3000);
				if (billAmount == input) 
				{
					System.out.println("\nYour OTP is : "+otp);
					System.out.print("Enter OTP   : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if(otp == input) System.out.println("\nYour Order Placed...! :)");
					else System.out.println("\nPayment Failed Invalid Otp.");
				}
				else {
					System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
				}
				break;
			}
			default: {
				System.out.println("\nProcessing...");
				Thread.sleep(3000);
				System.out.println("\nInvalid Payments Method Selection.");
			}
			}
			break;
		}
		case 6:{
			System.out.println("\nOrder Detail");
			System.out.println("------------");
			System.out.print("Vada                 : 15rs\nEnter Food Quantity  : ");
			billAmount = in.nextByte();
			billAmount*=15;
			System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
			System.out.println("Payments Methods");
			System.out.println("----------------");
			System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
			System.out.print("\nSelect Your Payment Methods : ");
			input = in.nextByte();
			switch(input) {
			case 1:
			case 2:
			case 3:
			case 4:{
				System.out.print("Enter your Total Bill       : ");
				input = in.nextInt();
				System.out.println("\nProcessing...");
				Thread.sleep(3000);
				if (billAmount == input) 
				{
					System.out.println("\nYour OTP is : "+otp);
					System.out.print("Enter OTP   : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if(otp == input) System.out.println("\nYour Order Placed...! :)");
					else System.out.println("\nPayment Failed Invalid Otp.");
					
				}
				else {
					System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
				}
				break;
			}
			default: {
				System.out.println("\nProcessing...");
				Thread.sleep(3000);
				System.out.println("\nInvalid Payments Method Selection.");
			}
			}
			break;
		}
		default : {
			System.out.println("\nProcessing...");
			Thread.sleep(3000); 
			System.out.println("\nInvalid Food Selection");
		}
		}
			break;
			}
		
//		Hotel A2B
		
		case 3:{
			System.out.println("\nA2B Menu Card:");
			System.out.println("---------------------");
			System.out.println("1. Chicken Briyani  - 130rs\n2. Mutton Briyani   - 350rs\n3. Chicken Kuskka   - 100rs\n4. Mutton Kuskka    - 300rs\n5. Chicken Shavorma - 150rs\n6. Grill Chicken    - 200rs");
			System.out.print("\nSelect your Favourit food : ");
			input = in.nextByte();
			switch(input) {
			case 1:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Chicken Briyani      : 130rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=130;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt(); 
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 2:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Mutton Briyani       : 350rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=350;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 3:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Chicken Kuskka       : 100rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=100;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt(); 
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 4:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Mutton Kuskka        : 300rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=300;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 5:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Chicken Shavorma     : 150rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=150;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 6:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Grill Chicken        : 200rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=200;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
						
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			default : {
				System.out.println("\nProcessing...");
				Thread.sleep(3000); 
				System.out.println("\nInvalid Food Selection");
			}
			}
			break;
			}
		
//		Amma Canteen
		
		case 4:{
			System.out.println("\nAmma Canteen Menu Card:");
			System.out.println("---------------------");
			System.out.println("1. Idly     - 1rs\n2. Dosa     - 3rs\n3. Puri     - 3rs\n4. Chapathi - 3rs\n5. Pongal   - 5rs\n6. Vada     - 5rs");
			System.out.print("\nSelect your Favourit food : ");
			input = in.nextByte();
			switch(input) {
			case 1:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Idly                 : 1rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=1;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt(); 
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 2:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Dosa                 : 3rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte(); 
				billAmount*=3;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 3:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Puri                 : 3rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=3;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt(); 
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 4:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Chappati             : 3rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=3;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 5:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Pongal               : 5rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=5;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			case 6:{
				System.out.println("\nOrder Detail");
				System.out.println("------------");
				System.out.print("Vada                 : 5rs\nEnter Food Quantity  : ");
				billAmount = in.nextByte();
				billAmount*=5;
				System.out.println("Total Bill Amount is : "+billAmount+"rs\n");
				System.out.println("Payments Methods");
				System.out.println("----------------");
				System.out.println("1. Gpay\n2. PhonePay\n3. Paytm\n4. Internet Banking");
				System.out.print("\nSelect Your Payment Methods : ");
				input = in.nextByte();
				switch(input) {
				case 1:
				case 2:
				case 3:
				case 4:{
					System.out.print("Enter your Total Bill       : ");
					input = in.nextInt();
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					if (billAmount == input) 
					{
						System.out.println("\nYour OTP is : "+otp);
						System.out.print("Enter OTP   : ");
						input = in.nextInt();
						System.out.println("\nProcessing...");
						Thread.sleep(3000);
						if(otp == input) System.out.println("\nYour Order Placed...! :)");
						else System.out.println("\nPayment Failed Invalid Otp.");
						
					}
					else {
						System.out.println("\nPayment Failed\nEnter Proper Bill Amount.");
					}
					break;
				}
				default: {
					System.out.println("\nProcessing...");
					Thread.sleep(3000);
					System.out.println("\nInvalid Payments Method Selection.");
				}
				}
				break;
			}
			default : {
				System.out.println("\nProcessing...");
				Thread.sleep(3000); 
				System.out.println("\nInvalid Food Selection");
			}
			}
			break;
			}
		default : {
			System.out.println("\nProcessing...");
			Thread.sleep(3000); 
			System.out.println("\nInvalid Hotel Selection");}
		}
	}

}