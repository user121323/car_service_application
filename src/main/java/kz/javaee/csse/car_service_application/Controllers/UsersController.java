package kz.javaee.csse.car_service_application.Controllers;

import kz.javaee.csse.car_service_application.Entities.Roles;
import kz.javaee.csse.car_service_application.Entities.Users;
import kz.javaee.csse.car_service_application.Services.RolesService;
import kz.javaee.csse.car_service_application.Services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value = "/api")
public class UsersController {
    @Autowired
    private UsersServices usersServices;

    @Autowired
    private RolesService rolesService;

    @GetMapping(value = "/checkAuth/{email}")
    public ResponseEntity<?> checkAuth(@PathVariable(name = "email") String email){
        Users user = usersServices.getUser(email);
        if(user != null){
            return ResponseEntity.ok(email);
        }
        return new ResponseEntity<>(email, HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/user/getAllUsers")
    public ResponseEntity<?> getAllUsers(){
        List<Users> usersList = usersServices.getAllUsers();
        System.out.println(usersList==null);
        if (usersList !=null){
            for (int i=0;i<usersList.size();i++){
                usersList.get(i).setPassword("");
            }
            return new ResponseEntity<>(usersList, HttpStatus.OK);
        }
        else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/user/getUser/{email}")
    public ResponseEntity<?> getUsers(@PathVariable(name = "email") String email){
        Users user = usersServices.getUser(email);

        if (user == null){
            return ResponseEntity.notFound().build();
        } else {
            user.setPassword("");
            return ResponseEntity.ok(user);
        }
    }

    @PostMapping("/user/addUser")
    public ResponseEntity<?> addUsers(@RequestBody Users user){
        usersServices.addUser(user);
        user.setPassword("");
        return ResponseEntity.ok(user);
    }

    @PutMapping("/user/saveUser")
    public ResponseEntity<?> saveUsers(@RequestBody Users user){
        usersServices.addUser(user);
        user.setPassword("");
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/user/deleteUser")
    public ResponseEntity<?> deleteUsers(@RequestBody Users user){
        Users checkUser = usersServices.getUser(user.getEmail());
        if (checkUser != null){
            for (Roles roles: user.getRoles()){
                if (roles.getRole().equals("ADMIN")){
                    usersServices.removeUsers(checkUser);
                    checkUser.setPassword("");
                    return ResponseEntity.ok(checkUser);
                }
            }
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/user/isadmin/{email}")
    public ResponseEntity<?> isAdmin(@PathVariable(name = "email") String email){
        Users user = usersServices.getUser(email);
        System.out.println(user.getEmail());
        if (user !=null){
            user.setPassword("");
            for (Roles roles: user.getRoles()){
                if (roles.getRole().equals("ADMIN")){
                    return ResponseEntity.ok(user);
                }
            }
        }
        System.out.println("Admin role not Found");
        return new ResponseEntity<>(user, HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/roles/getAllRoles")
    public ResponseEntity<?> getAllRoles(){
        List<Roles> rolesList = rolesService.getAllRoles();
        HttpStatus status = rolesList == null ? HttpStatus.NOT_FOUND:HttpStatus.OK;
        return new ResponseEntity<>(rolesList, status);
    }
}
