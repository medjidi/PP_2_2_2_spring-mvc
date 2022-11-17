package web.service;

import org.springframework.stereotype.Service;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private List<Car> list;

    {
        Car car1 = new Car("Audi", 301, "A6");
        Car car2 = new Car("Kia", 302, "RIO");
        Car car3 = new Car("Mercedes", 303, "e100");
        Car car4 = new Car("BMW", 304, "M5");
        Car car5 = new Car("Lada", 305, "Kalina");
        list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
    }

    @Override
    public List<Car> getCars(int numbers) {
        return list.stream().limit(numbers).toList();
    }

}
