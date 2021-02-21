public class Codewars {
  public static String oddOrEven (int[] array) {
  int summa = 0;
  
  for (int i = 0; i < array.length; i++)
  {
  summa += array[i]; 
  }
  
  if (summa%2 == 0) return "even";
  else return "odd";
}
}