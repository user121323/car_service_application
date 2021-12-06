package kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "t_car_optics")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarOptics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;
}
