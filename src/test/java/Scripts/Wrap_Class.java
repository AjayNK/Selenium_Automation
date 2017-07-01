package Scripts;

public class Wrap_Class {

	public static void main(String[] args) 
	{
		//converting non-primitive datatype to primitive datatype
			String x = "123";
			//double db = Double.parseDouble(x);
			//System.out.println(db);
				
			//int pb = Integer.parseInt(x);
			//System.out.println(pb);
				
				
			//converting primitive datatype to non-primitive datatype
				
			double y = 234.8;
			int z = 45;
							
			String s1 = String.valueOf(y);
			String s2 = String.valueOf(z);
				
			System.out.println(s1);
			System.out.println(s2);
				
				//second way
				/*Double d = y;
				System.out.println(d.toString());
				
				Integer e = z;
				System.out.println(e.toString());
*/
	}

}
