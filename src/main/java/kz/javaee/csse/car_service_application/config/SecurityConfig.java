package kz.javaee.csse.car_service_application.config;

import kz.javaee.csse.car_service_application.Filteres.JwtRequestFilter;
import kz.javaee.csse.car_service_application.Services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, proxyTargetClass = true, securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private JwtAuthenticationEntryPoint jwtAuthenticationEntryPoint;

    @Autowired
    private JwtRequestFilter jwtRequestFilter;

    @Autowired
    private UsersServices userService;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        auth.userDetailsService(userService).passwordEncoder(passwordEncoder());
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception{
        return super.authenticationManagerBean();
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable().
                authorizeRequests().antMatchers("/auth","/register").permitAll()
                .antMatchers("/api/carBody/getAllCarBody").permitAll()
                .antMatchers("/api/carBrand/getAllCarBrand").permitAll()
                .antMatchers("/api/carColor/getAllCarColor").permitAll()
                .antMatchers("/api/carCountryOrigin/getAllCarCountryOrigin").permitAll()
                .antMatchers("/api/carDrive/getAllCarDrive").permitAll()
                .antMatchers("/api/carEngine/getAllCarEngine").permitAll()
                .antMatchers("/api/carImage/getAllCarImage").permitAll()
                .antMatchers("/api/carModel/getAllCarModel").permitAll()
                .antMatchers("/api/carModel/getAllCarModelByBrand/{brandId}").permitAll()
                .antMatchers("/api/carRegion/getAllCarRegion").permitAll()
                .antMatchers("/api/carSteeringWheel/getAllCarSteeringWheel").permitAll()
                .antMatchers("/api/carTransmission/getAllCarTransmission").permitAll()
                .antMatchers("/api/carSpareParts/getAllCarSpareByPoints/{priceTo}").permitAll()
                .antMatchers("/api/carSpareParts/getCarSpareParts/{id}").permitAll()
                .antMatchers("/api/car/getAllCars").permitAll()
                .antMatchers("/api/car/getAllCars/{engineCapacityTo}/{releaseYearTo}/{priceTo}").permitAll()
                .antMatchers("/api/car/getCar/{id}").permitAll()
                .antMatchers("/api/carMedia/getAllCarMedia").permitAll()
                .antMatchers("/api/carOptics/getAllCarOptics").permitAll()
                .antMatchers("/api/carOptions/getAllCarOptions").permitAll()
                .antMatchers("/api/carOutsides/getAllCarOutsides").permitAll()
                .antMatchers("/api/carSalon/getAllCarSalon").permitAll()
                .anyRequest().authenticated().and().cors().and()
                .exceptionHandling().authenticationEntryPoint(jwtAuthenticationEntryPoint).and().sessionManagement().
                sessionCreationPolicy(SessionCreationPolicy.STATELESS);

        http.addFilterBefore(jwtRequestFilter, UsernamePasswordAuthenticationFilter.class);
    }
}
