public class Clock
{
  public static int Past(int h, int m, int s) 
  {
  int sum = 0; 
  return ((h * 60 * 60000) + (m * 60000) + (s * 1000));
  }
}