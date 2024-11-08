public class Sum
{
	public static void main(String[] args)
	 {
		 int [] arr = { 1 , 4 , 6 ,7};


		 for (int i=0;i<arr.length;i++)
		{
		 	for( int j=i+1;j<arr.length;j++)
	    {
		 		int sum = arr[i]+arr[j];
		 	
		 	System.out.println("sum of two array is"+sum);
             return;
        }

		}



		
	}
}