package com.mario;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mario.service.Service;

@Controller
public class SubstractController {
	
	@RequestMapping("/substract")
	public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j, HttpServletRequest request, HttpServletResponse response) {
		//int i = Integer.parseInt(request.getParameter("t1"));
		//int j = Integer.parseInt(request.getParameter("t2"));
		
		Service as = new Service();
		int k = as.substract(i, j);
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result", k);
		
		return mv;
	}

}
