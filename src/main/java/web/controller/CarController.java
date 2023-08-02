package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@ Controller
public class CarController {
    @GetMapping("/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        CarService carService = new CarServiceImpl();
        List<Car> cars = carService.getCars(count);
        List<String> messages = new ArrayList<>();
        for (Car car: cars) messages.add(car.toString());
        model.addAttribute("messages", messages);
        return "index";
    }

}