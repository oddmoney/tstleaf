package kr.co.etoursoft.tstleaf.exam.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class HomeController {

	/*
    @GetMapping("/")
    public ModelAndView indexPage() {
        ModelAndView modelAndView = new ModelAndView("index");

        List<String> datas = new ArrayList<>();
        datas.add("red");
        datas.add("orange");
        datas.add("yellow");

        modelAndView.addObject("message", "Test Exam");
        modelAndView.addObject("datas", datas);

        return modelAndView;
    }
    */

	@RequestMapping(value = "/", method=RequestMethod.GET) 
	public String goIndex(HttpServletRequest request) { 
		return "contents/index"; 
	}

	@RequestMapping(value = "/home", method=RequestMethod.GET) 
	public String goHome(HttpServletRequest request) { 
		return "contents/home"; 
	}

}
