package kz.javaee.csse.car_service_application.Entities;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBrand;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarRegion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_car_spare_parts")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarSpareParts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @OneToOne
    private CarBrand carBrand;

    @OneToOne
    private CarModel carModel;

    @OneToOne
    private CarRegion carRegion;

    @OneToOne
    private Users users;

    @Column(name = "isNew")
    private Boolean isNew;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Long price;

    @Column(name="added_date")
    private Date date;

    @ManyToMany
    private List<CarSpareImg> url_img;
}
