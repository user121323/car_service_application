package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.Car;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;

import java.util.Date;
import java.util.List;

public interface CarService {
    List<Car> getAllCar();
    List<Car> getAllCar(Car car, Float engineCapacityTo, Date releaseYearTo, Long priceTo);
    Car addCar(Car car);
    void removeCar(Car car);
    Car getCar(long id);
}
