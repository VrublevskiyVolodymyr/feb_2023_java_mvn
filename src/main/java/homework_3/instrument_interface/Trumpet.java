package homework_3.instrument_interface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Trumpet implements Instrument {
    private String type;

    @Override
    public void play() {
        System.out.println("Trumpet plays with " + type + " type");
    }
}
