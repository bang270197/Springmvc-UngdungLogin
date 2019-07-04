package com.codegym.Controller;

import com.codegym.Model.Login;
import com.codegym.Model.User;
import com.codegym.Persistence.LoginPersistenceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.swing.plaf.PanelUI;

@Controller
public class ProductController {
    @GetMapping("/home")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("/login/home", "login", new Login());
        return modelAndView;
    }
    LoginPersistenceImpl loginPersistence=new LoginPersistenceImpl();


    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login")Login login ){
        User user =loginPersistence.checkLogin(login);
       if (user!=null){
          ModelAndView modelAndView=new ModelAndView("/login/user");
          modelAndView.addObject("user",user);
          return modelAndView;
       }else {
           ModelAndView modelAndView=new ModelAndView("/login/error-404");
           return modelAndView;
       }
    }
}
