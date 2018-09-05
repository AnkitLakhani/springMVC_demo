package crmClasses;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	String indexLoad(){
		return "redirect:/customer/list";
	}
}
