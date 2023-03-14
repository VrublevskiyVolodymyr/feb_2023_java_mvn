package homework_4.stringArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> wordList = new ArrayList<>();
        wordList.add("banana");
        wordList.add("apple");
        wordList.add("orange");
        wordList.add("pear");
        wordList.add("grape");
        wordList.add("watermelon");
        wordList.add("kiwi");
        wordList.add("pineapple");
        wordList.add("mango");
        wordList.add("strawberry");
        wordList.add("blueberry");
        wordList.add("peach");
        wordList.add("apricot");
        wordList.add("cherry");
        wordList.add("plum");

        wordList.sort(String::compareTo);

        System.out.println(wordList);
    }
}
