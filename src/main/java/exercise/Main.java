package exercise;


import exercise.model.User;
import exercise.service.UserService;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    private final static Logger logger = Logger.getLogger(Main.class.getName());


    public static void main(String[] args) {
        final String fileName = "src/testdata/address-book.csv";
        final UserService userService = new UserService();

        final List<User> users;
        try {
            users = userService.getUsers(fileName);


            System.out.println("Number of females inside address book: " + userService.getFemaleCount(users));
            System.out.println("Oldest person inside address book: " + userService.getOldestPerson(users).get().getName());
        } catch (IOException e) {
            logger.info(" error while parsing file! " + e.getCause());

        }
    }

}
