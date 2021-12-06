package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarRegion;

import java.util.List;

public interface CarRegionService {
    List<CarRegion> getAllCarRegion();
    CarRegion addCarRegion(CarRegion carRegion);
    void removeCarRegion(CarRegion carRegion);
    CarRegion getCarRegion(long id);
}
