package user;

/*
Дочерний класс User, в нем описываются все функции, что связано с именем
 */
public class UserName extends User {
    public UserName(String name, String login, String password) {
        super(name, login, password);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
}