package homework_1.actor.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;

@Entity
@Table(name = "actor")
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private short actor_id;
    private String first_name;
    private String last_name;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Timestamp last_update;

    public Actor(String first_name, String last_name) {
        this.first_name = first_name;
        this.last_name = last_name;
    }
}
