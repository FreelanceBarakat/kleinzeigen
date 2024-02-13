package exercise.model;

import java.time.LocalDate;

public class User {
    public User() {
    }

    public User(String name, Gender gender, LocalDate birthdate) {
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    private String name;
    private Gender gender;

    private LocalDate birthdate;

    public enum Gender {
        Female,
        Male
    }
}
