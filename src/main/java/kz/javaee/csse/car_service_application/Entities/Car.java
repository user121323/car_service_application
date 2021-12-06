package kz.javaee.csse.car_service_application.Entities;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.*;
import kz.javaee.csse.car_service_application.Entities.CarDetails.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "t_car")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "price")
    private Long price;

    @Column(name = "engine_capacity")
    private Float engineCapacity;

    @Column(name = "release_date")
    private Date releaseDate;

    @Column(name = "added_date")
    private Date addedDate;

    @Column(name = "mileage")
    private Long mileage;

    @Column(name = "is_new")
    private Boolean isNew;

    @ManyToOne
    private CarBrand carBrand;

    @ManyToOne
    private CarModel carModel;

    @ManyToOne
    private CarCountryOrigin carCountryOrigin;

    @ManyToOne
    private CarBody carBody;

    @ManyToOne
    private CarColor carColor;

    @ManyToOne
    private CarEngine carEngine;

    @ManyToOne
    private CarDrive carDrive;

    @ManyToOne
    private CarRegion carRegion;

    @ManyToOne
    private Users users;

    @ManyToOne
    private CarSteeringWheel carSteeringWheel;

    @ManyToOne
    private CarTransmission carTransmission;

    @ManyToMany
    private List<CarMedia> carMediaList;

    @ManyToMany
    private List<CarOptions> carOptionsList;

    @ManyToMany
    private List<CarOptics> carOpticsList;

    @ManyToMany
    private List<CarSalon> carSalonList;

    @ManyToMany
    private List<CarOutsides> carOutsidesList;

    @ManyToMany
    private List<CarImage> carImageList;


}
