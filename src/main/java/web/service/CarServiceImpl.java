package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    private static final List<Car> carsList = new ArrayList<>(List.of(
            new Car("Lada Priora", 1000, true),
            new Car("Lada Vesta", 2000, true),
            new Car("Lada Nevesta", 4000, false),
            new Car("Renault Logan", 5000, false),
            new Car("Peugeot", 10000, true)));

    @Override
    public List<Car> getCars(int amount) {
        List<Car> ret = new ArrayList<>();
        for (int i = 0; i < amount; i++) {
            if (i == carsList.size()) break;
            ret.add(carsList.get(i));
        }
        return ret;
    }

    @Override
    public List<Car> getAllCars() {
        return carsList;
    }
}
