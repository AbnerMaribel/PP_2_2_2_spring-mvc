package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2015, "red"));
        cars.add(new Car("Lada", 2020, "green"));
        cars.add(new Car("Mercedes", 2005, "blue"));
        cars.add(new Car("Ford", 2000, "yellow"));
        cars.add(new Car("Honda", 2010, "black"));
    }

    @Override
    public List<Car> getCarList(int count) {
        List<Car> newList = new ArrayList<>();
        for (int i = 0; i < count && i < 5; i++) {
            newList.add(cars.get(i));
        }
        return newList;
    }
}
