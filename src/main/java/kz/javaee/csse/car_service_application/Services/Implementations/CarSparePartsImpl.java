package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.Car;
import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarSalon;
import kz.javaee.csse.car_service_application.Entities.CarSpareParts;
import kz.javaee.csse.car_service_application.Repositories.CarSparePartsRepository;
import kz.javaee.csse.car_service_application.Services.CarBodyService;
import kz.javaee.csse.car_service_application.Services.CarSparePartsService;
import kz.javaee.csse.car_service_application.Specifications.CarSparePartsSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class CarSparePartsImpl implements CarSparePartsService {
    @Autowired
    private CarSparePartsRepository carSparePartsRepository;


    @Override
    public List<CarSpareParts> getAllCarSpareParts() {
        List<CarSpareParts> result =
                StreamSupport.stream(Spliterators.spliteratorUnknownSize(carSparePartsRepository.findAll().iterator(), Spliterator.ORDERED), false)
                        .collect(Collectors.toList());
        return result;
    }

    @Override
    public List<CarSpareParts> getAllCarSparePartsByPoints(CarSpareParts carSpareParts, Long priceTo) {
        return carSparePartsRepository.findAll(CarSparePartsSpecification.getAllCarSparePartsAfterFilter(carSpareParts,priceTo));
    }

    @Override
    public CarSpareParts addCarSpareParts(CarSpareParts carSpareParts) {
        return carSparePartsRepository.save(carSpareParts);
    }

    @Override
    public void removeCarSpareParts(CarSpareParts carSpareParts) {
        carSparePartsRepository.delete(carSpareParts);
    }

    @Override
    public CarSpareParts getCarSpareParts(long id) {
        Optional<CarSpareParts> opt = carSparePartsRepository.findById(id);
        return opt.isPresent() ? opt.get() : null;
    }

}
