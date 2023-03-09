package homework_3.instrument_interface;

//Створити інтерфейс Інструмент та реалізують його класи Гітара, Барабан та Труба.
//        Інтерфейс Інструмент містить метод play()
//        Гітара містить змінні класу кількістьСтрун,
//        Барабан – розмір, Труба – діаметр. Створити масив типу Інструмент, що містить різного типу інструменти.
//        У циклі викликати метод play() для кожного інструменту,
//        який повинен виводити рядок "Грає такий-то інструмент з такими то характеристиками".

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Guitar guitar = new Guitar(7);
        Drum drum = new Drum("large");
        Trumpet trumpet = new Trumpet("brass");

        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(guitar);
        instruments.add(drum);
        instruments.add(trumpet);

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
