package JBK;
import java.math.*;

public class Demo {

	public static void main(String[] args) {
		
		System.out.println("Subject Marks");
		
		int English = 35;
		int hindi = 35;
		int marathi = 35;
		int math = 35;
		int science= 35;
		
		double total=500;
		
		double marks =English + hindi + marathi + math + science;
		
		double percentage=(marks*100)/total;
		
		System.out.println("..............");
		System.out.println("Marathi      "+marathi);
		System.out.println("Maths        "+English);
		System.out.println("English      "+English);
		System.out.println("Science      "+science);
		System.out.println("Hindi        "+hindi);
		System.out.println("............................");
		
		System.out.println("Total:            "+total);
		System.out.println("Obtain Marks:     "+marks);
		System.out.println("Percentage:       "+percentage);
		
		
		
		
		

	}

}
