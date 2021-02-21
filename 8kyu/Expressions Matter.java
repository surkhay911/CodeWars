public class Kata
{
    public static int expressionsMatter(int a, int b, int c)
    {
//    Kata.expressionsMatter(2, 1, 2);
    int array[] = new int[5];
    array[0] = a * (b + c);
    array[1] = a * b * c;
    array[2] = a + b * c;
    array[3] = (a + b) * c ;
    array[4] = a + b + c;

    int max = array[0];
    for (int i = 0; i < 5; i++)
    {
    if (max <= array[i]) {max = array[i];}
    }
    return max;
    }
}