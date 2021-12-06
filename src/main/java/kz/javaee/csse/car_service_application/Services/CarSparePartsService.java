package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;
import kz.javaee.csse.car_service_application.Entities.CarSpareParts;

import java.util.List;

public interface CarSparePartsService {
    List<CarSpareParts> getAllCarSpareParts();
    List<CarSpareParts> getAllCarSparePartsByPoints(CarSpareParts carSpareParts, Long priceTo);
    CarSpareParts addCarSpareParts(CarSpareParts carSpareParts);
    void removeCarSpareParts(CarSpareParts carSpareParts);
    CarSpareParts getCarSpareParts(long id);
}
