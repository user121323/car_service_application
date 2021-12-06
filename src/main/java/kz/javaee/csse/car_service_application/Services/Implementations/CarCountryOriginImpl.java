package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarColor;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarCountryOrigin;
import kz.javaee.csse.car_service_application.Repositories.CarCountryOriginRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarCountryOriginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarCountryOriginImpl implements CarCountryOriginService {
    @Autowired
    private CarCountryOriginRepository carCountryOriginRepository;


    @Override
    public List<CarCountryOrigin> getAllCarCountryOrigin() {
        return carCountryOriginRepository.findAll();
    }

    @Override
    public CarCountryOrigin addCarCountryOrigin(CarCountryOrigin carCountryOrigin) {
        return carCountryOriginRepository.save(carCountryOrigin);
    }

    @Override
    public void removeCarCountryOrigin(CarCountryOrigin carCountryOrigin) {
        carCountryOriginRepository.delete(carCountryOrigin);
    }

    @Override
    public CarCountryOrigin getCarCountryOrigin(long id) {
        Optional<CarCountryOrigin> opt = carCountryOriginRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }
}
