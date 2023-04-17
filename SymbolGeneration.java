package passwordGeneration;

import java.util.Random;

public class SymbolGeneration {
    public static char symbol(){
        char first = 32;
        char last = 47;

        Random rand = new Random();
        return (char)(rand.nextInt(last - first ) + first);

    }
}
