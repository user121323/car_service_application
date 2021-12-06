package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarEngine;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarImage;
import kz.javaee.csse.car_service_application.Repositories.CarImageRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarImageImpl implements CarImageService {
    @Autowired
    private CarImageRepository carImageRepository;


    @Override
    public List<CarImage> getAllCarImage() {
        return carImageRepository.findAll();
    }

    @Override
    public CarImage addCarImage(CarImage carImage) {
        return carImageRepository.save(carImage);
    }

    @Override
    public void removeCarImage(CarImage carImage) {
        carImageRepository.delete(carImage);
    }

    @Override
    public CarImage getCarImage(long id) {
        Optional<CarImage> opt = carImageRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }
}
