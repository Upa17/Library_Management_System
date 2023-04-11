package com.xfactor.openlibrary.controllers;

// import java.util.HashMap;

import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("/hello")
    public String hello(@RequestParam String name ,@RequestParam int number,@RequestParam float value ) {
        return "Hello Guys" +name+number+value ;
    }

    // @GetMapping("/Hi/{name}")
    // public String sayHi ( @PathVariable String name){
    //     return "HI " + name + " !!!!!" ;
    // }

    // @GetMapping("/Hi/{name}/{age}/{name}/{dept}/{roll}")
    // public HashMap<String ,String > hel (@PathVariable String name ,@PathVariable int  age, @PathVariable String dept, @PathVariableint rollno){

    //     HashMap<String,String>a =new HashMap<>();
    //     a .put("name",name);
    //     a .put("age",String.valueOf(age));
    //     a .put("name",dept);
    //     a .put("age",String.valueOf(rollno));
    //     return a;

}
    



