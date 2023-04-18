package pak;

import Homework.UserReporter;
import Homework.UserSaver;


public class Main {
    public static void main(String[] args) {
        User user1 = new User("Nik");
        User user2 = new User("Tom");
        UserReporter.report(user1);
        UserSaver.save(user1);
        UserReporter.report(user2);
        UserSaver.save(user2);
    }

}