package kz.javaee.csse.car_service_application.Services.Implementations;

import kz.javaee.csse.car_service_application.Entities.Roles;
import kz.javaee.csse.car_service_application.Repositories.RolesRepository;
import kz.javaee.csse.car_service_application.Services.RolesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RolesImpl implements RolesService {
    @Autowired
    private RolesRepository rolesRepository;


    @Override
    public List<Roles> getAllRoles() {
        return rolesRepository.findAll();
    }

    @Override
    public Roles addRoles(Roles roles) {
        return rolesRepository.save(roles);
    }

    @Override
    public void removeRoles(Roles roles) {
        rolesRepository.delete(roles);
    }

    @Override
    public Roles getRoles(long id) {
        Optional<Roles> opt = rolesRepository.findById(id);
        return opt.isPresent()?opt.get():null;
    }

}
