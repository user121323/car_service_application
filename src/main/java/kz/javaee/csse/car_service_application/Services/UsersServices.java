package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.Roles;
import kz.javaee.csse.car_service_application.Entities.Users;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UsersServices extends UserDetailsService {
    Users addUser(Users user);
    Users getUser(String email);
    List<Users> getAllUsers();
    void removeUsers(Users user);
}
