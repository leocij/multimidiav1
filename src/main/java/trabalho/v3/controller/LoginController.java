package trabalho.v3.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView getIndex(HttpServletRequest request, HttpServletResponse response) {

		ModelAndView modelView = new ModelAndView("login");

		return modelView;
	}
}