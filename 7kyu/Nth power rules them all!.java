public class Kata {
  public static int modifiedSum(int[] array, int power) {
    int sum = 0 ;
    int sum1 = 0 ;
    int res = 1;
    for (int i = 0 ; i < array.length; i++)
    {
    sum1+=array[i];
    for (int j = 0; j < power; j++)
    {
    res*=array[i];
    }
    sum+=res;
    res = 1 ;
    }
    
    return sum-sum1;
  }
}