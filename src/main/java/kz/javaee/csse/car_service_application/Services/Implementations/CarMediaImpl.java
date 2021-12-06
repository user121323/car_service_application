package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.Car;
import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarMedia;
import kz.javaee.csse.car_service_application.Repositories.CarMediaRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarMediaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarMediaImpl implements CarMediaService {
    @Autowired
    private CarMediaRepository carMediaRepository;


    @Override
    public List<CarMedia> getAllCarMedia() {
        return carMediaRepository.findAll();
    }

    @Override
    public CarMedia addCarMedia(CarMedia carMedia) {
        return carMediaRepository.save(carMedia);
    }

    @Override
    public void removeCarMedia(CarMedia carMedia) {
        carMediaRepository.delete(carMedia);
    }

    @Override
    public CarMedia getCarMedia(long id) {
        Optional<CarMedia> opt = carMediaRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }
}
