package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarSalon;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;

import java.util.List;

public interface CarSalonService {
    List<CarSalon> getAllCarSalon();
    CarSalon addCarSalon(CarSalon carSalon);
    void removeCarSalon(CarSalon carSalon);
    CarSalon getCarSalon(long id);
}
