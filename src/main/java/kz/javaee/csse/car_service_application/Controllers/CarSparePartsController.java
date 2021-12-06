package kz.javaee.csse.car_service_application.Controllers;

import kz.javaee.csse.car_service_application.Entities.CarSpareParts;
import kz.javaee.csse.car_service_application.Services.CarSparePartsService;
import kz.javaee.csse.car_service_application.Services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/api")
public class CarSparePartsController {
    @Autowired
    private CarSparePartsService carSparePartsService;
    @Autowired
    private UsersServices usersServices;

    @GetMapping(value = "/carSpareParts/getAllCarSpareParts")
    public ResponseEntity<?> getAllCarSpareParts(){
        List<CarSpareParts> carSparePartsList = carSparePartsService.getAllCarSpareParts();
        return new ResponseEntity<>(carSparePartsList, HttpStatus.OK);
    }

    @GetMapping(value = "/carSpareParts/getCarSpareParts/{id}")
    public ResponseEntity<?> getCarSpareParts(@PathVariable(name = "id") Long id){
        CarSpareParts carSpareParts = carSparePartsService.getCarSpareParts(id);
        if (carSpareParts == null){
            return ResponseEntity.notFound().build();
        } else {
            carSpareParts.getUsers().setPassword("");
            carSpareParts.getUsers().setRoles(null);
            return ResponseEntity.ok(carSpareParts);
        }
    }

    @PostMapping("/carSpareParts/addCarSpareParts")
    public ResponseEntity<?> addCarSpareParts(@RequestBody CarSpareParts carSpareParts){
        carSpareParts.setDate(new Date());
        carSpareParts.setUsers(usersServices.getUser(carSpareParts.getUsers().getEmail()));

        carSparePartsService.addCarSpareParts(carSpareParts);
        carSpareParts.getUsers().setRoles(null);
        carSpareParts.getUsers().setPassword(null);
        carSpareParts.getUsers().setId(null);
        return ResponseEntity.ok(carSpareParts);
    }

    @PostMapping("/carSpareParts/getAllCarSpareByPoints/{priceTo}")
    public ResponseEntity<?> getAllCarSparePartsByPoint(@RequestBody CarSpareParts carSpareParts, @PathVariable(name = "priceTo") Long priceTo){
        if (priceTo == 0){
            priceTo = null;
        }
        carSpareParts.setPrice(carSpareParts.getPrice()>0?carSpareParts.getPrice():null);
        carSpareParts.setCarBrand(carSpareParts.getCarBrand().getId() == -1?null: carSpareParts.getCarBrand());
        carSpareParts.setCarModel(carSpareParts.getCarModel().getId() == -1?null: carSpareParts.getCarModel());
        carSpareParts.setCarRegion(carSpareParts.getCarRegion().getId() == -1?null: carSpareParts.getCarRegion());
        List<CarSpareParts> carSparePartsList = carSparePartsService.getAllCarSparePartsByPoints(carSpareParts, priceTo);

        for (CarSpareParts cp: carSparePartsList){
            cp.setUsers(null);
        }
        return ResponseEntity.ok(carSparePartsList);
    }

        @PutMapping("/carSpareParts/saveCarSpareParts")
    public ResponseEntity<?> saveCarSpareParts(@RequestBody CarSpareParts carSpareParts){
        carSparePartsService.addCarSpareParts(carSpareParts);
        return ResponseEntity.ok(carSpareParts);
    }

    @DeleteMapping("/carSpareParts/deleteCarSpareParts")
    public ResponseEntity<?> deleteCarSpareParts(@RequestBody CarSpareParts carSpareParts){
        CarSpareParts checkCarSpareParts = carSparePartsService.getCarSpareParts(carSpareParts.getId());
        if (checkCarSpareParts != null){
            carSparePartsService.removeCarSpareParts(checkCarSpareParts);
            return ResponseEntity.ok(checkCarSpareParts);
        }
        return ResponseEntity.notFound().build();
    }
}
