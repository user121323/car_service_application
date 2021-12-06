package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarDrive;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarEngine;

import java.util.List;

public interface CarEngineService {
    List<CarEngine> getAllCarEngine();
    CarEngine addCarEngine(CarEngine carEngine);
    void removeCarEngine(CarEngine carEngine);
    CarEngine getCarEngine(long id);
}
