package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarDrive;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarEngine;
import kz.javaee.csse.car_service_application.Repositories.CarEngineRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarEngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarEngineImpl implements CarEngineService {
    @Autowired
    private CarEngineRepository carEngineRepository;


    @Override
    public List<CarEngine> getAllCarEngine() {
        return carEngineRepository.findAll();
    }

    @Override
    public CarEngine addCarEngine(CarEngine carEngine) {
        return carEngineRepository.save(carEngine);
    }

    @Override
    public void removeCarEngine(CarEngine carEngine) {
        carEngineRepository.delete(carEngine);
    }

    @Override
    public CarEngine getCarEngine(long id) {
        Optional<CarEngine> opt = carEngineRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }
}
