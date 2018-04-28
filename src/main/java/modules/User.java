package modules;

public class User {
    private int id_user;
    private String login;
    private String password;
    private String type;

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User(int id_user, String login, String password, String type) {
        this.id_user = id_user;
        this.login = login;
        this.password = password;
        this.type = type;
    }
}
