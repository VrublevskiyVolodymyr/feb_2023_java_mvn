package homework_3.instrument_interface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Drum implements Instrument{
    private String size;

    @Override
    public void play() {
        System.out.println("Drum plays with " + size + " size");
    }
}
