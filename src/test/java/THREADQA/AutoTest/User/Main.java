package THREADQA.AutoTest.User;

public class Main {

    static void main(String[] args) {

        User user1 = new User("user1","user1@gmail.com",23);
        User user2 = new User("user2","user@gmail.com",25);

        System.out.println(user1.getLogin());
        System.out.println(user2.getAge());
    }
}
