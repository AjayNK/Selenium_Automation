package Scripts;

public class SingleDimArray {

	public static void main(String[] args) throws InterruptedException 
	{
				//datatype[] variable_name = new datatype[size]
				int[] arr = new int[5];
				
				arr[0] = 23;
				arr[1] = 24;
				arr[2] = 27;
				arr[3] = 55;
				arr[4] = 35;

				//to get the array count
				System.out.println("Total values present inside array:"+arr.length);
				//for(datatype variable_name:collections)
/*				for(int element:arr)
				{
					System.out.println(element);
					Thread.sleep(2000);
				}*/
				
				for(int i=0;i<arr.length;i++)
				{
					System.out.println(arr[i]);
					Thread.sleep(2000);
				}

	}

}
