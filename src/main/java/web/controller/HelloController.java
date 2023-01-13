package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.dao.CarDao;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@Autowired
	private CarDao carDao;

	@GetMapping(value = "/")
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "index";
	}
	@RequestMapping(value = "/cars", method = {RequestMethod.GET, RequestMethod.POST})
	public String printCars(@RequestParam(defaultValue = "5") int count, Model model){
		model.addAttribute("cars", carDao.getCountCars(count));
		return "cars";
	}
}