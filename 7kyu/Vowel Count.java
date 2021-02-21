public class Vowels {

  public static int getCount(String str) {
    int vowelsCount = 0;
    char [] consonant = "aeiou".toCharArray(); 
    char [] suspect = str.toCharArray();
        
        for (int i = 0; i < suspect.length; ++i) {
            for (int j = 0; j < consonant.length; j++) {
                if(suspect[i] == consonant[j]) 
                    vowelsCount++;
            }
        }
        return vowelsCount;
    }

}