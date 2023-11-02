package JBK;

public class CheckMarried {

	public static void main(String[] args) {
		
		char married = 'n';
		char gender = 'm';
		
		if(married == 'y' || married == 'Y')
		{
			if(gender == 'm' || gender == 'M')
			{
				System.out.println("Mr");
			}
			else
			{
				System.out.println("Mrs");
			}
		}
		else
		{
			if(gender == 'm' || gender == 'M')
			{
				System.out.println("Master");
			}
			else
			{
				System.out.println("Miss");
			}
		}

	}

}
