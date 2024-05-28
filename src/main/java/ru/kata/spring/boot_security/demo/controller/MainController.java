package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ru.kata.spring.boot_security.demo.service.UserService;


@Controller

public class MainController {
    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "test")
    public String printTest(ModelMap model) {
        model.addAttribute("messages", userService.listUsers());
        return "mainPage";
    }

    @GetMapping(value = "add")
    public String printAdd() {
        return "add";
    }

    @PostMapping(value = "add")
    public String add(@RequestParam("username") String username,
                      @RequestParam("city") String city,
                      @RequestParam("age") Integer age) {
        userService.add(username, age, city);
        return "redirect:/test";
    }

    @GetMapping(value = "update")
    public String printUpdate() {
        return "update";
    }

    @PostMapping(value = "update")
    public String update(@RequestParam("username") String username,
                         @RequestParam("city") String city,
                         @RequestParam("age") Integer age,
                         @RequestParam("id") Long id) {
        userService.updateUser(username, age, city, id);
        return "redirect:/test";
    }

    @GetMapping(value = "delete")
    public String printDelete() {
        return "delete";
    }

    @PostMapping(value = "delete")
    public String delete(@RequestParam("id") Long id) {
        userService.delete(id);
        return "redirect:/test";
    }
}
