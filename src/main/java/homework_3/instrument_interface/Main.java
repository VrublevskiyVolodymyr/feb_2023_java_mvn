package homework_3.instrument_interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Guitar guitar= new Guitar(7);
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
