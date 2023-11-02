package JBK;

import java.util.*;

public class WeekDay {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Enter week number :");
		byte Week = read.nextByte();
		
		read.close();
		
		if(Week == 1)
		{
			System.out.println("Monday");
		}
		else if(Week == 2)
		{
			System.out.println("Tuesday");
		}
		else if(Week == 3)
		{
			System.out.println("Wednesday");
		}
		else if(Week == 4)
		{
			System.out.println("Thursday");
		}
		else if(Week == 5)
		{
			System.out.println("Firday");
		}
		else if(Week == 6)
		{
			System.out.println("Saturday");
		}
		else if(Week == 7)
		{
			System.out.println("Sunday");
		}
		else
		{
			System.out.println("Invalid Week");
		}

	}

}
