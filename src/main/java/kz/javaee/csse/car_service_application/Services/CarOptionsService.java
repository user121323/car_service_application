package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarOptions;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;

import java.util.List;

public interface CarOptionsService {
    List<CarOptions> getAllCarOptions();
    CarOptions addCarOptions(CarOptions carOptions);
    void removeCarOptions(CarOptions carOptions);
    CarOptions getCarOptions(long id);
}
