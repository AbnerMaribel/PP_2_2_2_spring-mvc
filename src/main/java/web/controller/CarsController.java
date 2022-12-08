package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;

@Controller
public class CarsController {
    private CarDaoImpl carDaoImpl = new CarDaoImpl();

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") Integer count, ModelMap model) {
        if(count > 5) {
            count = 5;
            model.addAttribute("cars", carDaoImpl.getCarList(count));
        } else {
            model.addAttribute("cars", carDaoImpl.getCarList(count));
        }
        return "cars";
    }

}
