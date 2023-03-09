package homework_3.printable_interface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Book implements Printable {
    private String title;
    private int year;
    private String size;
    private ArrayList<String> authors = new ArrayList<>();
    private String publisher;
    private int pages;

    @Override
    public void print() {
        System.out.println("Book: " + title + " by " + authors);
    }

}
