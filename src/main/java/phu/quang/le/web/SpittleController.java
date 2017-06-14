package phu.quang.le.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import phu.quang.le.data.SpittleRepository;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/spittles")
public class SpittleController {
	private SpittleRepository repository;
	
	@Autowired
	public SpittleController(SpittleRepository repository) {
		this.repository = repository; 
	}
	
	@RequestMapping(method=GET)
	public String spittles(Model model) {
		model.addAttribute("spittleList", repository.findSpittles(Long.MAX_VALUE, 20));
		return "spittles";
	}
}
