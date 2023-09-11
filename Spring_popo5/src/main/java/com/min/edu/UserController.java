package com.min.edu;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.min.edu.dto.UserVo;
import com.min.edu.model.service.IUserService;

@Controller
public class UserController {
	
	@Autowired
	private IUserService service;
	

	@GetMapping("/loginForm.do")
	public String loginForm() {
		return "loginForm";
	}
	
	@PostMapping("/login.do")
	@ResponseBody
	public String login(@RequestParam Map<String, Object> map, HttpSession session, HttpServletResponse response) throws IOException {
		response.setContentType("text/html; charset=UTF-8;");
		
		UserVo vo = service.getLogin(map);
		
		if(vo != null) {
			session.setAttribute("loginVo", vo);
			session.setMaxInactiveInterval(60*10);
			
			PrintWriter out = response.getWriter();
			out.println("<script>alert('로그인성공');location.href='list.do';</script>");
			out.flush();
			return null;
		}
		
		PrintWriter out = response.getWriter();
		out.println("<script>alert('로그인실패');location.href='loginForm.do';</script>");
		out.flush();
		
		return null;
	}
	
}
