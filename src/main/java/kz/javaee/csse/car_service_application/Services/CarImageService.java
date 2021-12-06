package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarEngine;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarImage;

import java.util.List;

public interface CarImageService {
    List<CarImage> getAllCarImage();
    CarImage addCarImage(CarImage carImage);
    void removeCarImage(CarImage carImage);
    CarImage getCarImage(long id);
}
