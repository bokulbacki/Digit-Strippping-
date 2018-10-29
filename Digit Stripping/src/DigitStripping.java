import java.util.Scanner;
public class DigitStripping
	{
		static Scanner userInput = new Scanner(System.in);
		static int [] array = new int [6];
		static int num;
		static int digits;
		
		
		public static void main (String[] args)
		{
//			createArray();
//			reportDigits();
			roundToTen();
			
		}
		public static void createArray()
		{
			
			
			System.out.println("Input a 6 digit number");
			num = userInput.nextInt();
			
			for (int i =0; i<array.length; i++)
			{
				digits = num%10;
				num = num/10;
				array [i] = digits;
				System.out.println(array[i]);
			}
		}
		
		public static void reportDigits()
		{
			System.out.println("Input a number");
			int num1 = userInput.nextInt();
			int digit1;
			int counter = 0;
			int odd = 0;
			int add= 0;
			boolean run = true;
			while (run)
				{
					digit1 = num1%10;
					num1=num1/10;
					counter++;
					
					if (digit1%2==1)
						{
							odd++;
						}
					
					if (digit1 == 0)
						{
							run= false;
						}
					add = add + digit1;
				}
			
			System.out.println("There are " + (counter-1) + " digits.");
			System.out.println("There are " + (odd) + " odd digits.");
			System.out.println("The total is " + add);
		}
		
		public static void roundToTen()
			{
				System.out.println("Input a number");
				int num2 = userInput.nextInt();
				int zero = num2%10;
				num2= num2-zero;
				System.out.println(num2 + 10);
			}
		
		
	}

