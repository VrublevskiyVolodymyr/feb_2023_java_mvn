package homework_2.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = "owner")


public class DriveLicense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String series;

    @OneToOne(cascade = {CascadeType.ALL}, mappedBy = "driveLicense", fetch = FetchType.LAZY)
    private Owner owner;

    public DriveLicense(String series) {
        this.series = series;
    }
}
