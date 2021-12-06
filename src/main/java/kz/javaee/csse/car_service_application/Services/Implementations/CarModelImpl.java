package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarMedia;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBrand;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;
import kz.javaee.csse.car_service_application.Repositories.CarModelRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarModelImpl implements CarModelService {
    @Autowired
    private CarModelRepository carModelRepository;


    @Override
    public List<CarModel> getAllCarModel() {
        return carModelRepository.findAll();
    }

    @Override
    public CarModel addCarModel(CarModel carModel) {
        return carModelRepository.save(carModel);
    }

    @Override
    public void removeCarModel(CarModel carModel) {
        carModelRepository.delete(carModel);
    }

    @Override
    public CarModel getCarModel(long id) {
        Optional<CarModel> opt = carModelRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }

    @Override
    public List<CarModel> getAllCarModelByCarBrand(CarBrand carBrand) {
        return carModelRepository.getAllByCarBrand(carBrand);
    }
}
