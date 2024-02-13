package exercise.service;

import exercise.model.User;

import java.io.IOException;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class UserService {
    private final static Logger logger = Logger.getLogger(UserService.class.getName());

    public List<User> getUsers(final String fileName) throws IOException {
        logger.info("Initializing users data");
        final CSVFileParserService csvFileParserService = new CSVFileParserService();
        return csvFileParserService.getUsers(fileName);
    }

    public long getFemaleCount(final List<User> users) {
        return users.stream()
                .filter(user -> user.getGender() == User.Gender.Female)
                .count();
    }

    public Optional<User> getOldestPerson(final List<User> users) {
        return users.stream()
                .min(Comparator.comparing(User::getBirthdate));
    }
}
