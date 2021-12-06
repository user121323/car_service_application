package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarCountryOrigin;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarDrive;

import java.util.List;

public interface CarDriveService {
    List<CarDrive> getAllCarDrive();
    CarDrive addCarDrive(CarDrive carDrive);
    void removeCarDrive(CarDrive carDrive);
    CarDrive getCarDrive(long id);
}
