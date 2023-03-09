package homework_3.printable_interface;

//        а) Визначити інтерфейс Printable, який містить метод void print().
//        б) Визначити клас Book, який реалізує інтерфейс Printable.
//        в) Визначити клас Magazine, який реалізує інтерфейс Printable.
//        г) Створити масив типу Printable, який міститиме книжки та журнали.

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Book book = new Book("The alchemist", 2003, "120*160", new ArrayList<>(), "Sofia", 204);
        book.getAuthors().add("Paulo Coelho");

        Magazine magazine = new Magazine("Local history", 2023, "210x270", new ArrayList<>(), "Ukrainian Galician Assembly", 20, "history", 25);
        magazine.getAuthors().add(0, "Shevchenco");
        magazine.getAuthors().add(1, "Petrov");

        ArrayList<Printable> printables = new ArrayList<>();
        printables.add(book);
        printables.add(magazine);

        for (Printable printable : printables) {
            printable.print();
        }
    }
}
