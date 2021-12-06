package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBody;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBrand;

import java.util.List;

public interface CarBrandService {
    List<CarBrand> getAllCarBrand();
    CarBrand addCarBrand(CarBrand carBrand);
    void removeCarBrand(CarBrand carBrand);
    CarBrand getCarBrand(long id);
}
