package homework_2.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@Data

public class DriveLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String series;


    public DriveLicense(String series) {
        this.series = series;
    }
}
