package Scripts;

public class SwitchCaseEx {

	public static void main(String[] args) 
	{
		char grade = 'B';
		switch(grade)
		{
		case 'A':
		{
			System.out.println("Excellent");
			break;
		}
		case 'B':
		{
			System.out.println("Good");
			break;
		}
		case 'C':
		{
			System.out.println("Well Done");
			break;
		}
		case 'D':
		{
			System.out.println("Passed");
			break;
		}
		case 'E':
		{
			System.out.println("Try Again");
			break;
		}	
		default:
		System.out.println("Invalid Grade");
		}

	}

}
