package kz.javaee.csse.car_service_application.Controllers;

import kz.javaee.csse.car_service_application.Entities.Car;
import kz.javaee.csse.car_service_application.Entities.CarDetails.*;
import kz.javaee.csse.car_service_application.Services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/api")
public class CarDetailsRestController {
    @Autowired
    private CarBodyService carBodyService;

    @Autowired
    private CarBrandService carBrandService;

    @Autowired
    private CarColorService carColorService;

    @Autowired
    private CarCountryOriginService carCountryOriginService;

    @Autowired
    private CarDriveService carDriveService;

    @Autowired
    private CarEngineService carEngineService;

    @Autowired
    private CarImageService carImageService;

    @Autowired
    private CarModelService carModelService;

    @Autowired
    private CarRegionService carRegionService;

    @Autowired
    private CarSteeringWheelService carSteeringWheelService;

    @Autowired
    private CarTransmissionService carTransmissionService;


    //    _________________________________________CarBody________________________________________________________________

    @GetMapping(value = "/carBody/getAllCarBody")
    public ResponseEntity<?> getAllCarBody(){
        List<CarBody> carBodyList = carBodyService.getAllCarBody();
        return new ResponseEntity<>(carBodyList, HttpStatus.OK);
    }

    @GetMapping(value = "/carBody/getCarBody/{id}")
    public ResponseEntity<?> getCarBody(@PathVariable(name = "id") Long id){
        CarBody carBody = carBodyService.getCarBody(id);
        if (carBody == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carBody);
        }
    }

    @PostMapping("/carBody/addCarBody")
    public ResponseEntity<?> addCarBody(@RequestBody CarBody carBody){
        carBodyService.addCarBody(carBody);
        return ResponseEntity.ok(carBody);
    }

    @PutMapping("/carBody/saveCarBody")
    public ResponseEntity<?> saveCarBody(@RequestBody CarBody carBody){
        carBodyService.addCarBody(carBody);
        return ResponseEntity.ok(carBody);
    }

    @DeleteMapping("/carBody/deleteCarBody")
    public ResponseEntity<?> deleteCarBody(@RequestBody CarBody carBody){
        CarBody checkCarBody = carBodyService.getCarBody(carBody.getId());
        if (checkCarBody != null){
            carBodyService.removeCarBody(checkCarBody);
            return ResponseEntity.ok(checkCarBody);
        }
        return ResponseEntity.notFound().build();
    }

    //    _________________________________________CarBrand________________________________________________________________

    @GetMapping(value = "/carBrand/getAllCarBrand")
    public ResponseEntity<?> getAllCarBrand(){
        List<CarBrand> carBrandList = carBrandService.getAllCarBrand();
        return new ResponseEntity<>(carBrandList, HttpStatus.OK);
    }

    @GetMapping(value = "/carBrand/getCarBrand/{id}")
    public ResponseEntity<?> getCarBrand(@PathVariable(name = "id") Long id){
        CarBrand carBrand = carBrandService.getCarBrand(id);
        if (carBrand == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carBrand);
        }
    }

    @PostMapping("/carBrand/addCarBrand")
    public ResponseEntity<?> addCarBrand(@RequestBody CarBrand carBrand){
        carBrandService.addCarBrand(carBrand);
        return ResponseEntity.ok(carBrand);
    }

    @PutMapping("/carBrand/saveCarBrand")
    public ResponseEntity<?> saveCar(@RequestBody CarBrand carBrand){
        carBrandService.addCarBrand(carBrand);
        return ResponseEntity.ok(carBrand);
    }

    @DeleteMapping("/carBrand/deleteCarBrand")
    public ResponseEntity<?> deleteCarBrand(@RequestBody CarBrand carBrand){
        CarBrand checkCarBrand = carBrandService.getCarBrand(carBrand.getId());
        if (checkCarBrand != null){
            carBrandService.removeCarBrand(checkCarBrand);
            return ResponseEntity.ok(checkCarBrand);
        }
        return ResponseEntity.notFound().build();
    }

    //    _________________________________________CarColor________________________________________________________________

    @GetMapping(value = "/carColor/getAllCarColor")
    public ResponseEntity<?> getAllCarColor(){
        List<CarColor> carColorList = carColorService.getAllCarColor();
        return new ResponseEntity<>(carColorList, HttpStatus.OK);
    }

    @GetMapping(value = "/carColor/getCarColor/{id}")
    public ResponseEntity<?> getCarColor(@PathVariable(name = "id") Long id){
        CarColor carColor = carColorService.getCarColor(id);
        if (carColor == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carColor);
        }
    }

    @PostMapping("/carColor/addCarColor")
    public ResponseEntity<?> addCarColor(@RequestBody CarColor carColor){
        carColorService.addCarColor(carColor);
        return ResponseEntity.ok(carColor);
    }

    @PutMapping("/carColor/saveCarColor")
    public ResponseEntity<?> saveCarColor(@RequestBody CarColor carColor){
        carColorService.addCarColor(carColor);
        return ResponseEntity.ok(carColor);
    }

    @DeleteMapping("/carColor/deleteCarColor")
    public ResponseEntity<?> deleteCarColor(@RequestBody CarColor carColor){
        CarColor checkCarColor = carColorService.getCarColor(carColor.getId());
        if (checkCarColor != null){
            carColorService.removeCarColor(checkCarColor);
            return ResponseEntity.ok(checkCarColor);
        }
        return ResponseEntity.notFound().build();
    }

    //    _________________________________________CarCountryOrigin________________________________________________________________

    @GetMapping(value = "/carCountryOrigin/getAllCarCountryOrigin")
    public ResponseEntity<?> getAllCarCountryOrigin(){
        List<CarCountryOrigin> carCountryOriginList = carCountryOriginService.getAllCarCountryOrigin();
        return new ResponseEntity<>(carCountryOriginList, HttpStatus.OK);
    }

    @GetMapping(value = "/carCountryOrigin/getCarCountryOrigin/{id}")
    public ResponseEntity<?> getCarCountryOrigin(@PathVariable(name = "id") Long id){
        CarCountryOrigin carCountryOrigin = carCountryOriginService.getCarCountryOrigin(id);
        if (carCountryOrigin == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carCountryOrigin);
        }
    }

    @PostMapping("/carCountryOrigin/addCarCountryOrigin")
    public ResponseEntity<?> addCarCountryOrigin(@RequestBody CarCountryOrigin carCountryOrigin){
        carCountryOriginService.addCarCountryOrigin(carCountryOrigin);
        return ResponseEntity.ok(carCountryOrigin);
    }

    @PutMapping("/carCountryOrigin/saveCarCountryOrigin")
    public ResponseEntity<?> saveCarCountryOrigin(@RequestBody CarCountryOrigin carCountryOrigin){
        carCountryOriginService.addCarCountryOrigin(carCountryOrigin);
        return ResponseEntity.ok(carCountryOrigin);
    }

    @DeleteMapping("/carCountryOrigin/deleteCarCountryOrigin")
    public ResponseEntity<?> deleteCarCountryOrigin(@RequestBody CarCountryOrigin carCountryOrigin){
        CarCountryOrigin checkCarCountryOrigin = carCountryOriginService.getCarCountryOrigin(carCountryOrigin.getId());
        if (checkCarCountryOrigin != null){
            carCountryOriginService.removeCarCountryOrigin(checkCarCountryOrigin);
            return ResponseEntity.ok(checkCarCountryOrigin);
        }
        return ResponseEntity.notFound().build();
    }

    //    _________________________________________CarDrive________________________________________________________________

    @GetMapping(value = "/carDrive/getAllCarDrive")
    public ResponseEntity<?> getAllCarsDrive(){
        List<CarDrive> carDriveList = carDriveService.getAllCarDrive();
        return new ResponseEntity<>(carDriveList, HttpStatus.OK);
    }

    @GetMapping(value = "/carDrive/getCarDrive/{id}")
    public ResponseEntity<?> getCarDrive(@PathVariable(name = "id") Long id){
        CarDrive car = carDriveService.getCarDrive(id);
        if (car == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(car);
        }
    }

    @PostMapping("/carDrive/addCarDrive")
    public ResponseEntity<?> addCarDrive(@RequestBody CarDrive carDrive){
        carDriveService.addCarDrive(carDrive);
        return ResponseEntity.ok(carDrive);
    }

    @PutMapping("/carDrive/saveCarDrive")
    public ResponseEntity<?> saveCarDrive(@RequestBody CarDrive carDrive){
        carDriveService.addCarDrive(carDrive);
        return ResponseEntity.ok(carDrive);
    }

    @DeleteMapping("/carDrive/deleteCarDrive")
    public ResponseEntity<?> deleteCarDrive(@RequestBody CarDrive carDrive){
        CarDrive checkCarDrive = carDriveService.getCarDrive(carDrive.getId());
        if (checkCarDrive != null){
            carDriveService.removeCarDrive(checkCarDrive);
            return ResponseEntity.ok(checkCarDrive);
        }
        return ResponseEntity.notFound().build();
    }

    //    _________________________________________CarEngine________________________________________________________________

    @GetMapping(value = "/carEngine/getAllCarEngine")
    public ResponseEntity<?> getAllCarEngine(){
        List<CarEngine> carEngineList = carEngineService.getAllCarEngine();
        return new ResponseEntity<>(carEngineList, HttpStatus.OK);
    }

    @GetMapping(value = "/carEngine/getCarEngine/{id}")
    public ResponseEntity<?> getCarEngine(@PathVariable(name = "id") Long id){
        CarEngine carEngine = carEngineService.getCarEngine(id);
        if (carEngine == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carEngine);
        }
    }

    @PostMapping("/carEngine/addCarEngine")
    public ResponseEntity<?> addCarEngine(@RequestBody CarEngine carEngine){
        carEngineService.addCarEngine(carEngine);
        return ResponseEntity.ok(carEngine);
    }

    @PutMapping("/carEngine/saveCarEngine")
    public ResponseEntity<?> saveCarEngine(@RequestBody CarEngine carEngine){
        carEngineService.addCarEngine(carEngine);
        return ResponseEntity.ok(carEngine);
    }

    @DeleteMapping("/carEngine/deleteCarEngine")
    public ResponseEntity<?> deleteCarEngine(@RequestBody CarEngine carEngine){
        CarEngine checkCarEngine = carEngineService.getCarEngine(carEngine.getId());
        if (checkCarEngine != null){
            carEngineService.removeCarEngine(checkCarEngine);
            return ResponseEntity.ok(checkCarEngine);
        }
        return ResponseEntity.notFound().build();
    }

    //    _________________________________________CarImage________________________________________________________________

    @GetMapping(value = "/carImage/getAllCarImage")
    public ResponseEntity<?> getAllCarImage(){
        List<CarImage> carImageList = carImageService.getAllCarImage();
        return new ResponseEntity<>(carImageList, HttpStatus.OK);
    }

    @GetMapping(value = "/carImage/getCarImage/{id}")
    public ResponseEntity<?> getCarImage(@PathVariable(name = "id") Long id){
        CarImage carImage = carImageService.getCarImage(id);
        if (carImage == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carImage);
        }
    }

    @PostMapping("/carImage/addCarImage")
    public ResponseEntity<?> addCarImage(@RequestBody CarImage carImage){
        carImageService.addCarImage(carImage);
        return ResponseEntity.ok(carImage);
    }

    @PutMapping("/carImage/saveCarImage")
    public ResponseEntity<?> saveCarImage(@RequestBody CarImage carImage){
        carImageService.addCarImage(carImage);
        return ResponseEntity.ok(carImage);
    }

    @DeleteMapping("/carImage/deleteCarImage")
    public ResponseEntity<?> deleteCarImage(@RequestBody CarImage carImage){
        CarImage checkCarImage = carImageService.getCarImage(carImage.getId());
        if (checkCarImage != null){
            carImageService.removeCarImage(checkCarImage);
            return ResponseEntity.ok(checkCarImage);
        }
        return ResponseEntity.notFound().build();
    }

    //    _________________________________________CarModel________________________________________________________________


    @GetMapping(value = "/carModel/getAllCarModel")
    public ResponseEntity<?> getAllCarModel(){
        List<CarModel> carModelList = carModelService.getAllCarModel();
        return new ResponseEntity<>(carModelList, HttpStatus.OK);
    }

    @GetMapping(value = "/carModel/getAllCarModelByBrand/{brandId}")
    public ResponseEntity<?> getAllCarModelByBrand(@PathVariable(name = "brandId") Long id){
        CarBrand carBrand = carBrandService.getCarBrand(id);
        List<CarModel> carModelList = carModelService.getAllCarModelByCarBrand(carBrand);
        return new ResponseEntity<>(carModelList, HttpStatus.OK);
    }

    @GetMapping(value = "/carModel/getCarModel/{id}")
    public ResponseEntity<?> getCarModel(@PathVariable(name = "id") Long id){
        CarModel carModel = carModelService.getCarModel(id);
        if (carModel == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carModel);
        }
    }

    @PostMapping("/carModel/addCarModel")
    public ResponseEntity<?> addCarModel(@RequestBody CarModel carModel){
        carModelService.addCarModel(carModel);
        return ResponseEntity.ok(carModel);
    }

    @PutMapping("/carModel/saveCarModel")
    public ResponseEntity<?> saveCarModel(@RequestBody CarModel carModel){
        carModelService.addCarModel(carModel);
        return ResponseEntity.ok(carModel);
    }

    @DeleteMapping("/carModel/deleteCarModel")
    public ResponseEntity<?> deleteCarModel(@RequestBody CarModel carModel){
        CarModel checkCarModel = carModelService.getCarModel(carModel.getId());
        if (checkCarModel != null){
            carModelService.removeCarModel(checkCarModel);
            return ResponseEntity.ok(checkCarModel);
        }
        return ResponseEntity.notFound().build();
    }

    //    _________________________________________CarRegion________________________________________________________________

        @GetMapping(value = "/carRegion/getAllCarRegion")
    public ResponseEntity<?> getAllCarRegion(){
        List<CarRegion> carRegionList = carRegionService.getAllCarRegion();
        return new ResponseEntity<>(carRegionList, HttpStatus.OK);
    }

    @GetMapping(value = "/carRegion/getCarRegion/{id}")
    public ResponseEntity<?> getCarRegion(@PathVariable(name = "id") Long id){
        CarRegion carRegion = carRegionService.getCarRegion(id);
        if (carRegion == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carRegion);
        }
    }

    @PostMapping("/carRegion/addCarRegion")
    public ResponseEntity<?> addCarRegion(@RequestBody CarRegion carRegion){
        carRegionService.addCarRegion(carRegion);
        return ResponseEntity.ok(carRegion);
    }

    @PutMapping("/carRegion/saveCarRegion")
    public ResponseEntity<?> saveCarRegion(@RequestBody CarRegion carRegion){
        carRegionService.addCarRegion(carRegion);
        return ResponseEntity.ok(carRegion);
    }

    @DeleteMapping("/carRegion/deleteCarRegion")
    public ResponseEntity<?> deleteCarRegion(@RequestBody CarRegion carRegion){
        CarRegion checkCarRegion = carRegionService.getCarRegion(carRegion.getId());
        if (checkCarRegion != null){
            carRegionService.removeCarRegion(checkCarRegion);
            return ResponseEntity.ok(checkCarRegion);
        }
        return ResponseEntity.notFound().build();
    }

    //    _________________________________________CarSteeringWheel________________________________________________________________

    @GetMapping(value = "/carSteeringWheel/getAllCarSteeringWheel")
    public ResponseEntity<?> getAllCarSteeringWheel(){
        List<CarSteeringWheel> carList = carSteeringWheelService.getAllCarSteeringWheel();
        return new ResponseEntity<>(carList, HttpStatus.OK);
    }

    @GetMapping(value = "/carSteeringWheel/getCarSteeringWheel/{id}")
    public ResponseEntity<?> getCarSteeringWheel(@PathVariable(name = "id") Long id){
        CarSteeringWheel car = carSteeringWheelService.getCarSteeringWheel(id);
        if (car == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(car);
        }
    }

    @PostMapping("/carSteeringWheel/addCarSteeringWheel")
    public ResponseEntity<?> addCarSteeringWheel(@RequestBody CarSteeringWheel carSteeringWheel){
        carSteeringWheelService.addCarSteeringWheel(carSteeringWheel);
        return ResponseEntity.ok(carSteeringWheel);
    }

    @PutMapping("/carSteeringWheel/saveCarSteeringWheel")
    public ResponseEntity<?> saveCarSteeringWheel(@RequestBody CarSteeringWheel carSteeringWheel){
        carSteeringWheelService.addCarSteeringWheel(carSteeringWheel);
        return ResponseEntity.ok(carSteeringWheel);
    }

    @DeleteMapping("/carSteeringWheel/deleteCarSteeringWheel")
    public ResponseEntity<?> deleteCarSteeringWheel(@RequestBody CarSteeringWheel carSteeringWheel){
        CarSteeringWheel checkCarSteeringWheel = carSteeringWheelService.getCarSteeringWheel(carSteeringWheel.getId());
        if (checkCarSteeringWheel != null){
            carSteeringWheelService.removeCarSteeringWheel(checkCarSteeringWheel);
            return ResponseEntity.ok(checkCarSteeringWheel);
        }
        return ResponseEntity.notFound().build();
    }

    //    _________________________________________CarTransmission________________________________________________________________

    @GetMapping(value = "/carTransmission/getAllCarTransmission")
    public ResponseEntity<?> getAllCarTransmission(){
        List<CarTransmission> carTransmissionList = carTransmissionService.getAllCarTransmission();
        return new ResponseEntity<>(carTransmissionList, HttpStatus.OK);
    }

    @GetMapping(value = "/carTransmission/getCarTransmission/{id}")
    public ResponseEntity<?> getCarTransmission(@PathVariable(name = "id") Long id){
        CarTransmission carTransmission = carTransmissionService.getCarTransmission(id);
        if (carTransmission == null){
            return ResponseEntity.notFound().build();
        } else {
            return ResponseEntity.ok(carTransmission);
        }
    }

    @PostMapping("/carTransmission/addCarTransmission")
    public ResponseEntity<?> addCarTransmission(@RequestBody CarTransmission carTransmission){
        carTransmissionService.addCarTransmission(carTransmission);
        return ResponseEntity.ok(carTransmission);
    }

    @PutMapping("/carTransmission/saveCarTransmission")
    public ResponseEntity<?> saveCarTransmission(@RequestBody CarTransmission carTransmission){
        carTransmissionService.addCarTransmission(carTransmission);
        return ResponseEntity.ok(carTransmission);
    }

    @DeleteMapping("/carTransmission/deleteCarTransmission")
    public ResponseEntity<?> deleteCarTransmission(@RequestBody CarTransmission carTransmission){
        CarTransmission checkCarTransmission = carTransmissionService.getCarTransmission(carTransmission.getId());
        if (checkCarTransmission != null){
            carTransmissionService.removeCarTransmission(checkCarTransmission);
            return ResponseEntity.ok(checkCarTransmission);
        }
        return ResponseEntity.notFound().build();
    }
}
