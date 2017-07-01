package Scripts;

public class TwoDimArray {

	public static void main(String[] args) 
	{
		//datatype[][] variable_name = new datatype[size][size]
				String[][] arr = new String[3][4];
				arr[0][0] = "Apple";
				arr[0][1] = "Orange";
				arr[0][2] = "Mango";
				arr[0][3] = "Banana";

				arr[1][0] = "maruthi";
				arr[1][1] = "Swift";
				arr[1][2] = "i10";
				arr[1][3] = "benz";
				
				arr[2][0] = "testing";
				arr[2][1] = "java";
				arr[2][2] = "bigdata";
				arr[2][3] = "sap";
				
				int row_count = arr.length;
				int col_count = arr[0].length;
				
				for(int i=0;i<row_count;i++)
				{
					for(int j=0;j<col_count;j++)
					{
						System.out.println(arr[i][j]+"------------");
					}
					System.out.println();
				}

	}

}
