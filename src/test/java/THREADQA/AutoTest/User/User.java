package THREADQA.AutoTest.User;

public class User {

    private String login;
    private String email;
    private int age;

    public User(String login, String email, int age){
        this.login = login;
        this.email = email;
        this.age = age;
    }

    public String getLogin() {
        return login;
    }

    public String getEmail() {
        return  email;
    }

    public int getAge() {
        return age;
    }
}
