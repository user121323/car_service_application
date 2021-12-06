package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarOutsides;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;

import java.util.List;

public interface CarOutsidesService {
    List<CarOutsides> getAllCarOutsides();
    CarOutsides addCarOutsides(CarOutsides carOutsides);
    void removeCarOutsides(CarOutsides carOutsides);
    CarOutsides getCarOutsides(long id);
}
