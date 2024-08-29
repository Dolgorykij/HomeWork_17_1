public class Main {
    public static void main(String[] args) {

        try {
            Authorisation.authorisation("login", "password", "password");
        } catch (WrongLoginException a) {
            System.out.println("Логин может содержать только латинские буквы верхнего и нижнего регистра и знак _");
        } catch (WrongPasswordException a) {
            System.out.println("Пароли должны совпадать и могут содержать только латинские буквы верхнего и нижнего регистра и знак _");
        } finally {
            System.out.println("performing authorization");
        }
    }
}