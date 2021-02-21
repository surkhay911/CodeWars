public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    
    int summa = 0;
    
    for (int i = 0; i < arr1.length; i++)
    {
    summa += arr1[i] + arr2[i];
    }
    
    return summa;
  }

}