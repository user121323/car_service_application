package kz.javaee.csse.car_service_application.Controllers;

import kz.javaee.csse.car_service_application.Entities.Car;
import kz.javaee.csse.car_service_application.Repositories.CarRepository;
import kz.javaee.csse.car_service_application.Services.CarService;
import kz.javaee.csse.car_service_application.Services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/api")
public class CarController {
    @Autowired
    private CarService carService;
    @Autowired
    private UsersServices usersServices;

    @GetMapping(value = "/car/getAllCars")
    public ResponseEntity<?> getAllCars(){
        List<Car> carList = carService.getAllCar();
        return new ResponseEntity<>(carList, HttpStatus.OK);
    }

    @PostMapping("/car/getAllCars/{engineCapacityTo}/{releaseYearTo}/{priceTo}")
    public ResponseEntity<?> getCars(@RequestBody Car car, @PathVariable(name = "engineCapacityTo")Float engineCapacityTo,
                                     @PathVariable(name = "releaseYearTo")Integer releaseYear,
                                     @PathVariable(name = "priceTo")Long priceTo){



        if (engineCapacityTo == 0.0){
            engineCapacityTo = null;
        }
        if (releaseYear == 0){
            releaseYear = null;
        }
        if (priceTo == 0){
            priceTo = null;
        }
        if (car.getCarBody().getId() == -1){
            car.setCarBody(null);
        }
        if (car.getCarBrand().getId() == -1){
            car.setCarBrand(null);
        }
        if (car.getCarColor().getId() == -1){
            car.setCarColor(null);
        }
        if (car.getCarCountryOrigin().getId() == -1){
            car.setCarCountryOrigin(null);
        }
        if (car.getCarDrive().getId() == -1){
            car.setCarDrive(null);
        }
        if (car.getCarEngine().getId() == -1){
            car.setCarEngine(null);
        }
        if (car.getCarModel().getId() == -1){
            car.setCarModel(null);
        }
        if (car.getCarRegion().getId() == -1){
            car.setCarRegion(null);
        }
        if (car.getCarSteeringWheel().getId() == -1){
            car.setCarSteeringWheel(null);
        }
        if (car.getCarTransmission().getId() == -1){
            car.setCarTransmission(null);
        }

        Date releaseYearTo = null;
        if (releaseYear != null){
            int month = 12;
            LocalDate localDate = YearMonth.of(releaseYear,month).atEndOfMonth();
            releaseYearTo = Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
        }




        List<Car> cars = carService.getAllCar(car,engineCapacityTo,releaseYearTo,priceTo);


        for (Car c: cars){
            c.setUsers(null);
        }


        return ResponseEntity.ok(cars);
    }

    @GetMapping(value = "/car/getCar/{id}")
    public ResponseEntity<?> getCar(@PathVariable(name = "id") Long id){
        Car car = carService.getCar(id);
        if (car == null){
            return ResponseEntity.notFound().build();
        } else {
            car.getUsers().setPassword("");
            return ResponseEntity.ok(car);
        }
    }

    @PostMapping("/car/addCar")
    public ResponseEntity<?> addCar(@RequestBody Car car){
        System.out.println(car.getUsers().getEmail());
        System.out.println(car.getPrice());
        System.out.println(car.getMileage());

        car.setUsers(usersServices.getUser(car.getUsers().getEmail()));
        carService.addCar(car);
        car.getUsers().setPassword(null);
        car.getUsers().setId(null);
        car.getUsers().setRoles(null);
        car.getUsers().setFullname(null);
        return ResponseEntity.ok(car);
    }

    @PutMapping("/car/saveCar")
    public ResponseEntity<?> saveCar(@RequestBody Car car){
        carService.addCar(car);
        return ResponseEntity.ok(car);
    }

    @DeleteMapping("/car/deleteCar")
    public ResponseEntity<?> deleteCar(@RequestBody Car car){
        Car checkCar = carService.getCar(car.getId());
        if (checkCar != null){
            carService.removeCar(checkCar);
            return ResponseEntity.ok(checkCar);
        }
        return ResponseEntity.notFound().build();
    }
}
