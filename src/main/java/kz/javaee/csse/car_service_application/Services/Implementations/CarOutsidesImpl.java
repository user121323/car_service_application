package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarOptions;
import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarOutsides;
import kz.javaee.csse.car_service_application.Repositories.CarOutsidesRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarOutsidesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarOutsidesImpl implements CarOutsidesService {
    @Autowired
    private CarOutsidesRepository carOutsidesRepository;


    @Override
    public List<CarOutsides> getAllCarOutsides() {
        return carOutsidesRepository.findAll();
    }

    @Override
    public CarOutsides addCarOutsides(CarOutsides carOutsides) {
        return carOutsidesRepository.save(carOutsides);
    }

    @Override
    public void removeCarOutsides(CarOutsides carOutsides) {
        carOutsidesRepository.delete(carOutsides);
    }

    @Override
    public CarOutsides getCarOutsides(long id) {
        Optional<CarOutsides> opt = carOutsidesRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }

}
