package JBK;

import java.util.Scanner;

public class AlphabetNot {

	public static void main(String[] args) {
		System.out.println("Enter a Alphabet : ");
       
		char ch = '1';
		
		if((ch >='a' && ch <='z') || (ch >='A' && ch <='Z'))
		{
			System.out.println(ch+" is a alphabet");
		}
		else {
			System.out.println(ch+" is not a alphabet");
		}
    }

}
