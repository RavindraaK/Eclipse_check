package JBK;

import java.util.*;
public class DigitCount {

	public static void main(String[] args) {
		
		Scanner read = new Scanner (System.in);
		int num = read.nextInt();

		
		if(num >= 0 && num <= 9)
		{
			System.out.println(num+" It is a single Digit number.");
		}
		else if(num >= 10 && num <= 99)
		{
			System.out.println(num+" It is a Double Digit number.");
		}
		else
		{
			System.out.println(num+" It is multiple Digit number.");
		}

	}

}
