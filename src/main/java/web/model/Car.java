package web.model;

import java.util.Objects;

public class Car {
    private final int id;
    private final String name;
    private final int vin;

    public Car(int id, String name, int vin) {
        this.id = id;
        this.name = name;
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", vin=" + vin +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id && vin == car.vin && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + vin;
        return result;
    }
}
