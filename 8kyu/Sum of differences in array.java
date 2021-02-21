public class ZywOo {
  public static int sumOfDifferences(int[] arr) {
    //your code;
   int sum = 0;
  for (int j = 0; j < arr.length - 1; j++)
  {
    for (int k = j + 1; k < arr.length; k++)
    {
        if (arr[j] < arr[k])
        {
            int temp = arr[k];
            arr[k] = arr[j];
            arr[j] = temp;
        }
    }
  }
   for (int i = 0; i < arr.length - 1 ;i++)
   {
   sum += arr[i] - arr[i+1] ;
   }
   return sum;
  }
}