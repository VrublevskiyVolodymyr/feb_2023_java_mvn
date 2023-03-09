package homework_3.printable_interface;


import java.util.ArrayList;


public class Magazine extends Book implements Printable{
    private String category;
    private int issueNumber;

    public Magazine() {
    }

    public Magazine(String title, int year, String size, ArrayList<String> authors, String publisher, int pages, String category, int issueNumber) {
        super(title, year, size, authors, publisher, pages);
        this.category = category;
        this.issueNumber = issueNumber;
    }

    public String getCategory() {
        return category;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "category='" + category + '\'' +
                ", issueNumber=" + issueNumber +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Magazine: " + getTitle() + " Issue #" + issueNumber);
    }
}
