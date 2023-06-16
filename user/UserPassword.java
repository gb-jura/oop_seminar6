package user;

/*
Дочерний класс User, в нем описываются все функции, что связано с паролем
 */
public class UserPassword extends User {
    public static boolean validataPassword;

    public UserPassword(String name, String login, String password) {
        super(name, login, password);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static boolean validataPassword(String password){
        //проверка пароля на соответствие требованиям безопасности
        return false;
    }
}