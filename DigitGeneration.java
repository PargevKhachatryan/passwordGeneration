package passwordGeneration;
import java.util.Random;

public class DigitGeneration {
    public static int digit() {
        int min = 0;
        int max = 9;

        Random rand = new Random();
        return (int) (Math.random()*(max-min+1)+min);
    }
}
