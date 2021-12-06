package kz.javaee.csse.car_service_application.Services;

import kz.javaee.csse.car_service_application.Entities.CarAdvancedDetails.CarMedia;
import kz.javaee.csse.car_service_application.Entities.CarDetails.CarImage;

import java.util.List;

public interface CarMediaService {
    List<CarMedia> getAllCarMedia();
    CarMedia addCarMedia(CarMedia carMedia);
    void removeCarMedia(CarMedia carMedia);
    CarMedia getCarMedia(long id);
}
