package JBK;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num = 123;
		int reverse = 0;
		System.out.println(num + " before reverse");
		
		while(num != 0)
		{
			
			int remain = num % 10 ;
		    reverse = reverse * 10 + remain;
			num =  num / 10;
		}
		
		System.out.println(reverse + " After reverse");

	}

}
