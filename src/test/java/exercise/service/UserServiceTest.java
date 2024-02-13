package exercise.service;

import exercise.model.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

class UserServiceTest {

    @Test
    void getFemaleCount_when_given_user_list_should_count_females_in_list() {
        final UserService userService = new UserService();

        final List<User> userList = List.of(
                new User("Michal", User.Gender.Male, LocalDate.of(1992, 06, 01)),
                new User("Natalie", User.Gender.Female, LocalDate.of(1992, 06, 01)),
                new User("kate", User.Gender.Female, LocalDate.of(1992, 06, 01))
        );

        Assertions.assertEquals(userService.getFemaleCount(userList), 2);

    }

    @Test
    void getOldestPerson_when_given_user_list_should_return_oldest_user() {
        final UserService userService = new UserService();

        final List<User> userList = List.of(
                new User("Michal", User.Gender.Male, LocalDate.of(1990, 06, 01)),
                new User("Natalie", User.Gender.Female, LocalDate.of(1992, 06, 01)),
                new User("kate", User.Gender.Female, LocalDate.of(1992, 06, 01))
        );

        Assertions.assertEquals(
                userService.getOldestPerson(userList).get().getName(),
                "Michal"
        );
    }
}