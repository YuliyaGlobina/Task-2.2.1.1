package web.dao;

import web.model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {
    private final List<Car> cars;

    public CarDaoImpl() {
        cars = new ArrayList<>();
        cars.add(new Car("Renault Logan", "Black", 450000));
        cars.add(new Car("Volga GAZ 31105", "White", 100000));
        cars.add(new Car("BMW", "Red", 750000));
        cars.add(new Car("Kia SportAge", "Gray", 900000));
        cars.add(new Car("ZAZ", "Beige", 180000));
        cars.add(new Car("Cherry Tiggo", "Blue", 240000));
    }
    @Override
    public List<Car> getCountCars(int count) {
        if (count == 0) {
            return cars;
        } else {
            return cars.stream().limit(count).collect(Collectors.toList());
        }
    }
}
