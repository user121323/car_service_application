package kz.javaee.csse.car_service_application.Repositories;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarCountryOrigin;
import kz.javaee.csse.car_service_application.Entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CarCountryOriginRepository extends JpaRepository<CarCountryOrigin, Long> {
}
