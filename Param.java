public class Param{
	

       public static void main(String [] args)
       {
       	int [] intArray = { 10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200};
       




       	System.out.println("left to right");
       	for (int i=0;i<20;i++)
       	{
           System.out.println(intArray[i]);
       	}

         System.out.println("right to left");
       	for (int i=19;i>=0;i--)
       	{
           System.out.println(intArray[i]);
       	}

        
         System.out.println("skipping 1 element");
       	for (int i=0;i<20;i=i+2)
       	{
           System.out.println(intArray[i]);
       	}

       	System.out.println("middle to left");
       	for (int i=10;i>=0;i--)
       	{
           System.out.println(intArray[i]);
       	}





       }




}