package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarSteeringWheel;
import kz.javaee.csse.car_service_application.Entities.CarSpareParts;
import kz.javaee.csse.car_service_application.Repositories.CarSteeringWheelRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarSteeringWheelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarSteeringWheelImpl implements CarSteeringWheelService {
    @Autowired
    private CarSteeringWheelRepository carSteeringWheelRepository;


    @Override
    public List<CarSteeringWheel> getAllCarSteeringWheel() {
        return carSteeringWheelRepository.findAll();
    }

    @Override
    public CarSteeringWheel addCarSteeringWheel(CarSteeringWheel carSteeringWheel) {
        return carSteeringWheelRepository.save(carSteeringWheel);
    }

    @Override
    public void removeCarSteeringWheel(CarSteeringWheel carSteeringWheel) {
        carSteeringWheelRepository.delete(carSteeringWheel);
    }

    @Override
    public CarSteeringWheel getCarSteeringWheel(long id) {
        Optional<CarSteeringWheel> opt = carSteeringWheelRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }

}
