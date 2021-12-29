package chapter8;

public class PasswordValidator {

    public static void main(String[] args) {
        String user = "ler";
        String password = "ale657k4@P;";

        if(containUpper(password) && containSpecial(password) && !containUser(password, user) && containEightChar(password)) {
            System.out.println("COOL");
        }
        System.out.println("Done");

    }

    private static boolean containEightChar(String password) {
        if (password.length() >= 8) {
            return true;
        }
        return false;
    }

    private static boolean containUser(String password, String user) {
        return password.contains(user);
    }

    private static boolean containSpecial(String password) {
        for (char letter : password.toCharArray()) {
            if (!Character.isLetterOrDigit(letter)) {
                System.out.println("Not letter/digit: " + letter);
                return true;
            }
        }
        return false;
    }

    private static boolean containUpper(String password) {
        for (char letter : password.toCharArray()) {
            if (Character.isUpperCase(letter)) {
                System.out.println("Is upper: " + letter);
                return true;
            }
        }
        return false;
    }

}
