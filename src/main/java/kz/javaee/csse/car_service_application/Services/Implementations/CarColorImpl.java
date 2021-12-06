package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBrand;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarColor;
import kz.javaee.csse.car_service_application.Repositories.CarColorRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarColorImpl implements CarColorService {
    @Autowired
    private CarColorRepository carColorRepository;


    @Override
    public List<CarColor> getAllCarColor() {
        return carColorRepository.findAll();
    }

    @Override
    public CarColor addCarColor(CarColor carColor) {
        return carColorRepository.save(carColor);
    }

    @Override
    public void removeCarColor(CarColor carColor) {
        carColorRepository.delete(carColor);
    }

    @Override
    public CarColor getCarColor(long id) {
        Optional<CarColor> opt = carColorRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }
}
