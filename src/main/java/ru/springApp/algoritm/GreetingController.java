package ru.springApp.algoritm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@CrossOrigin
@RestController
public class GreetingController {

    private  GreetingService greetingService;

    @Autowired
    public GreetingController(GreetingService greetingService){
        this.greetingService = greetingService;
    }

    @GetMapping("/greeting")
    public Greeting getGreeting(@RequestParam(value = "content", defaultValue = "1 2 3") String content){
        return greetingService.getGreeting(content);
    }


}
