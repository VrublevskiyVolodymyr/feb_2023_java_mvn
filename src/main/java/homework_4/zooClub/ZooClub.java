package homework_4.zooClub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooClub {
    private final Map<Person, List<Pet>>  club;

    public ZooClub() {
        club = new HashMap<>();
    }

    public void addMember(Person person) {
        club.putIfAbsent(person, new ArrayList<>());
    }

    public void addPet(Person person, Pet pet) {
        club.computeIfPresent(person, (key, pets) -> {
            pets.add(pet);
            return pets;
        });
    }

    public void removePet(Person person, Pet pet) {
        club.computeIfPresent(person, (key, pets) -> {
            pets.remove(pet);
            return pets;
        });
    }

    public void removeMember(Person person) {
        club.remove(person);
    }

    public void removePetFromAll(Pet pet) {
        club.values().forEach(pets -> pets.remove(pet));
    }

    public void displayClub() {
        club.forEach((person, pets) -> {
            System.out.println(person.getName() + ":");
            pets.forEach(System.out::println);
            System.out.println();
        });
    }

    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();
    }
}
