package br.com.qpainformatica.webforum;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

 @RequestMapping("/hello")
 public ModelAndView test() {
  String message = "Teste de Spring MVC 4 !!! - Prof. Elcio A.";
  return new ModelAndView("hello", "message", message);
 }
}
