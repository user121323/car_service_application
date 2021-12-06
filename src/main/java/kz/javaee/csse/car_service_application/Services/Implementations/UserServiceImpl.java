package kz.javaee.csse.car_service_application.Services.Implementations;


import kz.javaee.csse.car_service_application.Entities.Users;
import kz.javaee.csse.car_service_application.Repositories.UserRepository;
import kz.javaee.csse.car_service_application.Services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UsersServices {
    @Autowired
    private UserRepository userRepository;
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Users user = userRepository.findByEmail(s);
        if (user !=null){
            return user;
        }
        else {
            throw new UsernameNotFoundException("USER NOT FOUND");
        }
    }

    @Override
    public Users addUser(Users user) {
        return userRepository.save(user);
    }

    @Override
    public Users getUser(String email) {
        Users user = userRepository.findByEmail(email);
        return user;
    }

    @Override
    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void removeUsers(Users user) {
        userRepository.delete(user);
    }


}
