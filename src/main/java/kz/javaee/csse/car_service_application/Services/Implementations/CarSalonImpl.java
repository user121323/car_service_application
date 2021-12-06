package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarSalon;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarRegion;
import kz.javaee.csse.car_service_application.Repositories.CarSalonRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarSalonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarSalonImpl implements CarSalonService {
    @Autowired
    private CarSalonRepository carSalonRepository;


    @Override
    public List<CarSalon> getAllCarSalon() {
        return carSalonRepository.findAll();
    }

    @Override
    public CarSalon addCarSalon(CarSalon carSalon) {
        return carSalonRepository.save(carSalon);
    }

    @Override
    public void removeCarSalon(CarSalon carSalon) {
        carSalonRepository.delete(carSalon);
    }

    @Override
    public CarSalon getCarSalon(long id) {
        Optional<CarSalon> opt = carSalonRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }

}
