package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBody;

import java.util.List;

public interface CarBodyService {
    List<CarBody> getAllCarBody();
    CarBody addCarBody(CarBody carBody);
    void removeCarBody(CarBody carBody);
    CarBody getCarBody(long id);
}
