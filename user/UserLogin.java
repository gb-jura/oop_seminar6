package user;

/*
Дочерний класс User, в нем описываются все функции, что связано с логином
 */
public class UserLogin extends User {
    public static boolean validataLogin;

    public UserLogin(String name, String login, String password) {
        super(name, login, password);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        
        this.login = login;
    }

    public void validataLogin(String login){
        //проверка на уникальность логина
    }
}