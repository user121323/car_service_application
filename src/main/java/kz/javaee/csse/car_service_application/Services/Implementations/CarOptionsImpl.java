package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarOptics;
import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarOptions;
import kz.javaee.csse.car_service_application.Repositories.CarOptionsRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarOptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarOptionsImpl implements CarOptionsService {
    @Autowired
    private CarOptionsRepository carOptionsRepository;


    @Override
    public List<CarOptions> getAllCarOptions() {
        return carOptionsRepository.findAll();
    }

    @Override
    public CarOptions addCarOptions(CarOptions carOptions) {
        return carOptionsRepository.save(carOptions);
    }

    @Override
    public void removeCarOptions(CarOptions carOptions) {
        carOptionsRepository.delete(carOptions);
    }

    @Override
    public CarOptions getCarOptions(long id) {
        Optional<CarOptions> opt = carOptionsRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }
}
