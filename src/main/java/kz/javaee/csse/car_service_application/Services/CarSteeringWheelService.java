package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarSteeringWheel;

import java.util.List;

public interface CarSteeringWheelService {
    List<CarSteeringWheel> getAllCarSteeringWheel();
    CarSteeringWheel addCarSteeringWheel(CarSteeringWheel carSteeringWheel);
    void removeCarSteeringWheel(CarSteeringWheel carSteeringWheel);
    CarSteeringWheel getCarSteeringWheel(long id);
}
