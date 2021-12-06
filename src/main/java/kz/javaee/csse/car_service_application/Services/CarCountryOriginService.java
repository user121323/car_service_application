package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarColor;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarCountryOrigin;

import java.util.List;

public interface CarCountryOriginService {
    List<CarCountryOrigin> getAllCarCountryOrigin();
    CarCountryOrigin addCarCountryOrigin(CarCountryOrigin carCountryOrigin);
    void removeCarCountryOrigin(CarCountryOrigin carCountryOrigin);
    CarCountryOrigin getCarCountryOrigin(long id);
}
