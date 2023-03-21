package homework_1.city;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "city")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class City {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private short  city_id;
  private  String city;
  private short  country_id;
  @Temporal(TemporalType.TIMESTAMP)
  @CreationTimestamp
  private Timestamp last_update;

  public City( String city, short country_id) {
    this.city = city;
    this.country_id = country_id;
  }
}
