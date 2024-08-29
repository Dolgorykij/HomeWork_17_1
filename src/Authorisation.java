import java.util.regex.Pattern;

public class Authorisation {

    private static final Pattern PATTERN = Pattern.compile("[a-zA-Z0-9_]+");

    public static void authorisation(String login, String password, String confirmPassword) {
        if (login.length() > 20 || !PATTERN.matcher(login).matches()) {
            throw new WrongLoginException();
        }
        if (password.length() > 20 || !PATTERN.matcher(password).matches() || !password.equals(confirmPassword)) {
            throw new WrongPasswordException();
        }
    }
}
//    private static boolean auLogin (String login) {
//        for (int i = 0; i < login.length(); i++) {
//            var a = Character.toLowerCase(login.charAt(i));
 //           if ((a < 'a' || a > 'z') && (a > '0' || a < '9') && a != '_'){
 //               return false;
 //           }
 //       }
 //       return true;
 //   }
 //   private static boolean auPassword (String password) {
 //       for (int i = 0; i < password.length(); i++) {
 //           var a = Character.toLowerCase(password.charAt(i));
//            if ((a < 'a' || a > 'z') && (a > '0' || a < '9') && a != '_'){
 //               return false;
//            }
//        }
//        return true;
//    }
//}
