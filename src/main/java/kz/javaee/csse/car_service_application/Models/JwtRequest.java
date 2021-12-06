package kz.javaee.csse.car_service_application.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JwtRequest implements Serializable {

    public static final long serialVersionUID = 123456789L;
    private String email;
    private String password;

}
