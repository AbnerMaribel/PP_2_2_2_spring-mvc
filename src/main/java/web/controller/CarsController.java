package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    @GetMapping
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", 2015, "red"));
        cars.add(new Car("Lada", 2020, "green"));
        cars.add("Mercedes");
        cars.add("Ford");
        cars.add("Honda");
        model.addAttribute("cars", cars);
        return "cars";
    }

}
