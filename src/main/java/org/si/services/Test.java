package org.si.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/docker")
public class Test {
    @GetMapping
    public String index(){
        return "Hello Everybody !";
    }
}
