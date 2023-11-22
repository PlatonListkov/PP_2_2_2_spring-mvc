package web.service;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CarServiceImpl implements CarService {

    List<Car> carList;

    public CarServiceImpl() {
        carList = IntStream.range(1, 6)
                .mapToObj(i -> new Car(i, "Car " + i, this.hashCode() * i))
                .collect(Collectors.toList());
    }

    @Override
    public void setCarList(List<Car> cars) {
        carList = cars;
    }

    @Override
    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).toList();
    }
}
