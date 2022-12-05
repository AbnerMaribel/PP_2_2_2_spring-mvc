package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarsController {

    public String getCars(ModelMap model) {
        List<String> cars = new ArrayList<>();
        cars.add("Toyota");
        cars.add("Lada");
        cars.add("Mercedes");
        cars.add("Ford");
        cars.add("Honda");
        model.addAttribute("cars", cars);
        return "cars";
    }
}
