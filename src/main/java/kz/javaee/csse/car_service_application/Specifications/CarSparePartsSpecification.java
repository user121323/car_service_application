package kz.javaee.csse.car_service_application.Specifications;

import kz.javaee.csse.car_service_application.Entities.Car;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarBrand;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarModel;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarRegion;
import kz.javaee.csse.car_service_application.Entities.CarSpareParts;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class CarSparePartsSpecification {

    public static Specification<CarSpareParts> getCarSparePartsByCarBrand(CarBrand carBrand){
        return new Specification<CarSpareParts>() {
            @Override
            public Predicate toPredicate(Root<CarSpareParts> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carBrand != null){
                    return criteriaBuilder.equal(root.get("carBrand"),carBrand);
                }
                return null;
            }
        };
    }
    public static Specification<CarSpareParts> getCarSparePartsByCarModel(CarModel carModel){
        return new Specification<CarSpareParts>() {
            @Override
            public Predicate toPredicate(Root<CarSpareParts> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carModel != null){
                    return criteriaBuilder.equal(root.get("carModel"),carModel);
                }
                return null;
            }
        };
    }
    public static Specification<CarSpareParts> getCarSparePartsByCarRegion(CarRegion carRegion){
        return new Specification<CarSpareParts>() {
            @Override
            public Predicate toPredicate(Root<CarSpareParts> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carRegion != null){
                    return criteriaBuilder.equal(root.get("carRegion"),carRegion);
                }
                return null;
            }
        };
    }
    public static Specification<CarSpareParts> getCarSparePartsByPriceFrom(CarSpareParts carSpareParts){
        return new Specification<CarSpareParts>() {
            @Override
            public Predicate toPredicate(Root<CarSpareParts> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (carSpareParts.getPrice() != null){
                    return criteriaBuilder.greaterThanOrEqualTo(root.get("price"),carSpareParts.getPrice());
                }
                return null;
            }
        };
    }
    public static Specification<CarSpareParts> getCarSparePartsByPriceTo(Long priceTo){
        return new Specification<CarSpareParts>() {
            @Override
            public Predicate toPredicate(Root<CarSpareParts> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (priceTo != null){
                    return criteriaBuilder.lessThanOrEqualTo(root.get("price"),priceTo);
                }
                return null;
            }
        };
    }
    public static Specification<CarSpareParts> getCarSparePartsByIsNew(Boolean isNew){
        return new Specification<CarSpareParts>() {
            @Override
            public Predicate toPredicate(Root<CarSpareParts> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                if (isNew != null){
                    return criteriaBuilder.equal(root.get("isNew"),isNew);
                }
                return null;
            }
        };
    }


    public static Specification<CarSpareParts> getAllCarSparePartsAfterFilter(final CarSpareParts carSpareParts,final  Long priceTo){
        Specification<CarSpareParts> specification = Specification
                .where(getCarSparePartsByCarBrand(carSpareParts.getCarBrand()))
                .and(getCarSparePartsByCarModel(carSpareParts.getCarModel()))
                .and(getCarSparePartsByCarRegion(carSpareParts.getCarRegion()))
                .and(getCarSparePartsByPriceFrom(carSpareParts))
                .and(getCarSparePartsByPriceTo(priceTo))
                .and(getCarSparePartsByIsNew(carSpareParts.getIsNew()));

        return specification;
    }
}
