package MainSystem;

public class User {
    private String username;
    private String password;

    public User(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    //TODO
}
