package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarOptics;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;

import java.util.List;

public interface CarOpticsService {
    List<CarOptics> getAllCarOptics();
    CarOptics addCarOptics(CarOptics carOptics);
    void removeCarOptics(CarOptics carOptics);
    CarOptics getCarOptics(long id);
}
