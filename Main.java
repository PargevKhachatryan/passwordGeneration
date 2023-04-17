package passwordGeneration;

public class Main {
    public static void main(String[] args) {
        Passwords p = new Passwords();
        p.input();
        System.out.println(p.generatePassword(p.passwordLength, p.complexityLevel));

    }
}
