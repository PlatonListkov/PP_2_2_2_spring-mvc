package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {

    void setCarList(List<Car> cars);

    List<Car> getCarList(int count);
}
