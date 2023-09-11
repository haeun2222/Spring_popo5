package com.min.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.min.edu.dto.BoardDto;
import com.min.edu.model.service.IBoardService;

@Controller
public class BoardController {

	@Autowired
	private IBoardService service;
	
	@GetMapping("/detail.do")
	public String detail(@RequestParam("seq") String id, Model model) {
		BoardDto dto = service.getOneBoard(id);
		model.addAttribute("dto",dto);
		return "detail";
	}
	
	
	@GetMapping("/writeForm.do")
	public String writeForm() {
		return "writeForm";
	}
	
	
	@RequestMapping(value = "/write.do", method = RequestMethod.POST)
	public String write(BoardDto BDto) {
		int n = service.writeBoard(BDto);
		return (n==1)?"redirect:/home.do":"redirect:/home.do";
		
	
	}
	
	
	@GetMapping(value = "/updateForm.do")
	public String updateForm() {
		
		return "updateForm";
	}
	
	
	
	
}
