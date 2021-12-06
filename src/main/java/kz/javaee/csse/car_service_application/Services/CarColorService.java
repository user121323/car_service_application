package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBrand;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarColor;

import java.util.List;

public interface CarColorService {
    List<CarColor> getAllCarColor();
    CarColor addCarColor(CarColor carColor);
    void removeCarColor(CarColor carColor);
    CarColor getCarColor(long id);
}
