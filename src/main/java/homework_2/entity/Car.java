package homework_2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String model;
    @Enumerated(EnumType.STRING)
    private CarType type;
    private int power;
    private double price;
    private int year;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "owner_cars", joinColumns = @JoinColumn(name = "car_id"), inverseJoinColumns = @JoinColumn(name = "owner_id")
    )
    private List<Owner> owner;

    public Car(String model, CarType type, int power, double price, int year) {
        this.model = model;
        this.type = type;
        this.power = power;
        this.price = price;
        this.year = year;
    }
}
