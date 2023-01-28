package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {
    private final static List<Car> carList = List.of(
            new Car("Renault Logan", "Black", 450000),
            new Car("Volga GAZ 31105", "White", 100000),
            new Car("BMW", "Red", 750000),
            new Car("Kia SportAge", "Gray", 900000),
            new Car("ZAZ", "Beige", 180000),
            new Car("Cherry Tiggo", "Blue", 240000));

    @Override
    public List<Car> getCountCars() {
        return new ArrayList<>(carList);
    }
}
