package controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //Used to build REST APIs that return data directly in the response body.
public class EmployeeController {

    @GetMapping(path = "/getSecretMessage") //When someone sends GET request to this URL, run this method.
    public String getMySuperSecretMessage(){
        return "Secret message: Hello World";
    }
}
