package user;
/*
Родительский класс, в нем описываются основные параметры
 */
public class User {
    protected String password;
    protected String login;
    protected String name;

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }
}