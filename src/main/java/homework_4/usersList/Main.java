package homework_4.usersList;
//Створити List Юзерів
//        - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
//
//        створити ArrayList зі словами на 15-20 елементів.
//        - відсортувати його за алфавітом .


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users1 = new ArrayList<>();
        users1.add(new User("vasya", 35));
        users1.add(new User("petya", 38));
        users1.add(new User("kolya", 25));
        users1.add(new User("sanya", 46));
        users1.add(new User("mykola", 16));
        users1.add(new User("sergiy", 26));
        users1.add(new User("orest", 45));

        users1.sort((o1, o2) -> o1.getAge()-o2.getAge());
        System.out.println(users1);

        users1.sort((o1, o2) -> o2.getAge()-o1.getAge());
        System.out.println(users1);


    }
}
