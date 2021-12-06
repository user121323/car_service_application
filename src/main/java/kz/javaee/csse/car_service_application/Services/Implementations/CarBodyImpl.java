package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBody;
import kz.javaee.csse.car_service_application.Repositories.CarBodyRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarBodyImpl implements CarBodyService {
    @Autowired
    private CarBodyRepository carBodyRepository;


    @Override
    public List<CarBody> getAllCarBody() {
        return carBodyRepository.findAll();
    }

    @Override
    public CarBody addCarBody(CarBody carBody) {
        return carBodyRepository.save(carBody);
    }

    @Override
    public void removeCarBody(CarBody carBody) {
        carBodyRepository.delete(carBody);
    }

    @Override
    public CarBody getCarBody(long id) {
        Optional<CarBody> opt = carBodyRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }
}
