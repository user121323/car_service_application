package kz.javaee.csse.car_service_application.Specifications;

import kz.javaee.csse.car_service_application.Entities.Car;
import kz.javaee.csse.car_service_application.Entities.CarDetails.*;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Date;

public class CarSpecification {


    public static Specification<Car> getCarByPriceFrom(Car car){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (car.getPrice() != null){
                    return criteriaBuilder.greaterThanOrEqualTo(root.get("price"),car.getPrice());
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByPriceTo(Long priceto){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (priceto != null){
                    return criteriaBuilder.lessThanOrEqualTo(root.get("price"),priceto);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByReleaseDateFrom(Car car){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (car.getReleaseDate() != null){
                    return criteriaBuilder.greaterThanOrEqualTo(root.get("releaseDate"),car.getReleaseDate());
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByReleaseDateTo(Date releaseDateTo){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (releaseDateTo != null){
                    return criteriaBuilder.lessThanOrEqualTo(root.get("releaseDate"),releaseDateTo);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByEngineCapacityFrom(Car car){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (car.getEngineCapacity() != null){
                    return criteriaBuilder.greaterThanOrEqualTo(root.get("engineCapacity"),car.getEngineCapacity());
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByEngineCapacityTo(Float engineCapacity){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (engineCapacity != null){
                    return criteriaBuilder.lessThanOrEqualTo(root.get("engineCapacity"),engineCapacity);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByIsNew(Boolean isNew){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (isNew != null){
                    return criteriaBuilder.equal(root.get("isNew"),isNew);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByMileageTo(Long mileageto){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (mileageto != null){
                    return criteriaBuilder.lessThanOrEqualTo(root.get("mileage"),mileageto);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByCarBody(CarBody carBody){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carBody != null){
                    return criteriaBuilder.equal(root.get("carBody"),carBody);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByCarBrand(CarBrand carBrand){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carBrand != null){
                    return criteriaBuilder.equal(root.get("carBrand"),carBrand);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByCarModel(CarModel carModel){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carModel != null){
                    return criteriaBuilder.equal(root.get("carModel"),carModel);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByCarCountryOrigin(CarCountryOrigin carCountryOrigin){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carCountryOrigin != null){
                    return criteriaBuilder.equal(root.get("carCountryOrigin"),carCountryOrigin);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByCarColor(CarColor carColor){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carColor != null){
                    return criteriaBuilder.equal(root.get("carColor"),carColor);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByCarEngine(CarEngine carEngine){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carEngine != null){
                    return criteriaBuilder.equal(root.get("carEngine"),carEngine);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByCarDrive(CarDrive carDrive){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carDrive != null){
                    return criteriaBuilder.equal(root.get("carDrive"),carDrive);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByCarRegion(CarRegion carRegion){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carRegion != null){
                    return criteriaBuilder.equal(root.get("carRegion"),carRegion);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByCarSteeringWheel(CarSteeringWheel carSteeringWheel){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carSteeringWheel != null){
                    return criteriaBuilder.equal(root.get("carSteeringWheel"),carSteeringWheel);
                }
                return null;
            }
        };
    }
    public static Specification<Car> getCarByCarTransmission(CarTransmission carTransmission){
        return new Specification<Car>() {
            @Override
            public Predicate toPredicate(Root<Car> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carTransmission != null){
                    return criteriaBuilder.equal(root.get("carTransmission"),carTransmission);
                }
                return null;
            }
        };
    }

    public static Specification<Car> filterCars(final Car car, final Float engineCapacityTo, final Date releaseYearTo, final Long priceTo) {
        Specification<Car> specification = Specification
                .where(getCarByPriceFrom(car))
                .and(getCarByPriceTo(priceTo))
                .and(getCarByReleaseDateFrom(car))
                .and(getCarByReleaseDateTo(releaseYearTo))
                .and(getCarByEngineCapacityFrom(car))
                .and(getCarByEngineCapacityTo(engineCapacityTo))
                .and(getCarByIsNew(car.getIsNew()))
                .and(getCarByMileageTo(car.getMileage()))
                .and(getCarByCarBody(car.getCarBody()))
                .and(getCarByCarBrand(car.getCarBrand()))
                .and(getCarByCarModel(car.getCarModel()))
                .and(getCarByCarCountryOrigin(car.getCarCountryOrigin()))
                .and(getCarByCarColor(car.getCarColor()))
                .and(getCarByCarEngine(car.getCarEngine()))
                .and(getCarByCarDrive(car.getCarDrive()))
                .and(getCarByCarRegion(car.getCarRegion()))
                .and(getCarByCarSteeringWheel(car.getCarSteeringWheel()))
                .and(getCarByCarTransmission(car.getCarTransmission()));


        return specification;
    }


}
