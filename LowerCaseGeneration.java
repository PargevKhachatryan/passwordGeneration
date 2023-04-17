package passwordGeneration;

import java.util.Random;

public class LowerCaseGeneration {
    public static char lowerCase() {
         int first = 'a';
         int last = 'z';

        Random rand = new Random();
        return (char)(rand.nextInt(last - first  ) + first);
    }
}
