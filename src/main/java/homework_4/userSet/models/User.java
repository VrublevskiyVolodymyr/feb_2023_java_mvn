package homework_4.userSet.models;

import homework_4.userSet.enums.Gender;
import lombok.*;

import java.util.ArrayList;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class User implements  Comparable<User> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skills> skills = new ArrayList<>();
    private Car car;

    public User(int id, String name, String surname, String email, int age, Gender gender, ArrayList<Skills> skills, String model, int year, int power) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.skills = skills;
        this.car = new Car(model,year,power);
    }

    @Override
    public int compareTo(User user) {
        return this.id - user.id;
    }
}
