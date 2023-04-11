package spring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping(value="/hii")
	public ModelAndView test(HttpServletResponse response) throws IOException{
		System.out.println("hello");
		return new ModelAndView("home");
	}
}
  