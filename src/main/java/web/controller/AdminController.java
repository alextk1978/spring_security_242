//package web.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import web.model.User;
//import web.service.UserService;
//
//@Controller
//@RequestMapping(value = "/admin")
//public class AdminController {
//    private UserService userService;
//
//    public AdminController() {
//    }
//
//    public AdminController(UserService userService) {
//        this.userService = userService;
//    }
//
//    @GetMapping()
//    public String getAdminPage(Model model) {
//        model.addAttribute("users", userService.getAllUsers());
//        return "admin_page";
//    }
//
//    @GetMapping("/{id}")
//    public String show(@PathVariable("id") long id, Model model) {
//        model.addAttribute("user", userService.getUserById(id));
//        return "user_page";
//    }
//
//    @GetMapping("/new")
//    public String newUser(@ModelAttribute("user") User user) {
//        return "/new";
//    }
//
//    @PostMapping()
//    public String create(@ModelAttribute("person") User user) {
//        userService.saveUser(user);
//        return "redirect:/";
//    }
//
//    @GetMapping("/edit/{id}")
//    public String edit(Model model, @PathVariable("id") long id) {
//        model.addAttribute("user", userService.getUserById(id));
//        return "/edit";
//    }
//
//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("user") User user, @PathVariable("id") long id) {
//        userService.updateUser(user, id);
//        return "redirect:/";
//    }
//
//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable("id") long id) {
//        userService.deleteUserById(id);
//        return "redirect:/";
//    }
//}
