package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarOptics;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;
import kz.javaee.csse.car_service_application.Repositories.CarOpticsRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarOpticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarOpticsImpl implements CarOpticsService {
    @Autowired
    private CarOpticsRepository carOpticsRepository;


    @Override
    public List<CarOptics> getAllCarOptics() {
        return carOpticsRepository.findAll();
    }

    @Override
    public CarOptics addCarOptics(CarOptics carOptics) {
        return carOpticsRepository.save(carOptics);
    }

    @Override
    public void removeCarOptics(CarOptics carOptics) {
        carOpticsRepository.delete(carOptics);
    }

    @Override
    public CarOptics getCarOptics(long id) {
        Optional<CarOptics> opt = carOpticsRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }
}
