package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> list = new ArrayList<>();

    {
        list.add(new Car(1, "Mercedes", "Bob"));
        list.add(new Car(2, "Honda", "Mike"));
        list.add(new Car(3, "Mazda", "Maria"));
        list.add(new Car(4, "Toyota", "Nick"));
        list.add(new Car(5, "Lada", "Paul"));
    }

    @Override
    public List<Car> getCars(int count) {
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
