package com.aks.eks.demo.ctrl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloCtrl {

    @GetMapping("/hello")
    public String sayHello(String name){
        return "Hello "+((name==null || name.isBlank())?"World!":(name+"!"));
    }

}
