package kz.javaee.csse.car_service_application.Controllers;

import kz.javaee.csse.car_service_application.Entities.Car;
import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.*;
import kz.javaee.csse.car_service_application.Entities.CarSpareParts;
import kz.javaee.csse.car_service_application.Entities.Users;
import kz.javaee.csse.car_service_application.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/api")
public class CarAdvancedDetailsController {
    @Autowired
    private CarMediaService carMediaService;

    @Autowired
    private CarOpticsService carOpticsService;

    @Autowired
    private CarOptionsService carOptionsService;

    @Autowired
    private CarOutsidesService carOutsidesService;

    @Autowired
    private CarSalonService carSalonService;

    //    _________________________________________CarMedia________________________________________________________________
    @GetMapping(value = "/carMedia/getAllCarMedia")
    public ResponseEntity<?> getAllCarMedia() {
        List<CarMedia> carMediaList = carMediaService.getAllCarMedia();
        return new ResponseEntity<>(carMediaList, HttpStatus.OK);
    }

    @GetMapping(value = "/carMedia/getCarMedia/{id}")
    public ResponseEntity<?> getCarMedia(@PathVariable(name = "id") Long id) {
        CarMedia carMedia = carMediaService.getCarMedia(id);
        if (carMedia == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carMedia);
        }
    }

    @PostMapping("/carMedia/addCarMedia")
    public ResponseEntity<?> addCarMedia(@RequestBody CarMedia carMedia) {
        carMediaService.addCarMedia(carMedia);
        return ResponseEntity.ok(carMedia);
    }

    @PutMapping("/carMedia/saveCarMedia")
    public ResponseEntity<?> saveCarMedia(@RequestBody CarMedia carMedia) {
        carMediaService.addCarMedia(carMedia);
        return ResponseEntity.ok(carMedia);
    }

    @DeleteMapping("/carMedia/deleteCarMedia")
    public ResponseEntity<?> deleteCarMedia(@RequestBody CarMedia carMedia) {
        CarMedia checkCarMedia = carMediaService.getCarMedia(carMedia.getId());
        if (checkCarMedia != null) {
            carMediaService.removeCarMedia(checkCarMedia);
            return ResponseEntity.ok(checkCarMedia);
        }
        return ResponseEntity.notFound().build();
    }


    //    _________________________________________CarOptics________________________________________________________________
    @GetMapping(value = "/carOptics/getAllCarOptics")
    public ResponseEntity<?> getAllCarOptics() {
        List<CarOptics> carOpticsList = carOpticsService.getAllCarOptics();
        return new ResponseEntity<>(carOpticsList, HttpStatus.OK);
    }

    @GetMapping(value = "/carOptics/getCarOptics/{id}")
    public ResponseEntity<?> getCarOptics(@PathVariable(name = "id") Long id) {
        CarOptics carOptics = carOpticsService.getCarOptics(id);
        if (carOptics == null) {
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carOptics);
        }
    }

    @PostMapping("/carOptics/addCarOptics")
    public ResponseEntity<?> addCarOptics(@RequestBody CarOptics carOptics) {
        carOpticsService.addCarOptics(carOptics);
        return ResponseEntity.ok(carOptics);
    }

    @PutMapping("/carOptics/saveCarOptics")
    public ResponseEntity<?> saveCarOptics(@RequestBody CarOptics carOptics) {
        carOpticsService.addCarOptics(carOptics);
        return ResponseEntity.ok(carOptics);
    }

    @DeleteMapping("/carOptics/deleteCarOptics")
    public ResponseEntity<?> deleteCarOptics(@RequestBody CarOptics carOptics) {
        CarOptics checkCarOptics = carOpticsService.getCarOptics(carOptics.getId());
        if (checkCarOptics != null) {
            carOpticsService.removeCarOptics(checkCarOptics);
            return ResponseEntity.ok(checkCarOptics);
        }
        return ResponseEntity.notFound().build();
    }


    //    _________________________________________CarOptions________________________________________________________________
    @GetMapping(value = "/carOptions/getAllCarOptions")
    public ResponseEntity<?> getAllCarOptions(){
        List<CarOptions> carOptionsList = carOptionsService.getAllCarOptions();
        return new ResponseEntity<>(carOptionsList, HttpStatus.OK);
    }

    @GetMapping(value = "/carOptions/getCarOptions/{id}")
    public ResponseEntity<?> getCarOptions(@PathVariable(name = "id") Long id){
        CarOptions carOptions = carOptionsService.getCarOptions(id);
        if (carOptions == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carOptions);
        }
    }

    @PostMapping("/carOptions/addCarOptions")
    public ResponseEntity<?> addCarOptions(@RequestBody CarOptions carOptions){
        carOptionsService.addCarOptions(carOptions);
        return ResponseEntity.ok(carOptions);
    }

    @PutMapping("/carOptions/saveCarOptions")
    public ResponseEntity<?> saveCarOptions(@RequestBody CarOptions carOptions){
        carOptionsService.addCarOptions(carOptions);
        return ResponseEntity.ok(carOptions);
    }

    @DeleteMapping("/carOptions/deleteCarOptions")
    public ResponseEntity<?> deleteCarOptions(@RequestBody CarOptions carOptions){
        CarOptions checkCarOptions = carOptionsService.getCarOptions(carOptions.getId());
        if (checkCarOptions != null){
            carOptionsService.removeCarOptions(checkCarOptions);
            return ResponseEntity.ok(checkCarOptions);
        }
        return ResponseEntity.notFound().build();
    }

    //    _________________________________________CarOutsides________________________________________________________________

    @GetMapping(value = "/carOutsides/getAllCarOutsides")
    public ResponseEntity<?> getAllCarsOutsides(){
        List<CarOutsides> carOutsidesList = carOutsidesService.getAllCarOutsides();
        return new ResponseEntity<>(carOutsidesList, HttpStatus.OK);
    }

    @GetMapping(value = "/carOutsides/getCarOutsides/{id}")
    public ResponseEntity<?> getCarOutsides(@PathVariable(name = "id") Long id){
        CarOutsides carOutsides = carOutsidesService.getCarOutsides(id);
        if (carOutsides == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carOutsides);
        }
    }

    @PostMapping("/carOutsides/addCarOutsides")
    public ResponseEntity<?> addCarOutsides(@RequestBody CarOutsides carOutsides){
        carOutsidesService.addCarOutsides(carOutsides);
        return ResponseEntity.ok(carOutsides);
    }

    @PutMapping("/carOutsides/saveCarOutsides")
    public ResponseEntity<?> saveCarOutsides(@RequestBody CarOutsides carOutsides){
        carOutsidesService.addCarOutsides(carOutsides);
        return ResponseEntity.ok(carOutsides);
    }

    @DeleteMapping("/carOutsides/deleteCarOutsides")
    public ResponseEntity<?> deleteCarOutsides(@RequestBody CarOutsides carOutsides){
        CarOutsides checkCarOutsides = carOutsidesService.getCarOutsides(carOutsides.getId());
        if (checkCarOutsides != null){
            carOutsidesService.removeCarOutsides(checkCarOutsides);
            return ResponseEntity.ok(checkCarOutsides);
        }
        return ResponseEntity.notFound().build();
    }


    //    _________________________________________CarSalon________________________________________________________________
    @GetMapping(value = "/carSalon/getAllCarSalon")
    public ResponseEntity<?> getAllCarsSalon(){
        List<CarSalon> carSalonList = carSalonService.getAllCarSalon();
        return new ResponseEntity<>(carSalonList, HttpStatus.OK);
    }

    @GetMapping(value = "/carSalon/getCarSalon/{id}")
    public ResponseEntity<?> getCarSalon(@PathVariable(name = "id") Long id){
        CarSalon carSalon = carSalonService.getCarSalon(id);
        if (carSalon == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carSalon);
        }
    }

    @PostMapping("/carSalon/addCarSalon")
    public ResponseEntity<?> addCarSalon(@RequestBody CarSalon carSalon){
        carSalonService.addCarSalon(carSalon);
        return ResponseEntity.ok(carSalon);
    }

    @PutMapping("/carSalon/saveCarSalon")
    public ResponseEntity<?> saveCarSalon(@RequestBody CarSalon carSalon){
        carSalonService.addCarSalon(carSalon);
        return ResponseEntity.ok(carSalon);
    }

    @DeleteMapping("/carSalon/deleteCarSalon")
    public ResponseEntity<?> deleteCarSalon(@RequestBody CarSalon carSalon){
        CarSalon checkCarSalon = carSalonService.getCarSalon(carSalon.getId());
        if (checkCarSalon != null){
            carSalonService.removeCarSalon(checkCarSalon);
            return ResponseEntity.ok(checkCarSalon);
        }
        return ResponseEntity.notFound().build();
    }
}
