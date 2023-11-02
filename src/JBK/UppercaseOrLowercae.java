package JBK;

import java.util.*;
public class UppercaseOrLowercae {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		
		char ch = read.next().charAt(0);
		
		if(ch >= 'a' && ch <= 'z')
		{
			System.out.println(ch+" It is a lowercase");
		}
		else if(ch >= 'A' && ch <= 'Z')
		{ 
			System.out.println(ch+" It is a Uppercase");
		}
		else
		{
			System.out.println(ch+" It is not a alphabet");
		}

	}

}
