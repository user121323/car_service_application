package kz.javaee.csse.car_service_application.Entities.CarDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_car_steering_wheel")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarSteeringWheel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;
}
