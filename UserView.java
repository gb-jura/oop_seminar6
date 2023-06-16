import java.util.Scanner;
import user.*;

public class UserView {

    private Scanner scanner = new Scanner(System.in);

    public void showRegisterForm() {
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Ваш логин:");
        if (!UserLogin.validataLogin){
            System.out.println("Логин занят, придумайте другой:");
            String login = scanner.nextLine();
        }
        System.out.println("Придумайте пароль:");
        String password = scanner.nextLine();
        if (UserPassword.validataPassword(password)){
            System.out.println("Зарегистрирован!");
        }
        else {
            System.out.println("Неверный пароль:");
            password = scanner.nextLine();
        }
    }

    public void showLoginForm() {
        System.out.println("Ваш логин:");
        String login = scanner.nextLine();
        System.out.println("Ваш пароль:");
        String password = scanner.nextLine();
        System.out.println("Авторизация прошла успешно!");
    }

    public void showChangePasswordForm() {
        System.out.println("Введите старый пароль:");
        String oldPassword = scanner.nextLine();
        System.out.println("Введите новый пароль:");
        String newPassword = scanner.nextLine();
        if (UserPassword.validataPassword(newPassword)){
            System.out.println("Зарегистрирован!");
        }
        else {
            System.out.println("Неверный пароль:");
            newPassword = scanner.nextLine();
        }
        System.out.println("Пароль изменен!");
    }
}