package com.webappform.webappform.Controllers;

import com.webappform.webappform.Models.User;
import com.webappform.webappform.Repositories.UserRepository;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class UserController {

  UserRepository userRepository;

  UserController(UserRepository userRepository){
    this.userRepository = userRepository;
  }

  @GetMapping("/")
  public String getUserForm(Model model) {
    model.addAttribute("userform", new User());
    return "userform";
  }

  @GetMapping("/users")
  public String getUsers( Model model) {
    model.addAttribute("userform", userRepository.findAll());
    return "result";
  }

  @PostMapping("/users")
  public String createUsers(@ModelAttribute User user, Model model) {
    userRepository.save(user);
    model.addAttribute("userform", userRepository.findAll());
    return "result";
  }

}
