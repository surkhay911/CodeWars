public class Solution {

    public static boolean check(Object[] a, Object x) {
        // Your code here
        boolean s = false;
        for (int i = 0; i < a.length; i++)
        {
        if (a[i]==x) s = true; 
        }
        return s;
    }

}