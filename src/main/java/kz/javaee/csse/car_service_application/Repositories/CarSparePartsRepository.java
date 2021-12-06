package kz.javaee.csse.car_service_application.Repositories;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBody;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBrand;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarRegion;
import kz.javaee.csse.car_service_application.Entities.CarSpareParts;
import kz.javaee.csse.car_service_application.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public interface CarSparePartsRepository extends CrudRepository<CarSpareParts, Long>, JpaSpecificationExecutor<CarSpareParts> {

}
