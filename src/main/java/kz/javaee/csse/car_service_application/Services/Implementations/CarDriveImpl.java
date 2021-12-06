package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarCountryOrigin;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarDrive;
import kz.javaee.csse.car_service_application.Repositories.CarDriveRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarDriveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarDriveImpl implements CarDriveService {
    @Autowired
    private CarDriveRepository carDriveRepository;


    @Override
    public List<CarDrive> getAllCarDrive() {
        return carDriveRepository.findAll();
    }

    @Override
    public CarDrive addCarDrive(CarDrive carDrive) {
        return carDriveRepository.save(carDrive);
    }

    @Override
    public void removeCarDrive(CarDrive carDrive) {
        carDriveRepository.delete(carDrive);
    }

    @Override
    public CarDrive getCarDrive(long id) {
        Optional<CarDrive> opt = carDriveRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }
}
