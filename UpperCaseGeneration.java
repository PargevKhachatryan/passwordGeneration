package passwordGeneration;

import java.util.Random;

public class UpperCaseGeneration {

    public static char upperCase() {
        int first = 'A';
        int last = 'Z';

        Random rand = new Random();
        return (char) (rand.nextInt(last - first ) + first);
    }
}

