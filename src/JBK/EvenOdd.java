package JBK;
import java.util.*;
public class EvenOdd {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		byte n = read.nextByte() ;
		if(n % 2 == 0) {
			System.out.println("Even no.");
		}
		else {
			System.out.println("Odd No.");
		}

	}

}
