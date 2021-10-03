package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.model.Role;
import web.model.User;
import web.service.UserService;

import javax.annotation.PostConstruct;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Controller
public class RegController {

    private UserService userService;

    public RegController() {
    }

    @Autowired
    public RegController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("user", new User());

        return "registration";
    }

    @PostMapping("/registration")
    public String createUser(@ModelAttribute("userFromForm") User userFromForm) {
        userFromForm.setRole(Collections.singleton(new Role(1L, "ROLE_USER")));
        userService.saveUser(userFromForm);
        return "redirect:/";
    }


    @PostConstruct
    private void initMethod() {
        Role adminRole = new Role("ROLE_ADMIN");
        Role userRole = new Role("ROLE_USER");
        Set<Role> roles = new HashSet<>();
        roles.add(adminRole);
        roles.add(userRole);
        User defaultUser = new User(1, "alextk", "Alexey", "Tkachenko", 43, "12345", roles);
        userService.saveUser(defaultUser);
    }
//
//    @GetMapping()
//    public String startPage() {
//        return "startpage";
//    }
}
