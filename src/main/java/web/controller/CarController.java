package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;


@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarDao carsDao;

    @Autowired
    public CarController(CarDao carsDao) {
        this.carsDao = carsDao;
    }


    @GetMapping()
    public String printAllCars(ModelMap model, @RequestParam(defaultValue = "5") int count) {
        model.addAttribute("list", carsDao.getCars(count));
        return "cars";
    }

}
