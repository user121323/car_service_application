package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.Car;
import kz.javaee.csse.car_service_application.Entities.CarDetails.*;
import kz.javaee.csse.car_service_application.Repositories.CarRepository;
import kz.javaee.csse.car_service_application.Services.CarService;
import kz.javaee.csse.car_service_application.Specifications.CarSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CarImpl implements CarService {
    @Autowired
    private CarRepository carRepository;


    @Override
    public List<Car> getAllCar() {
        List<Car> result =
                StreamSupport.stream(Spliterators.spliteratorUnknownSize(carRepository.findAll().iterator(), Spliterator.ORDERED), false)
                        .collect(Collectors.toList());

        return result;
    }

    @Override
    public List<Car> getAllCar(Car car, Float engineCapacityTo, Date releaseYearTo, Long priceTo) {

        return carRepository.findAll(CarSpecification.filterCars(car,engineCapacityTo,releaseYearTo,priceTo));
    }

    @Override
    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    @Override
    public void removeCar(Car car) {
        carRepository.delete(car);
    }

    @Override
    public Car getCar(long id) {
        Optional<Car> opt = carRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }
}
