package kz.javaee.csse.car_service_application.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class JwtResponse implements Serializable {
    public static final long serialVersionUID = 987654321L;
    private final String jwtToken;


    public JwtResponse(String jwtToken){
        this.jwtToken = jwtToken;
    }

    public String getJwtToken(){
        return this.jwtToken;
    }
}
