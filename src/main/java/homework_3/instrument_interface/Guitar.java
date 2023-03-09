package homework_3.instrument_interface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Guitar implements Instrument {
    private int numOfStrings;

    @Override
    public void play() {
        System.out.println("Guitar plays with " + numOfStrings + " strings");
    }
}
