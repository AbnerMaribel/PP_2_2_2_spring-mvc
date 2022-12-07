package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(""))
    }

    @Override
    public List<Car> carList(int count) {
        List<Car> newList = null;
        for (int i = 0; i < count && i < 5; i++) {
            newList.add(cars.get(i));
        }
        return newList;
    }
}
