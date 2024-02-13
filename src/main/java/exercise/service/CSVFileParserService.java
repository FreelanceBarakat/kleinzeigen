package exercise.service;

import exercise.model.User;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class CSVFileParserService {
    private final static Logger logger = Logger.getLogger(CSVFileParserService.class.getName());
    private static final String FILE_DELIMITER = ", ";

    public List<User> getUsers(final String filePath)
            throws IOException {
        logger.info("Parsing file of path " + filePath);

        final ArrayList<User> users = new ArrayList<>();

        try (final BufferedReader br
                     = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                users.add(getUser(line));
            }
        }
        return users;
    }

    private static User getUser(final String line) {
        final String[] userDetails = line.split(FILE_DELIMITER);

        final DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        final LocalDate birthdate = LocalDate.parse(userDetails[2], format);

        return new User(
                userDetails[0],
                User.Gender.valueOf(userDetails[1]),
                birthdate
        );

    }
}
