package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarService {
    private List<Car> cars;

    public CarService() {
        cars = new ArrayList<>();
        cars.add(new Car("KIA", "RIO", 2012));
        cars.add(new Car("LADA", "VESTA", 2020));
        cars.add(new Car("SKODA", "RAPID", 2010));
        cars.add(new Car("VOLKSWAGEN", "POLO", 2015));
        cars.add(new Car("LADA", "PRIORA", 2005));
    }

    public List<Car> getCars(int count) {
        if (count > cars.size()) {
            return cars;
        } else {
           return cars.subList(0, count);
        }
    }
}
