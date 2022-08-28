package com.example.helloworld1.controller;

import com.example.helloworld1.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.parser.Entity;


@RestController
public class HelloWebController {
    @RequestMapping(value= {"","/","/home"})
    public String sayHello() {
        return "Hello From Bridgelabz!!";
    }
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name", defaultValue = "Chetan") String name) {
        return "Hello" + name + "!";
    }
    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello" + name + "!";
    }
    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() + "!";
    }
}
