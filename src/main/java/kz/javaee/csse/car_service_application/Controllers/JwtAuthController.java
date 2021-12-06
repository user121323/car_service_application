package kz.javaee.csse.car_service_application.Controllers;

import kz.javaee.csse.car_service_application.Entities.Users;
import kz.javaee.csse.car_service_application.Models.JwtRequest;
import kz.javaee.csse.car_service_application.Models.JwtResponse;
import kz.javaee.csse.car_service_application.Services.UsersServices;
import kz.javaee.csse.car_service_application.jwt.JwtTokenGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
public class JwtAuthController {

    @Autowired
    private JwtTokenGenerator jwtTokenGenerator;

    @Autowired
    private UsersServices userService;

    @Autowired
    private AuthenticationManager authenticationManager;


    @RequestMapping(value = "/auth")
    public ResponseEntity<?> auth(@RequestBody JwtRequest request) throws Exception{

        authenticate(request.getEmail(), request.getPassword());
        final UserDetails userDetails =
                userService.loadUserByUsername(request.getEmail());

        final String token = jwtTokenGenerator.generateToken(userDetails);

        return ResponseEntity.ok(new JwtResponse(token));

    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public ResponseEntity<?> register(@RequestBody Users user) throws Exception{
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));

        return ResponseEntity.ok(userService.addUser(user));
    }



    public void authenticate(String email, String password) throws Exception{

        try{

            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email, password));

        }catch (DisabledException e){
            throw new Exception("USER_DISABLED", e);
        }catch (BadCredentialsException e){
            throw new Exception("INVALID_CREDENTIALS", e);
        }

    }

}
