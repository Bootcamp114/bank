package bank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/bank")
public class LoginController {

	@RequestMapping("/login")
	public String login() {

		return "Login";
	}

	@RequestMapping("/index")
	public String index() {

		return "Dashboard";
	}
}