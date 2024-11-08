public class SecondElement{
    public static void main(String[] args) {

       int[] arr = {5,9,10};
       int maxValue = arr[0];
		
		int n = arr.length;
        
        int secondMax = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++)
         {
            if (arr[i] > maxValue)
             {
                secondMax = maxValue;
                maxValue = arr[i];
             } else if (arr[i] > secondMax && arr[i] != maxValue) 
             {
                secondMax = arr[i];
             }
        }

        System.out.println(secondMax);
    }
}