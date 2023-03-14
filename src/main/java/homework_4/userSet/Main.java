package homework_4.userSet;

//Створити клас котрий відповідає наступній моделі
//        {
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого

import homework_4.userSet.enums.Gender;
import homework_4.userSet.models.Skills;
import homework_4.userSet.models.User;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(1, "Max", "Popov", "popov@gmail.com", 18, Gender.MALE, new ArrayList<>(), "Kia", 2008, 600);
        ArrayList<Skills> skills1 = user1.getSkills();
        skills1.add(new Skills("java", 10));
        skills1.add(new Skills("js", 5));
        skills1.add(new Skills("c++", 5));

        User user2 = new User(2, "Vasya", "Vasylov", "vasyav@gmail.com", 20, Gender.MALE, new ArrayList<>(), "Kia", 2009, 800);
        ArrayList<Skills> skills2 = user2.getSkills();
        skills2.add(new Skills("python", 10));
        skills2.add(new Skills("js", 5));

        User user3 = new User(3, "Nadya", "Nadova", "nadya@gmail.com", 22, Gender.FEMALE, new ArrayList<>(), "BMW", 2010, 600);
        ArrayList<Skills> skills3 = user3.getSkills();
        skills3.add(new Skills("java", 10));
        skills3.add(new Skills("js", 5));
        skills3.add(new Skills("python", 10));

        User user4 = new User(4, "Anna", "Annova", "anna@gmail.com", 18, Gender.FEMALE, new ArrayList<>(), "Ford", 2008, 600);
        ArrayList<Skills> skills4 = user4.getSkills();
        skills4.add(new Skills("java", 10));
        skills4.add(new Skills("js", 5));
        skills4.add(new Skills("nodejs", 5));

        User user5 = new User(5, "Inna", "Innova", "inna@gmail.com", 28, Gender.FEMALE, new ArrayList<>(), "Toyota", 2020, 600);
        ArrayList<Skills> skills5 = user5.getSkills();
        skills5.add(new Skills("js", 5));

        User user6 = new User(6, "Ivan", "Ivanov", "ivan@gmail.com", 43, Gender.MALE, new ArrayList<>(), "Subaru", 2016, 900);
        ArrayList<Skills> skills6 = user6.getSkills();
        skills6.add(new Skills("java", 10));
        skills6.add(new Skills("js", 5));
        skills6.add(new Skills("nodejs", 5));

        User user7 = new User(7, "Sasha", "Sashov", "sasha@gmail.com", 36, Gender.MALE, new ArrayList<>(), "Audi", 2007, 600);
        ArrayList<Skills> skills7 = user7.getSkills();
        skills7.add(new Skills("js", 5));
        skills7.add(new Skills("nodejs", 5));
        skills7.add(new Skills("python", 10));
        skills7.add(new Skills("java", 10));


        User user8 = new User(8, "Olya", "Olegivna", "olya@gmail.com", 25, Gender.FEMALE, new ArrayList<>(), "Mersedes", 2010, 700);
        ArrayList<Skills> skills8 = user8.getSkills();
        skills8.add(new Skills("java", 10));
        skills8.add(new Skills("js", 5));

        User user9 = new User(9, "Kolya", "Koval", "kolya@gmail.com", 33, Gender.MALE, new ArrayList<>(), "Kia", 2008, 600);
        ArrayList<Skills> skills9 = user9.getSkills();
        skills9.add(new Skills("java", 10));
        skills9.add(new Skills("c++", 5));

        User user10 = new User(10, "Lida", "Popova", "lida@gmail.com", 36, Gender.FEMALE, new ArrayList<>(), "Volvo", 2020, 1200);
        ArrayList<Skills> skills10 = user10.getSkills();
        skills10.add(new Skills("java", 10));
        skills10.add(new Skills("js", 5));
        skills10.add(new Skills("nodejs", 5));
        skills10.add(new Skills("c++", 10));
        skills10.add(new Skills("python", 10));

        HashSet<User> userHashSet = new HashSet<>();
        userHashSet.add(user1);
        userHashSet.add(user2);
        userHashSet.add(user3);
        userHashSet.add(user4);
        userHashSet.add(user5);
        userHashSet.add(user6);
        userHashSet.add(user7);
        userHashSet.add(user8);
        userHashSet.add(user9);
        userHashSet.add(user10);

        userHashSet.removeIf(user -> user.getGender() == Gender.MALE);

        userHashSet.forEach(System.out::println);
        System.out.println();

        TreeSet<User> userTreeSet = new TreeSet<>();
        userTreeSet.add(user1);
        userTreeSet.add(user2);
        userTreeSet.add(user3);
        userTreeSet.add(user4);
        userTreeSet.add(user5);
        userTreeSet.add(user6);
        userTreeSet.add(user7);
        userTreeSet.add(user8);
        userTreeSet.add(user9);
        userTreeSet.add(user10);

        Set<User> userTreeSet2 = userTreeSet.stream()
                .sorted((o1, o2) -> o1.getSkills().size()-o2.getSkills().size())
                .collect(Collectors.toCollection(LinkedHashSet::new));

        userTreeSet2.forEach(System.out::println);
    }
}
