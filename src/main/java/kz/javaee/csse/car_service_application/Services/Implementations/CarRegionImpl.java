package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarOutsides;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarRegion;
import kz.javaee.csse.car_service_application.Repositories.CarRegionRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarRegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarRegionImpl implements CarRegionService {
    @Autowired
    private CarRegionRepository carRegionRepository;


    @Override
    public List<CarRegion> getAllCarRegion() {
        return carRegionRepository.findAll();
    }

    @Override
    public CarRegion addCarRegion(CarRegion carRegion) {
        return carRegionRepository.save(carRegion);
    }

    @Override
    public void removeCarRegion(CarRegion carRegion) {
        carRegionRepository.delete(carRegion);
    }

    @Override
    public CarRegion getCarRegion(long id) {
        Optional<CarRegion> opt = carRegionRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }

}
