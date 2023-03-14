package homework_4.zooClub;

//Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
//        В зооклубі створити методи, та застосувати їх
//        1) додати учасника в клуб;
//        2) додати тваринку до учасника клубу.
//        3) видалити тваринку з власника.
//        4) видалити учасника клубу.
//        5) видалити конкретну тваринку з усіх власників.
//        6) вивести на екран зооклуб.
//        Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
//        Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку

public class Main {
    public static void main(String[] args) {
        ZooClub zooClub = new ZooClub();

        Pet pet1 = new Pet("Cat", "Whiskers");
        Pet pet2 = new Pet("Dog", "Fido");
        Pet pet3 = new Pet("Fish", "Goldie");
        Pet pet4 = new Pet("Bird", "Polly");
        Pet pet5 = new Pet("Rabbit", "Thumper");
        Pet pet6 = new Pet("Hamster", "Nibbles");
        Pet pet7 = new Pet("Snake", "Monty");
        Pet pet8 = new Pet("Turtle", "Speedy");
        Pet pet9 = new Pet("Guinea Pig", "Puddles");
        Pet pet10 = new Pet("Lizard", "Spike");

        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 32);
        Person person3 = new Person("Charlie", 19);
        Person person4 = new Person("David", 27);
        Person person5 = new Person("Eve", 21);
        Person person6 = new Person("Frank", 38);
        Person person7 = new Person("Grace", 29);
        Person person8 = new Person("Hank", 41);
        Person person9 = new Person("Irene", 23);
        Person person10 = new Person("Julia", 36);

        zooClub.addMember(person1);
        zooClub.addMember(person2);
        zooClub.addMember(person3);
        zooClub.addMember(person4);
        zooClub.addMember(person5);
        zooClub.addMember(person6);
        zooClub.addMember(person7);
        zooClub.addMember(person8);
        zooClub.addMember(person9);
        zooClub.addMember(person10);

        zooClub.addPet(person1, pet1);
        zooClub.addPet(person1, pet2);
        zooClub.addPet(person1, pet3);
        zooClub.addPet(person2, pet2);
        zooClub.addPet(person2, pet4);
        zooClub.addPet(person3, pet1);
        zooClub.addPet(person3, pet5);
        zooClub.addPet(person3, pet6);
        zooClub.addPet(person4, pet7);
        zooClub.addPet(person6, pet8);
        zooClub.addPet(person6, pet10);
        zooClub.addPet(person7, pet9);
        zooClub.addPet(person8, pet6);
        zooClub.addPet(person8, pet10);
        zooClub.addPet(person9, pet3);
        zooClub.addPet(person9, pet7);
        zooClub.addPet(person10, pet5);
        zooClub.addPet(person10, pet9);

        System.out.println("Initial state of the zoo club:");
        zooClub.displayClub();


        System.out.println("Removing a pet from a member:");
        zooClub.removePet(person1, pet1);
        zooClub.displayClub();


        System.out.println("Removing a member:");
        zooClub.removeMember(person5);
        zooClub.displayClub();

        System.out.println("Removing a pet from all members:");
        zooClub.removePetFromAll(pet10);
        zooClub.displayClub();
    }
    }

