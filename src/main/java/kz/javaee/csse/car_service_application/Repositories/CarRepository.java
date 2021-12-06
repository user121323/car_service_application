package kz.javaee.csse.car_service_application.Repositories;

import kz.javaee.csse.car_service_application.Entities.Car;
import kz.javaee.csse.car_service_application.Entities.CarDetails.*;
import kz.javaee.csse.car_service_application.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Repository
@Transactional
public interface CarRepository extends CrudRepository<Car, Long>, JpaSpecificationExecutor<Car> {

}
