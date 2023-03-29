package com.mario;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mario.service.Service;

@Controller
public class DivideController {
	
	@RequestMapping("/divide")
	public ModelAndView add(@RequestParam("t1") float i, @RequestParam("t2") float j, HttpServletRequest request, HttpServletResponse response) {
		//float i = Float.parseFloat(request.getParameter("t1"));
		//float j = Float.parseFloat(request.getParameter("t2"));
		
		Service as = new Service();
		float k = as.divide(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		
		return mv;
	}

}
