package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarSteeringWheel;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarTransmission;
import kz.javaee.csse.car_service_application.Repositories.CarTransmissionRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarTransmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarTransmissionImpl implements CarTransmissionService {
    @Autowired
    private CarTransmissionRepository carTransmissionRepository;


    @Override
    public List<CarTransmission> getAllCarTransmission() {
        return carTransmissionRepository.findAll();
    }

    @Override
    public CarTransmission addCarTransmission(CarTransmission carTransmission) {
        return carTransmissionRepository.save(carTransmission);
    }

    @Override
    public void removeCarTransmission(CarTransmission carTransmission) {
        carTransmissionRepository.delete(carTransmission);
    }

    @Override
    public CarTransmission getCarTransmission(long id) {
        Optional<CarTransmission> opt = carTransmissionRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }

}
