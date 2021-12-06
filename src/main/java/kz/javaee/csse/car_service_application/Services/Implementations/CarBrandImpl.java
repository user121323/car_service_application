package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBody;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBrand;
import kz.javaee.csse.car_service_application.Repositories.CarBrandRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarBrandImpl implements CarBrandService {
    @Autowired
    private CarBrandRepository carBrandRepository;


    @Override
    public List<CarBrand> getAllCarBrand() {
        return carBrandRepository.findAll();
    }

    @Override
    public CarBrand addCarBrand(CarBrand carBrand) {
        return carBrandRepository.save(carBrand);
    }

    @Override
    public void removeCarBrand(CarBrand carBrand) {
        carBrandRepository.delete(carBrand);
    }

    @Override
    public CarBrand getCarBrand(long id) {
        Optional<CarBrand> opt = carBrandRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }
}
