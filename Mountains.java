public class Mountains
{
	public static void main(String[] args) 
	{
		
		int [] height={50,40,80,100,60,150};
		int largestValue = height[0];

		for (int i=0;i<height.length;i++)
		{
			if (height[i]>largestValue)
			{
				    
                largestValue = height[i];
			}
      } 
     System.out.println(largestValue);
   }
}
           


