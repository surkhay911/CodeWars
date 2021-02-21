public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        int avg = (s1 + s2 + s3) / 3;
        
        if (avg >= 90 ) {
        return 'A';
        }
        if (avg < 90  & avg >= 80)
        {
        return 'B';
        }
        if (avg < 80 & avg >= 70)
        {
        return 'C';
        }
        if (avg < 70 & avg >= 60)
        {
        return 'D';
        }
        else {
        return 'F';
        
        
      //  return '';
    }
}
}