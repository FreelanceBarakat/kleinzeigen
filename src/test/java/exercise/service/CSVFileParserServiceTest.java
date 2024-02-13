package exercise.service;

import exercise.model.User;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import static exercise.model.User.Gender.Female;
import static exercise.model.User.Gender.Male;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.tuple;

class CSVFileParserServiceTest {

    @Test
    void getUsers_when_given_csv_file_path_should_return_list_of_users() throws IOException {
        final CSVFileParserService csvFileParserService = new CSVFileParserService();
        final String fileName = "src/testdata/address-book.csv";
        final List<User> userList = csvFileParserService.getUsers(fileName);

        assertThat(userList)
                .isNotNull()
                .hasSize(5)
                .extracting(
                        User::getName,
                        User::getBirthdate,
                        User::getGender
                ).contains(
                        tuple("Jon", LocalDate.of(1985, 3, 9), Male),
                        tuple("Paul", LocalDate.of(1985, 7, 20), Male),
                        tuple("Jessica", LocalDate.of(1990, 11, 5), Female),
                        tuple("Sarah", LocalDate.of(1980, 8, 17), Female),
                        tuple("Michael", LocalDate.of(1973, 04, 20), Male)
                );
    }
}