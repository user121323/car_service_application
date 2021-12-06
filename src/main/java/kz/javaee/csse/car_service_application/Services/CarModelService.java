package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarMedia;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBrand;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;

import java.util.List;

public interface CarModelService {
    List<CarModel> getAllCarModel();
    CarModel addCarModel(CarModel carModel);
    void removeCarModel(CarModel carModel);
    CarModel getCarModel(long id);
    List<CarModel> getAllCarModelByCarBrand(CarBrand carBrand);
}
