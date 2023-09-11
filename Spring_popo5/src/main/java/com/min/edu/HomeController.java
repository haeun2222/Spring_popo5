package com.min.edu;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.min.edu.dto.BoardDto;
import com.min.edu.model.service.IBoardService;

@Controller
public class HomeController {
	
	@Autowired
	private IBoardService service;

	
	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
	public String home(Model model) {
		
		List<BoardDto> lists = service.selectAll();
		model.addAttribute("lists",lists);
		return "home";
	}
}
