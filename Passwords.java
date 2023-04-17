package passwordGeneration;

import java.util.Scanner;

public class Passwords {

    int passwordLength;
    int complexityLevel;

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password length (minimum 8 characters): ");
        passwordLength = scanner.nextInt();
        if (passwordLength < 8) {
            throw new RuntimeException("Minimum 8 characters!!");
        }
        System.out.println("Enter complexity level password 1-3 ( 1 - Easy, 2 - Medium, 3 - Hard )");
        complexityLevel = scanner.nextInt();
        if (complexityLevel < 1 || complexityLevel > 3) {
            throw new RuntimeException("1-3!");
        }
    }

    public String generatePassword(int passwordLength, int complexityLevel) {
        StringBuilder sb = new StringBuilder();
        switch (complexityLevel) {
            case 1: {
                for (int i = 0; i < passwordLength; i++) {
                    if (i % 3 == 1) {
                        sb.append(DigitGeneration.digit());
                    } else sb.append(LowerCaseGeneration.lowerCase());
                }
                break;
            }
            case 2: {
                for (int i = 0; i < passwordLength; i++) {
                    if (i % 2 == 0) {
                        sb.append(LowerCaseGeneration.lowerCase());
                    } else if (i % 3 == 0) {
                        sb.append(UpperCaseGeneration.upperCase());
                    } else if (i == 5 || i == 7 || i == 13) {
                        sb.append(DigitGeneration.digit());
                    } else {
                        sb.append(DigitGeneration.digit());
                    }
                }
                break;
            }

            case 3: {
                for (int i = 0; i < passwordLength; i++) {
                    if (i % 2 == 0) {
                        sb.append(LowerCaseGeneration.lowerCase());
                    } else if (i % 3 == 0) {
                        sb.append(UpperCaseGeneration.upperCase());
                    } else if (i == 5 || i == 7 || i == 13) {
                        sb.append(DigitGeneration.digit());
                    } else {
                        sb.append(SymbolGeneration.symbol());
                    }
                }
                break;
            }

        }

        return sb.toString();

    }
}
