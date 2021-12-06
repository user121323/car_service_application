package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;
import kz.javaee.csse.car_service_application.Entities.Roles;

import java.util.List;

public interface RolesService {
    List<Roles> getAllRoles();
    Roles addRoles(Roles roles);
    void removeRoles(Roles roles);
    Roles getRoles(long id);
}
