package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarTransmission;

import java.util.List;

public interface CarTransmissionService {
    List<CarTransmission> getAllCarTransmission();
    CarTransmission addCarTransmission(CarTransmission carTransmission);
    void removeCarTransmission(CarTransmission carTransmission);
    CarTransmission getCarTransmission(long id);
}
