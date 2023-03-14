package homework_3.clothes_interface;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public abstract class Clothes {
    private  Size size;
    private double cost;
    private String color;
}
