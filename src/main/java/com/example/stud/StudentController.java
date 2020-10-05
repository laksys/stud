package com.example.stud;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@Controller("/")
@ResponseBody
public class StudentController {
    @GetMapping
    public String hello(){
        return "Hello @laksys!";
    }
    @GetMapping("/home")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("home.jsp");
        mv.addObject("myName", "lakshmanan p");
        return mv;
    }
}
